package step3_13.arrayEx;

import java.util.Scanner;

/*
 * # ���� �߱� ����
 * 1. me�� 1~9 ������ ���� 3���� ����
 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
 * ��)
 * ���� : 1 7 3
 * 3 1 5		: 2b
 * 1 5 6		: 1s
 * ...
 */

public class ArrayEx26_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] com = {1, 7, 3};
		for(int i = 0; i < 3; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		
		while(true) {
			
			int strike = 0;
			int ball = 0;
			int[] me = new int[3];
			int index = 0;
			
			for (int i = 0; i < 3; i++) {
				System.out.println("���� �Է�");
				int input = scan.nextInt();
				int dup = -1;
				for (int j = 0; j < index; j++) {
					if (me[j] == input) dup++;
				}
				if (dup != -1) {
					System.out.println("���ڰ� ��Ĩ�ϴ�.");
					i--;
					continue;
				}
				else {
					me[index++] = input;
				}
			}
			
			for (int i = 0; i < 3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.println();
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i] == me[j]) {
						if (i == j) strike++;
						else ball++;
					}
				}
			}
			System.out.println("strike = " + strike + ", ball = " + ball);
			if (strike == 3) {
				System.out.println("�����Դϴ�.");
				break;
			}
			
		}

	}

}
