package step1_06.ifEx;

//조건문 : if , switch-case
//반복문 : for, while, do-while
//보조 제어문 : break, continue

//if
//if(조건식){ 조건이 참일 때 실행할 문장 }

public class IfEx01_문제 {

	public static void main(String[] args) {
		if(true) {
			System.out.println("실행 O");
		}

		if(false) {
			System.out.println("실행 X");	
		}
		
		//ex) 홀짝
		int num = 8;
		System.out.println(num % 2 == 0);
		System.out.println(num % 2 == 1);
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		if(num % 2 == 1) {
			System.out.println("홀수");
		}
		
		//문제 1) 양수, 0, 음수 출력
		num = -10;
		if (num > 0) {
			System.out.println("양수");
		}
		if (num == 0) {
			System.out.println("0");
		}
		if (num < 0) {
			System.out.println("음수");
		}
		
		
		//문제 2) 4의 배수 출력
		num = 12;
		if (num % 4 == 0) {
			System.out.println("4의 배수");
		}
		
		//문제 3) 합격, 불합격 출력
		int score = 87;
		if (score >= 60) {
			System.out.println("합격");
		}
		if (score < 60) {
			System.out.println("불합격");
		}
		
	}

}
