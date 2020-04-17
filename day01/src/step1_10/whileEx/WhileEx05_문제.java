package step1_10.whileEx;

import java.util.Scanner;

//영수증 출력 - 2단계

public class WhileEx05_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 1000;
		int price2 = 2000;
		int price3 = 3000;
		
		System.out.println("1번 메뉴 : " + price1 + "원");
		System.out.println("2번 메뉴 : " + price2 + "원");
		System.out.println("3번 메뉴 : " + price3 + "원");
		
		int i = 1;
		int total = 0;
		int num1 = 0;
		int num2 = 0; 
		int num3 = 0;
		
		while (i <= 5) {
			System.out.println("메뉴 선택");
			int menu = scan.nextInt();
			if (menu == 1) {
				total += price1;
				num1++;
			}
			else if (menu == 2) {
				total += price2;
				num2++;
			}
			else {
				total += price3;
				num3++;
			}
			i++;
		}
		
		System.out.println("현금을 입력해주세요.");
		int cash = scan.nextInt();
		int change = cash - total;
		
		System.out.println("1번 메뉴 " + num1 + "개");
		System.out.println("2번 메뉴 " + num2 + "개");
		System.out.println("3번 메뉴 " + num3 + "개");
		System.out.println("총 금액 : " + total + "원");
		System.out.println("잔돈 : " + change + "원");
		
	}

}
