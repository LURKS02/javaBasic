package step1_06.ifEx;

import java.util.Scanner;

//�ִ밪 ���ϱ� - 1�ܰ�
//���� 3���� �Է¹޴´�.
//�Է¹��� 3�� ���� ���Ͽ� ���� ū ���� ����Ѵ�.


public class IfEx12_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = 0;
		
		if(num1 >= num2) {
			max = num1;
			if (num1 >= num3) max = num1;
			else max = num3;
		}
		
		else {
			if (num2 >= num3) max = num2;
			else max = num3;
		}
		System.out.println("�ִ밪�� " + max + " �Դϴ�.");

	}

}
