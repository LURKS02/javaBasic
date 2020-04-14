package step2_11.arrayEx;

import java.util.Random;

//학생성적관리 프로그램 - 1단계

public class ArrayEx04_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//문제1 : arr배열에 1~100점 사이의 정수 5개 저장
		int[] arr = new int[5];
		int total = 0;
		double avg = 0;
		int passes = 0;
		
		for (int i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
			total += arr[i];
			if (arr[i] >= 60) passes++;
		}
		System.out.println();
		
		//문제2 : 전교생의 총점과 평균 출력
		avg = total / 5.0;
		System.out.println("total = " + total + " avg = " + avg);
		
		//문제3 : 성적이 60점 이상이면 합격, 합격생 수 출력
		System.out.println("passes = " + passes);
		

	}

}
