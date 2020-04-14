package step2_11.arrayEx;

import java.util.Scanner;

//영화관 좌석예매
//사용자로부터 좌석 index를 입력받아 예매
//예매된 좌석 값은 1, 재구매 불가
//한 좌석의 예매 가격은 12000
//영화관의 총 매출액 출력

public class ArrayEx09_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[7];
		int money = 0;
		
		while(true) {
			System.out.println("1. 좌석 예매      2. 종료");
			System.out.println("메뉴 선택");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("좌석 번호를 입력하세요.");
				System.out.print("seat = ");
				for (int i = 0; i < 7; i++) System.out.print(seat[i] + " ");
				
				int index = scan.nextInt();
				if (seat[index] == 1) System.out.println("이미 예약된 좌석입니다.");
				else {
					seat[index] = 1;
					money += 12000;
					System.out.println("예약 완료");
				}
			}
			else {
				System.out.println("매출액은 " + money + "원 입니다.");
				break;
			}
		}
	}
}
