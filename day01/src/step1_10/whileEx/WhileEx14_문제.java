package step1_10.whileEx;

import java.util.Scanner;

//최대값 구하기 - 2단계

public class WhileEx14_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요.");
		
		int max = 0;
		int i = 1;
		while(i <= 3) {
			int num = scan.nextInt();
			if (max < num) max = num;
			i++;
		}
		System.out.println("최대값 = " + max);

	}

}
