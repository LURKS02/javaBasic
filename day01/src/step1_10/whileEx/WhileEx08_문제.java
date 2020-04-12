package step1_10.whileEx;
import java.util.Scanner;

//ATM - 2단계
//로그인 후 재 로그인 불가
//로그아웃 상태에서만 이용 가능
//로그아웃은 로그인 상태에서만 이용 가능

public class WhileEx08_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;
		boolean run = true;
		
		while(run) {
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("0. 종료");
			
			System.out.println("메뉴 선택");
			int sel = scan.nextInt();
			
			if (sel == 1) {
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
			
			else if (sel == 2) {
				if (log > 0) {
					System.out.println("로그아웃 합니다.");
					log = -1;
				}
				else System.out.println("로그인 상태에서만 가능합니다.");
			}
			
			else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
