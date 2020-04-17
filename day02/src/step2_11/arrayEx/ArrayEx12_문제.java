package step2_11.arrayEx;

import java.util.Scanner;

//�� ��ü�ϱ� - 2�ܰ�

public class ArrayEx12_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü
		// ��    1) �ε���1 : 1
		//		   �ε���2 : 3
		//		  {10, 40, 30, 20, 50}
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
		
		for (int i = 0; i < 5; i++) System.out.print(arr[i] + " ");
		System.out.println();

		// ���� 2) �� 2���� �Է¹޾� �� ��ü
		// 		   ��1 : 40
		//        ��2 : 20
		//		  {10, 20, 30, 40, 50}
		
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = 0;
		int num6 = 0;
		for (int i = 0; i < 5; i++) {
			if(num3 == arr[i]) num5 = i;
			if(num4 == arr[i]) num6 = i;
		}
		
		temp = arr[num5];
		arr[num5] = arr[num6];
		arr[num6] = temp;
		
		for (int i = 0; i < 5; i++) System.out.print(arr[i] + " ");
		System.out.println();
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü
		// ��    3) �й�1 : 1002
		//        �й�2 : 1003
		//		 {87, 45, 11, 98, 23}
		
		int num7 = scan.nextInt();
		int num8 = scan.nextInt();
		int num9 = 0;
		int num10 = 0;
		
		for (int i = 0; i < 5; i++) {
			if(num7 == hakbuns[i]) num9 = i;
			if(num8 == hakbuns[i]) num10 = i;
		}
		
		temp = scores[num9];
		scores[num9] = scores[num10];
		scores[num10] = temp;
		for (int i = 0; i < 5; i++) System.out.print(scores[i] + " ");
		System.out.println();
		
	}

}
