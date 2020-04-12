package step1_08.ifEx;

import java.util.Scanner;

public class IfEx15_문제2 {

	public static void main(String[] args) {
		int cash = 20000;
		int balance = 30000;
		int account = 11111;
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ATM 서비스");
		System.out.println("1.로그인   2.종료");
		int select = scan.nextInt();
		
		if (select == 1) {
			System.out.println("계좌와 비밀번호를 입력하세요.");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			
			if (acc == account && pw == password) {
				System.out.println("1.입금   2.출금   3.조회");
				select = scan.nextInt();
				if (select == 1) {
					System.out.println("입금할 금액을 입력하세요.");
					int deposit = scan.nextInt();
					if (deposit > cash) System.out.println("금액이 부족합니다.");

					else {
						cash -= deposit;
						balance += deposit;
						System.out.println("잔액 : cash = " + cash + " balance = " + balance);
					}
				}
				else if (select == 2) {
					System.out.println("출금할 금액을 입력하세요.");
					int withdraw = scan.nextInt();
					if (withdraw > balance) System.out.println("금액이 부족합니다.");
					else {
						cash += withdraw;
						balance -= withdraw;
						System.out.println("잔액 : cash = " + cash + " balance = " + balance);
					}
				}
				else System.out.println("조회 : " + balance + "원");
				
			}
			else System.out.println("아이디와 패스워드를 확인해주세요.");
		}
		else System.out.println("종료");

	}

}
