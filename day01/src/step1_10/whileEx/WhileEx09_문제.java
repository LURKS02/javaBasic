package step1_10.whileEx;
import java.util.Scanner;

//atm - 2단계

public class WhileEx09_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 이체");
			System.out.println("4. 조회");
			System.out.println("0. 종료");
			
			System.out.println("메뉴 선택");
			
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("입금할 금액을 입력하세요.");
				int cash = scan.nextInt();
				myMoney += cash;
				System.out.println("입금 완료, 잔액 : " + myMoney);
			}
			
			else if (sel == 2) {
				System.out.println("출금할 금액을 입력하세요.");
				int withdraw = scan.nextInt();
				if(myMoney < withdraw) System.out.println("잔액이 부족합니다.");
				else {
					myMoney -= withdraw;
					System.out.println("출금 완료, 잔액 : " + myMoney);
				}
			}
			
			else if (sel == 3) {
				System.out.println("이체할 계좌를 입력하세요.");
				int inputAcc = scan.nextInt();
				if (inputAcc != yourAcc) System.out.println("계좌 오류");
				else {
					System.out.println("이체할 금액을 입력하세요.");
					int withdraw = scan.nextInt();
					if (myMoney < withdraw) System.out.println("잔액이 부족합니다.");
					else {
						myMoney -= withdraw;
						yourMoney += withdraw;
						System.out.println("이체 완료, 내 잔액 : " + myMoney + ", 상대 잔액 : " + yourMoney);
					}
				}
			}
			else if (sel == 4) {
				System.out.println("내 잔액 : " + myMoney + ", 상대 잔액 : " + yourMoney);
			}
			else {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}
