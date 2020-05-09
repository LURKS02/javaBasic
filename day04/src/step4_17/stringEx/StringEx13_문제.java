package step4_17.stringEx;

import java.util.Scanner;

// 문자열 비교

public class StringEx13_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String input = scan.next();
		
		int check = -1;
		if (name.length() == input.length()) {
			check = 1;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) != input.charAt(i)) check = -1;
			}
		}
		if (check == 1) System.out.println(true);
		else System.out.println(false);
	}
}
