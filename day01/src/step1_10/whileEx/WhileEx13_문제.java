package step1_10.whileEx;

import java.util.Scanner;

//소수찾기 - 1단계

public class WhileEx13_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int i = 1;
		int cnt = 0;
		
		while(i <= input) {
			if (input % i == 0) cnt++;
			i++;
		}
		
		if(cnt == 2) System.out.println("소수입니다.");
		else System.out.println("소수가 아닙니다.");

	}

}
