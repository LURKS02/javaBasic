package step1_06.ifEx;

import java.util.Scanner;

//로그인 - 2단계
//Id와 Pw를 입력받아 회원가입을 진행한다.
//이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
//가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
//ex. 로그인 성공 or 로그인 실패

public class IfEx05_문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.println("회원가입을 진행합니다.");
		System.out.println("Id를 입력해주세요.");
		dbId = scan.nextInt();
		System.out.println("Pw를 입력해주세요.");
		dbPw = scan.nextInt();
		System.out.println("회원가입이 완료되었습니다.");
		
		System.out.println("로그인을 진행합니다.");
		
		System.out.println("Id를 입력해주세요.");
		int inputId = scan.nextInt();
		System.out.println("Pw를 입력해주세요.");
		int inputPw = scan.nextInt();
		
		if(dbId == inputId && dbPw == inputPw) {
			System.out.println("로그인 성공");
		}
		
		else {
			System.out.println("로그인 실패");
		}

	}

}
