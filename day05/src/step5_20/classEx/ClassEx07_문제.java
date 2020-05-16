package step5_20.classEx;

import java.util.Scanner;

// 영화관 좌석예매 : 클래스 + 변수

class Ex07{
	int[] seat = new int[7];
	int money = 0;
}

public class ClassEx07_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex07 e = new Ex07();
		
		while(true) {
			
			System.out.println("영화관 프로그램");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("seat = ");
				for (int i = 0; i < e.seat.length; i++) System.out.print(e.seat[i] + " ");
				System.out.println();
				
				System.out.println("좌석 선택");
				int inputind = scan.nextInt();
				if (e.seat[inputind] == 1) System.out.println("이미 예매된 좌석입니다.");
				else {
					e.seat[inputind] = 1;
					e.money += 12000;
					System.out.print("seat = ");
					for (int i = 0; i < e.seat.length; i++) System.out.print(e.seat[i] + " ");
					System.out.println();
				}
				
			}
			else if(sel == 2) {
				System.out.println("매출액 : " + e.money);
				break;
			}
		}

	}

}
