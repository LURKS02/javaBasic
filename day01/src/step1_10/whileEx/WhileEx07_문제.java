package step1_10.whileEx;
import java.util.Random;
import java.util.Scanner;

//up down ���� - 2�ܰ�
/*
 * ������ ���߸� ���� ����
 * 100������ ������ ������ ������ 5�� ����
 * ���� ���� �� ������ ���
 */

public class WhileEx07_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
	
		int random = ran.nextInt(100) + 1;
		System.out.println("���� : " + random);
		
		while(true) {
			
			if (score == 0) {
				System.out.println("���� ����");
				break;
			}
			
			System.out.println("���� �Է�");
			int input = scan.nextInt();
			
			if (input == random) {
				System.out.println("�����Դϴ�.");
				System.out.println("���� : " + score);
				break;
			}
			else if (input < random) {
				System.out.println("Up");
				score -= 5;
			}
			else {
				System.out.println("Down");
				score -= 5;
			}
		}
	
	}

}
