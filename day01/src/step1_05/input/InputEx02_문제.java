package step1_05.input;

import java.util.Scanner;

public class InputEx02_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//����1) ���� 2���� �Է¹޾� ���� ���
		System.out.println("����1�� �Է��ϼ���.");
		int num1 = scan.nextInt();
		System.out.println("����2�� �Է��ϼ���.");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("�� : " + sum);
		
		//����2) ���� 1���� �Է¹޾� Ȧ���̸� true ���
		System.out.println("���ڸ� �Է��ϼ���.");
		int val = scan.nextInt();
		System.out.println(val%2 == 1);
		
		//
		//����3) ������ �Է¹޾� 60�� �̻��̰� 100�� �����̸� true ���
		System.out.println("������ �Է��ϼ���.");
		int score = scan.nextInt();
		System.out.println(score >= 60 && score <= 100);
		
	}

}
