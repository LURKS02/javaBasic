package step1_10.whileEx;

import java.util.Random;
import java.util.Scanner;

//���� �л�

public class WhileEx15_���� {

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
		
		System.out.printf("���� : %d��, ��� : %.1f\n", total, avg);
		System.out.println("�հ��� �� : " + pass);
		System.out.println("1�� �л� : " + maxNum + "��, " + max + "��");
	}

}
