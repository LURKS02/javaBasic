package step2_11.arrayEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # ���� ����
 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
 * 2. ������ ���߸� back�� �ش� ���ڸ� ������,
 *    back�� ��� ���� ä������ ������ ����ȴ�.
 * ��)
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * �Է�1 : 0
 * �Է�2 : 1
 * 
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
 */

public class ArrayEx15_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// ����(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();

		int finish = 0;
		while(true) {
			
			for (int k = 0; k < 10; k++) {
				System.out.print(back[k] + " ");
			}
			System.out.println();
			
			if(finish == 5) {
				System.out.println("���� ����");
				break;
			}
			int cho1 = scan.nextInt();
			int cho2 = scan.nextInt();
			if (cho1 == cho2) {
				System.out.println("���� ī�带 �����Ͽ����ϴ�.");
				continue;
			}
			if (back[cho1] != 0 || back[cho2] != 0) {
				System.out.println("�̹� �� �����Դϴ�.");
			}
			else {
				if (front[cho1] == front[cho2]) {
					back[cho1] = 1;
					back[cho2] = 1;
					finish++;
				}
				else {
					System.out.println("�����Դϴ�.");
				}
			}
		}
	}

}
