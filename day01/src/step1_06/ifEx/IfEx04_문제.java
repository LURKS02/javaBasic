package step1_06.ifEx;

import java.util.Scanner;

//로그인 - 1단계
//ID와 PW를 입력받는다.
//입력받은 데이터와 DB를 비교해 로그인 처리를 진행한다.
//ex. 로그인 성공 or 로그인 실패

public class IfEx04_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.println("Id를 입력하세요.");
		int inputId = scan.nextInt();
		
		System.out.println("Pw를 입력하세요.");
		int inputPw = scan.nextInt();
		
		if(dbId == inputId && dbPw == inputPw) {
			System.out.println("로그인 성공");
		}

		else {
			System.out.println("로그인 실패");
		}
	}

}
