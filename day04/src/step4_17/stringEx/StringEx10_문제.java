package step4_17.stringEx;

import java.util.Scanner;

// 끝말잇기

public class StringEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String start = "자전거";
		
		while (true) {
			System.out.println("제시어 : " + start);
			String input = scan.next();
			if (start.charAt(start.length() - 1) == input.charAt(0)) {
				start = input;
			}
			else {
				System.out.println("틀렸습니다.");
				break;
			}
		}
	}
}
