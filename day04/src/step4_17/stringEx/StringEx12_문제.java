package step4_17.stringEx;

import java.util.Scanner;
import java.util.Random;

// 타자연습 [2단계]

public class StringEx12_문제 {

	public static void main(String[] args) {

		String[] words = {"java", "mysql", "jsp", "spring"};
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		// 셔플
		for (int i = 0; i < 1000; i++) {
		int r = ran.nextInt(words.length);
			
		String temp = words[0];
		words[0] = words[r];
		words[r] = temp;
		}
		
		for (int i = 0; i < words.length; i++) {
			int k = ran.nextInt(words[i].length());
			String temp = words[i].substring(0,k) + "*" + words[i].substring(k + 1);
			System.out.println("문제 : " + temp);
			
			String input = scan.next();
			if (input.equals(words[i])) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("오답입니다.");
				i--;
			}
		}
		
	}
}
