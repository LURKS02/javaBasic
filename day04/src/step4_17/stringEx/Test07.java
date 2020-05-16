package step4_17.stringEx;

import java.util.Random;
import java.util.Scanner;

// 문제 : 영어단어 맞추기  

public class Test07 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int checks = 0;
		int check[] = new int[size];
		
		while (true) {
			if (checks == size) {
				System.out.println("정답을 맞추지 못했습니다.");
				System.out.println("정답 : " + word);
				System.out.println("점수 : 0점");
				break;
			}
			
			System.out.print("문제 : ");
			for (int i = 0; i < word.length(); i++) {
				if (check[i] == 0) System.out.print("*");
				else System.out.print(word.charAt(i));
			}
			System.out.println();
			System.out.println("뜻 : " + meaning);
			
			System.out.println("답은 ?");
			String input = scan.next();
			if (!input.equals(word)) {
				System.out.println("정답이 아닙니다.");
				score -= 5;
				while(true) {
					int num = ran.nextInt(size);
					if (check[num] == 1) continue;
					else {
						for (int i = 0; i < size; i++) {
							if (word.charAt(num) == word.charAt(i)) {
								check[i] = 1;
								checks++;
							}
						}
						break;
					}
				}
			}
			else {
				System.out.println("정답입니다.");
				System.out.println("점수 : " + score);
				break;
			}
		}
	}
}
