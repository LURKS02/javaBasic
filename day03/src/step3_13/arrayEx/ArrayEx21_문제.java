package step3_13.arrayEx;

import java.util.Scanner;

// �ִ밪 ���ϱ�[3�ܰ�]

public class ArrayEx21_���� {

	public static void main(String[] args) {
		
		int[] arr = {11, 87, 42, 100, 24};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			for (int i = 0; i < 5; i++) System.out.print(arr[i] + " ");
			System.out.println();
			
			int notblank = 0;
			int max = 0;
			int maxindex = -1;
			for (int i = 0; i < 5; i++) {
				if (max <= arr[i]) {
					max = arr[i];
					maxindex = i;
				}
				if (arr[i] != 0) notblank++;
			}
			if(notblank == 0) {
				System.out.println("��� ���ڰ� 0���� ����Ǿ����ϴ�.");
				break;
			}
		
			System.out.println("�ִ밪�� �Է����ּ���.");
			int input = scan.nextInt();
			if (input == arr[maxindex]) {
				arr[maxindex] = 0;
				System.out.println("�ִ밪�� ã�ҽ��ϴ�.");
			}
			else {
				System.out.println("�ִ밪�� ã�� ���߽��ϴ�.");
			}
		}
	}
}
