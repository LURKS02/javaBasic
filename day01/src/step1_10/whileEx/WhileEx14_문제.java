package step1_10.whileEx;

import java.util.Scanner;

//�ִ밪 ���ϱ� - 2�ܰ�
/*
 * 3ȸ �ݺ��ϸ鼭 ������ �Է�
 * �Է¹��� 3���� ���� �� ���� ū �� ���
 */

public class WhileEx14_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ���.");
		
		int max = 0;
		int i = 1;
		while(i <= 3) {
			int num = scan.nextInt();
			if (max < num) max = num;
			i++;
		}
		System.out.println("�ִ밪 = " + max);

	}

}
