package step2_11.arrayEx;

import java.util.Random;

//�л��������� ���α׷� - 1�ܰ�

public class ArrayEx04_���� {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//����1 : arr�迭�� 1~100�� ������ ���� 5�� ����
		int[] arr = new int[5];
		int total = 0;
		double avg = 0;
		int passes = 0;
		
		for (int i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
			total += arr[i];
			if (arr[i] >= 60) passes++;
		}
		System.out.println();
		
		//����2 : �������� ������ ��� ���
		avg = total / 5.0;
		System.out.println("total = " + total + " avg = " + avg);
		
		//����3 : ������ 60�� �̻��̸� �հ�, �հݻ� �� ���
		System.out.println("passes = " + passes);
		

	}

}
