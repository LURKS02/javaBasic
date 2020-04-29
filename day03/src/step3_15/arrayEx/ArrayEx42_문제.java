package step3_15.arrayEx;
import java.util.Scanner;

// 쇼핑몰 - 장바구니

public class ArrayEx42_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] cart = new int[MAX_SIZE][2];
		
		int count = 0;
		String[] items = {"사과", "바나나", "딸기"};
		int log = -1;
		
		while(true) {
			
			System.out.println("[MEGA MART] 1.로그인  2.로그아웃  3.쇼핑  4.장바구니  0.종료");
			System.out.print("메뉴 선택 : ");
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (log != -1) {
					System.out.println("이미 로그인된 상태입니다.");
					continue;
				}
				System.out.println("로그인할 아이디와 비밀번호를 입력하세요.");
				String inputlog = scan.next();
				String inputpw = scan.next();
				
				for (int i = 0; i < 3; i++) {
					if (ids[i].compareTo(inputlog) == 0) {
						if (pws[i].compareTo(inputpw) == 0) {
							log = i;
							System.out.println("로그인 되었습니다.");
						}
					}
				}
				if (log == -1) System.out.println("계정 정보가 틀립니다.");
			}
			
			else if(sel == 2) {
				if (log == -1) System.out.println("로그인 상태가 아닙니다.");
				else {
					System.out.println("로그아웃 되었습니다.");
					log = -1;
				}
			}
			
			else if(sel == 3) {
				System.out.println("상품 목록");
				for (int i = 0; i < 3; i++) {
					System.out.println(i + ") " + items[i]);
				}
				if (count == 100) {
					System.out.println("장바구니 목록이 꽉 차서 물건을 담을 수 없습니다.");
					continue;
				}
				System.out.println("장바구니에 담을 상품을 선택하세요.");
				int pick = scan.nextInt();
				cart[count][0] = log;
				cart[count][1] = pick;
				count++;
				System.out.println("장바구니에 상품을 담았습니다.");
			}
			
			else if(sel == 4) {
				System.out.println("장바구니를 출력합니다.");
				for (int i = 0; i < count; i++) {
					System.out.println(ids[cart[i][0]] + "회원        > " + items[cart[i][1]] + " 구매");
				}
			}
			
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}	
		}
	}
}
