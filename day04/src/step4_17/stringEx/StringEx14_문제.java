package step4_17.stringEx;

import java.util.Scanner;

// 문자열 속 숫자검사

public class StringEx14_문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		
		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		int cnt = 0;
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < 10; j++) {
				if (text.charAt(i) == charNum[j]) cnt++;
			}
		}
		if (cnt == text.length()) System.out.println("숫자만 있다.");
		else if (cnt == 0) System.out.println("문자만 있다.");
		else {
			System.out.println("문자와 숫자가 섞여있다.");
		}
	}
}
