package step1_05.input;

import java.util.Scanner;
//java.util ��Ű�� ���� Scanner Ŭ���� ������ �ҷ��´�.
//scan ���� ���� : Scanner scan = new Scanner(System.in);

public class InputEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� " + num + "�Դϴ�.");
		
		System.out.print("���̸� �Է��ϼ���.");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");

	}

}
