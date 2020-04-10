package step1_06.ifEx;

import java.util.Scanner;

//구구단 게임
//구구단 문제를  출제하기 위해 숫자 2개를 입력받는다.
//입력받은 숫자로 구구단 문제를 출력한다.

//정답을 입력받아 비교한다.
//정답 or 오답

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
