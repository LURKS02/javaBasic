package step1_07.random;

import java.util.Scanner;
import java.util.Random;

//���������� ���� - 2�ܰ�

public class RandomEx06_���� {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		System.out.println("com = " + com);
		System.out.println("���� : 0 / ���� : 1 / �� : 2");
		int me = scan.nextInt();
		
		if (com >= me) {
			if (com == me) System.out.println("�����ϴ�.");
			else {
				if (com == 2 && me == 0) System.out.println("�̰���ϴ�.");
				else System.out.println("�����ϴ�.");
			}
		}
		else {
			if (com == 0 && me == 2) System.out.println("�����ϴ�.");
			else System.out.println("�̰���ϴ�.");
		}
		
	}

}
