package step1_10.whileEx;

import java.util.Random;
import java.util.Scanner;

//랜덤 학생

public class WhileEx15_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int max = 0;
		int pass = 0;
		int total = 0;
		int maxNum = 0;

		int i = 1;
		while(i <= 10) {
			int random = ran.nextInt(100) + 1;
			total += random;
			if (max <= random) {
				max = random;
				maxNum = i;
			}
			
			if (random >= 60) pass++;
			
			i++;
		}
		
		double avg = total / 10.0;
		
		System.out.printf("총점 : %d점, 평균 : %.1f\n", total, avg);
		System.out.println("합격자 수 : " + pass);
		System.out.println("1등 학생 : " + maxNum + "번, " + max + "점");
	}

}
