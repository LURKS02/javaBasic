package step1_06.ifEx;

import java.util.Scanner;

//구구단 게임

public class IfEx06_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int answer = num1 * num2;
		
		System.out.println("문제 : " + num1 + " X " + num2 + " = ?");
		int input = scan.nextInt();
		
		if (answer == input) {
			System.out.println("정답!");
		}
		else {
			System.out.println("오답!");
		}
	}
}
