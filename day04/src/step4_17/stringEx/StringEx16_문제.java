package step4_17.stringEx;

import java.util.Scanner;

// 단어 검색

public class StringEx16_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.println("검색할 단어 입력");
		String word = scan.next();
		
		char[] chs = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			chs[i] = text.charAt(i);
		}
		char[] inputs = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			inputs[i] = word.charAt(i);
		}
		
		int check = 0;
		
		for (int i = 0; i < text.length() - word.length() + 1; i++) {
			int cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if (chs[i + j] == inputs[j]) cnt++;
			}
			if (cnt == word.length()) check = 1;
		}
		
		if (check == 1) System.out.println("true");
		else System.out.println("false");

	}

}
