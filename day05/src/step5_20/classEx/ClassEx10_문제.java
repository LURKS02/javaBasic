package step5_20.classEx;

import java.util.Scanner;

// 영수증 출력하기 : 클래스 + 변수

class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}

public class ClassEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex10 e = new Ex10();
		
		while(true) {
			System.out.println("==============");
			System.out.println("메뉴 선택 : [1]주문 [2]종료");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("어떤 메뉴를 주문하시겠습니까?");
				for (int i = 0; i < e.arMenu.length; i++) {
					System.out.println("[" + (i + 1) + "] " + e.arMenu[i]);
				}
				int input = scan.nextInt();
				if (input > 0 && input <= e.arMenu.length) {
					System.out.println("주문되었습니다.");
					e.arCount[input - 1]++;
				}
				else {
					System.out.println("입력 오류");
				}
			}
			
			else {
				System.out.println("금액을 입력해주세요.");
				int money = scan.nextInt();
				int total = 0;
				for (int i = 0; i < e.arMenu.length; i++) total += e.arPrice[i]*e.arCount[i];
				if (total > money) { System.out.println("잔액이 부족합니다."); break; }
				
				System.out.println("==============");
				for (int i = 0; i < e.arMenu.length; i++) {
					System.out.println(e.arMenu[i] + " : " + e.arCount[i] + "개\t" + e.arPrice[i]*e.arCount[i] + "원");
				}
				System.out.println("합계금액 : " + total + "원");
				System.out.println("받은금액 : " + money + "원");
				System.out.println("==============");
				System.out.println("잔돈 : " + (money - total) + "원");
				break;
			}
		}

	}

}
