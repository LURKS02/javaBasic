package step2_11.arrayEx;

import java.util.Scanner;

//�л��������� ���α׷� - 2�ܰ�

public class ArrayEx05_���� {

	public static void main(String[] args) {
		
		int[]arr = {87, 11, 45, 98, 23};
		
		//����1 : �ε����� �Է¹޾� ���� ���
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(arr[input]);
		
		//����2 : ������ �Է¹޾� �ε��� ���
		int inputScore = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if (inputScore == arr[i]) System.out.println(i);
		}
		
		int[] num = {1001, 1002, 1003, 1004, 1005};
		
		//����3 : num�� �Է¹޾� ���� ���
		int inputNum = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if(inputNum == num[i]) System.out.println(arr[i]);
		}

	}

}
