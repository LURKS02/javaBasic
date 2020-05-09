package step4_17.stringEx;

import java.util.Scanner;
import java.util.Random;

// 타자연습 [1단계]

public class StringEx11_문제 {

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
			System.out.println("문제 : " + words[i]);
			String input = scan.next();
			if (words[i].compareTo(input) == 0) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("틀렸습니다.");
				i--;
			}
		}
	}
}
