package step2_11.arrayEx;

//�л��������� ���α׷� - 3�ܰ�

import java.util.Scanner;

public class ArrayEx06_���� {

	public static void main(String[] args) {
		
		int[] num = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		Scanner scan = new Scanner(System.in);
		
		//���� : �й��� �Է¹޾� ���� ���
		//��, ���� �й��� �Է��ϸ� ����ó��
		
		int check = 0;
		int inputNum = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if(inputNum == num[i]) {
				check = 1;
				System.out.println(scores[i]);
			}
		}
		
		if (check == 0) System.out.println("�������� �ʴ� �й��Դϴ�.");
	}
}
