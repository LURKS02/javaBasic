package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

//��� ���� ���߱� ����
// 150~250 ������ ���� ���� ����
// ���� ������ ��� ���ڸ� ���ߴ� ����

public class IfEx16_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int random = ran.nextInt(100) + 150;
		int answer = (random / 10) % 10;
		
		int input = scan.nextInt();
		
		if (input == answer) System.out.println("���� : " + random);
		else System.out.println("���� : " + random);

	}

}
