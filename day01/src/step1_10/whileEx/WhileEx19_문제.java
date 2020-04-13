package step1_10.whileEx;

//반복문 for
/*
 * 반복문의 구성 요소 : 초기식 + 조건식 + 증감식
 * 
 * for문의 구조
 * for(초기식;조건식;증감식){
 * 		조건식이 참일 동안 실행할 문장
 * }
 * 
 * for문 실행 순서
 * 초기식 > 조건식 > 실행문 > 증감식 > 조건식 > 실행문 > 증감식 ...
 * 
 */

public class WhileEx19_문제 {

	public static void main(String[] args) {
		//1-5까지 출력
		int x = 1;
		while(x <= 5) {
			System.out.println(x);
			x++;
		}
		
		System.out.println();
		
		for (int y = 1; y <= 5; y++) System.out.println(y);
		
		System.out.println();
		
		//문제1 : 1부터 5까지 출력
		for (int i = 1; i <= 5; i++) System.out.print(i + " ");
		System.out.println();
		
		//문제2 : 1부터 10까지 반복하여 5~9 출력
		for (int j = 1; j <= 10; j++) {
			if (j>= 5 && j <= 9) System.out.print(j + " ");
		}
		System.out.println();
		
		//문제3 : 1부터 10까지 반복해 6~3 출력
		for (int k = 1; k <= 10; k++) {
			if (k >= 4 && k <= 7) System.out.print((10 - k) + " ");
		}
		System.out.println();
		
		//문제4 : 1부터 10까지 반복해 3미만 7이상 출력
		for (int m = 1; m <= 10; m++) {
			if (m < 3 || m >= 7) System.out.print(m + " ");
		}
		System.out.println();

	}

}
