package step1_06.ifEx;

//로그인 - 3단계
//Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
//Id가 틀린 경우, 메세지를 출력한다.
//Pw가 틀린 경우, 메세지를 출력한다.
//Id와 Pw 모두 일치하는 경우, 메세지를 출력한다.

import java.util.Scanner;

public class IfEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.println("Id 입력");
		int inputId = scan.nextInt();
		
		if (inputId == dbId) {
			System.out.println("Pw 입력");
			int inputPw = scan.nextInt();
			
			if (dbPw != inputPw) System.out.println("Pw를 확인해주세요.");
			else System.out.println("로그인 성공");
		}
		
		else System.out.println("Id를 확인해주세요.");
		
	}
}
