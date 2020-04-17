package step1_06.ifEx;

import java.util.Scanner;

//성격 유효성 검사

public class IfEx07_문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("성적을 잘못 입력했습니다.");
		}
		
		else {
			if (score >= 60) {
				System.out.println("합격입니다.");
			}
			else {
				System.out.println("불합격입니다.");
			}
		}
	}	
}
