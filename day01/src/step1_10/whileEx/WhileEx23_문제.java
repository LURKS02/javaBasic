package step1_10.whileEx;

import java.util.Scanner;

// 소수찾기[2단계]
 

public class WhileEx23_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int input = scan.nextInt();
		
		for (int i = 2; i <= input; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++)
				if (i % j == 0) cnt++;
			if(cnt == 2) System.out.print(i + " ");
		}
	}
}
