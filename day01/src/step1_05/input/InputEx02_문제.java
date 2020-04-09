package step1_05.input;

import java.util.Scanner;

public class InputEx02_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//문제1) 숫자 2개를 입력받아 합을 출력
		System.out.println("숫자1을 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자2를 입력하세요.");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("합 : " + sum);
		
		//문제2) 숫자 1개를 입력받아 홀수이면 true 출력
		System.out.println("숫자를 입력하세요.");
		int val = scan.nextInt();
		System.out.println(val%2 == 1);
		
		//
		//문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적을 입력하세요.");
		int score = scan.nextInt();
		System.out.println(score >= 60 && score <= 100);
		
	}

}
