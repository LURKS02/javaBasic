package step1_09.print;

//출력문의 종류
/*
 * 1. System.out.println();
 * 줄바꿈 가능 (ln = 줄바꿈)
 * 
 * 2. System.out.print();
 * 줄바꿈 불가
 * 
 * 3. System.out.printf();
 * 서식문자 출력
 * %d = 정수 / %f = 소수 / %c = 문자 1개 / %s = 문자 여러개
 * 
 */

public class PrintEx03 {

	public static void main(String[] args) {
		
		System.out.println("안녕하세요.");
		//줄바꿈
		
		System.out.print("안녕"); //줄바꿈 X
		System.out.println("하세요.");
		
		/* 이스케이프 문자
		 * \n = 줄바꿈
		 * \t = tab
		 * \" = "
		 * \' = '
		 */

		System.out.println("안녕\n하세요."); //줄바꿈
		System.out.println("안녕\t하세요."); //탭
		System.out.println("\"안녕하세요.\"");
		System.out.println("\'안녕하세요.\'");
		
	}

}
