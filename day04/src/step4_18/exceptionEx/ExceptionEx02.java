package step4_18.exceptionEx;

import java.util.Scanner;

//���� ó��

public class ExceptionEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ : ����1 �Է�");
		int num1 = scan.nextInt();
		
		System.out.println("������ : ����2 �Է�");
		int num2 = scan.nextInt();
		
		if(num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		else {
			System.out.println(num1 / num2);
		}
		System.out.println("------------------");
		
		try {
			System.out.println(num1 / num2);
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}finally {
			System.out.println("���� �߻��� ���� ���� ������ ������ ����");
		}
	}
}
