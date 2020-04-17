package step1_06.ifEx;

import java.util.Scanner;

//영수증 출력 - 1단계

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
