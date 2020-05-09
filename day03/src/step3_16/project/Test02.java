package step3_16.project;

import java.util.Scanner;

// 소수 찾기[3단계]

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		for (int i = number + 1; i < 1000000; i++) {
			int bool = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) bool = 0;
			}
			if (bool == 1) {
				System.out.println(i);
				break;
			}
		}	
	}
}
