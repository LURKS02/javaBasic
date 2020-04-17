package step1_06.ifEx;

import java.util.Scanner;

//최대값 구하기 - 1단계


public class IfEx12_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = 0;
		
		if(num1 >= num2) {
			max = num1;
			if (num1 >= num3) max = num1;
			else max = num3;
		}
		
		else {
			if (num2 >= num3) max = num2;
			else max = num3;
		}
		System.out.println("최대값은 " + max + " 입니다.");

	}

}
