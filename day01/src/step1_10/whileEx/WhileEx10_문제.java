package step1_10.whileEx;

import java.util.Scanner;

//atm - 2단계

public class WhileEx10_문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log = -1;
		boolean run = true;
		
		while(run) {
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 조회");
			System.out.println("0. 종료");
			
			System.out.println("메뉴 선택");
			int sel = scan.nextInt();
			
			if (sel == 1) {				//로그인
				if (log > 0) System.out.println("이미 로그인 상태입니다.");
				else {
					System.out.println("아이디와 비밀번호를 입력해주세요.");
					int inputAcc = scan.nextInt();
					int inputPw = scan.nextInt();
					if (inputAcc == dbAcc1 && inputPw == dbPw1) {
						log = 1; //dbAcc1 로그인
						System.out.println("dbAcc1 로그인 되었습니다.");			
					}
					else if (inputAcc == dbAcc2 && inputPw == dbPw2) {
						log = 2; //dbAcc2 로그인
						System.out.println("dbAcc2 로그인 되었습니다.");
					}
					else {
						System.out.println("접속 불가");
						run = false;
					}
				}
			}
			
			
			else if (sel == 2) {		//로그아웃
				if (log > 0) {
					System.out.println("로그아웃 합니다.");
					log = -1;
				}
				else System.out.println("로그인 상태에서만 가능합니다.");
			}
			
			
			else if (sel == 3) {		//입금
				if (log == 1) {
					System.out.println("입금할 금액을 입력하세요.");
					int cash = scan.nextInt();
					dbMoney1 += cash;
					System.out.println("입금 완료, 잔액 : " + dbMoney1);
				}
				else if (log == 2) {
					System.out.println("입금할 금액을 입력하세요.");
					int cash = scan.nextInt();
					dbMoney2 += cash;
					System.out.println("입금 완료, 잔액 : " + dbMoney2);
				}
				else System.out.println("로그인 상태에서만 가능합니다.");
			}
			
			
			else if (sel == 4) {		//출금
				if (log == 1) {
					System.out.println("출금할 금액을 입력하세요.");
					int withdraw = scan.nextInt();
					if(dbMoney1 < withdraw) System.out.println("잔액이 부족합니다.");
					else {
						dbMoney1 -= withdraw;
						System.out.println("Acc " + log + "번 출금 완료, 잔액 : " + dbMoney1);
					}
				}
				else if (log == 2) {
					System.out.println("출금할 금액을 입력하세요.");
					int withdraw = scan.nextInt();
					if(dbMoney2 < withdraw) System.out.println("잔액이 부족합니다.");
					else {
						dbMoney2 -= withdraw;
						System.out.println("Acc " + log + "번 출금 완료, 잔액 : " + dbMoney2);
					}
				}
				else System.out.println("로그인 상태에서만 가능합니다.");
			}
			
			
			else if (sel == 5) {		//이체
				if (log == 1) {
					System.out.println("이체할 계좌를 입력하세요.");
					int inputAcc = scan.nextInt();
					if (inputAcc != dbAcc2) System.out.println("계좌 오류");
					else {
						System.out.println("이체할 금액을 입력하세요.");
						int withdraw = scan.nextInt();
						if (dbMoney1 < withdraw) System.out.println("잔액이 부족합니다.");
						else {
							dbMoney1 -= withdraw;
							dbMoney2 += withdraw;
							System.out.println("이체 완료, 1번 잔액 : " + dbMoney1 + ", 2번 잔액 : " + dbMoney2);
						}
					}
				}
				else if (log == 2) {
					System.out.println("이체할 계좌를 입력하세요.");
					int inputAcc = scan.nextInt();
					if (inputAcc != dbAcc1) System.out.println("계좌 오류");
					else {
						System.out.println("이체할 금액을 입력하세요.");
						int withdraw = scan.nextInt();
						if (dbMoney2 < withdraw) System.out.println("잔액이 부족합니다.");
						else {
							dbMoney2 -= withdraw;
							dbMoney1 += withdraw;
							System.out.println("이체 완료, 1번 잔액 : " + dbMoney1 + ", 2번 잔액 : " + dbMoney2);
						}
					}
				}
				else System.out.println("로그인 상태에서만 가능합니다.");
			}
			
			
			else if (sel == 6) {		//조회
				System.out.println("1번 잔액 : " + dbMoney1 + ", 2번 잔액 : " + dbMoney2);
			}
			else {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}
