package step1_10.whileEx;

import java.util.Scanner;

//소수찾기 - 1단계
/*
 * 1과 자기 자신으로만 나눠지는 수
 * 해당 숫자를 1부터 자기 자신까지 나눔
 * 나머지가 0일 때마다 카운트를 셈
 * 카운트 값이 2이면 소수
 */

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
