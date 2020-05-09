package step4_17.stringEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # 타자연습 게임[2단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
 * 예)
 * 문제 : mys*l
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : *sp
 * 입력 : jsp
 * ...
 */

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
