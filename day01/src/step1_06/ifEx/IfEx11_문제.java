package step1_06.ifEx;

import java.util.Scanner;

//영수증 출력 - 1단계
//메뉴판 출력
//주문하고자 하는 메뉴의 번호를 입력
//현금을 입력
//입력받은 현금과 메뉴 가격을 확인해 영수증 출력
//현금이 부족한 경우 메세지를 출력한다.

public class IfEx11_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("메뉴판");
		System.out.println("1번 : " + price1);
		System.out.println("2번 : " + price2);
		System.out.println("3번 : " + price3);
		
		System.out.println("메뉴를 입력해주세요.");
		int orderNum = scan.nextInt();
		
		System.out.println("지불하실 금액을 입력해주세요.");
		int orderPrice = scan.nextInt();
		
		if (orderNum == 1) {
			if (orderPrice >= price1) {
				System.out.println("주문되었습니다.");
				System.out.println("잔돈 : " + (orderPrice - price1));
			}
			else System.out.println("현금이 부족합니다.");
		}
		
		if (orderNum == 2) {
			if (orderPrice >= price2) {
				System.out.println("주문되었습니다.");
				System.out.println("잔돈 : " + (orderPrice - price2));
			}
			else System.out.println("현금이 부족합니다.");
		}
		
		if (orderNum == 3) {
			if (orderPrice >= price3) {
				System.out.println("주문되었습니다.");
				System.out.println("잔돈 : " + (orderPrice - price3));
			}
			else System.out.println("현금이 부족합니다.");
		}
		
	}

}
