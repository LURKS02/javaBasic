package step1_10.whileEx;

import java.util.Scanner;

/*
 * # �Ҽ�ã��[2�ܰ�]
 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
 * ��)
 * �Է� : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 */

public class WhileEx23_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		int input = scan.nextInt();
		
		for (int i = 2; i <= input; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++)
				if (i % j == 0) cnt++;
			if(cnt == 2) System.out.print(i + " ");
		}
	}
}
