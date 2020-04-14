package step2_11.arrayEx;

//학생성적관리 프로그램 - 3단계

import java.util.Scanner;

public class ArrayEx06_문제 {

	public static void main(String[] args) {
		
		int[] num = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		Scanner scan = new Scanner(System.in);
		
		//문제 : 학번을 입력받아 성적 출력
		//단, 없는 학번을 입력하면 예외처리
		
		int check = 0;
		int inputNum = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if(inputNum == num[i]) {
				check = 1;
				System.out.println(scores[i]);
			}
		}
		
		if (check == 0) System.out.println("존재하지 않는 학번입니다.");
	}
}
