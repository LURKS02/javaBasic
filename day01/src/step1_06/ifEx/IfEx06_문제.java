package step1_06.ifEx;

import java.util.Scanner;

//������ ����
//������ ������  �����ϱ� ���� ���� 2���� �Է¹޴´�.
//�Է¹��� ���ڷ� ������ ������ ����Ѵ�.

//������ �Է¹޾� ���Ѵ�.
//���� or ����

public class IfEx06_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� 2���� �Է����ּ���.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int answer = num1 * num2;
		
		System.out.println("���� : " + num1 + " X " + num2 + " = ?");
		int input = scan.nextInt();
		
		if (answer == input) {
			System.out.println("����!");
		}
		else {
			System.out.println("����!");
		}
	}
}
