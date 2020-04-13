package step1_10.whileEx;

import java.util.Scanner;

//보조제어문
/*
 * 1. break
 * 반복문을 즉시 탈출
 * 
 * 2.continue
 * 반복문의 조건식으로 바로 이동
 * 하위 내용을 무시할 때 사용
 * 
 */

public class WhileEx20 {

	public static void main(String[] args) {
		
		//break
		for (int i = 0; i < 15; i++) {
			if (i > 3) break;
			System.out.println(i);
		}
		
		//continue
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.햄버거 2.콜라 3.감자");
			int sel = scan.nextInt();
			
			if (sel != 1 && sel != 2 && sel != 3) continue; //예외 : true로 돌아감
			
			if (sel == 1) {}
			else if (sel == 2) {}
			else {}
		}

	}

}
