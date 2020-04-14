package step2_11.arrayEx;

import java.util.Scanner;

//학생성적관리 프로그램 - 2단계

public class ArrayEx05_문제 {

	public static void main(String[] args) {
		
		int[]arr = {87, 11, 45, 98, 23};
		
		//문제1 : 인덱스를 입력받아 성적 출력
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(arr[input]);
		
		//문제2 : 성적을 입력받아 인덱스 출력
		int inputScore = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if (inputScore == arr[i]) System.out.println(i);
		}
		
		int[] num = {1001, 1002, 1003, 1004, 1005};
		
		//문제3 : num을 입력받아 성적 출력
		int inputNum = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if(inputNum == num[i]) System.out.println(arr[i]);
		}

	}

}
