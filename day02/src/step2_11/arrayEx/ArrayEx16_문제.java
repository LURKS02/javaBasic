package step2_11.arrayEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # 1 to 50[1�ܰ�] : 1 to 4
 * 1. arr�迭�� 1~4 ���� ���ڸ� �ߺ����� ����
 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է�
 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ���� ����
 * ��)
 * 4 2 3 1
 * �Է� : 3
 * 4 2 3 9
 * �Է� : 1
 * 4 9 3 9
 * ...
 */

public class ArrayEx16_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int i = 0;
		while (i < 4) {
			int r = ran.nextInt(4);
			if (check[r] == 0) {
				check[r] = 1;
				arr[i] = r + 1;
				i++;
			}
		}
		
		while(true) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
			int cnt = 0;
			for (int k = 0; k < 4; k++) {
				if (arr[k] == 9) cnt++;
			}
			if (cnt == 4) {
				System.out.println("���� ����");
				break;
			}
			System.out.println("���ڸ� �Է��ϼ���.");
			int input = scan.nextInt();
			
			if(arr[input] == 9) System.out.println("�̹� �Էµ� ���Դϴ�.");
			else {
				arr[input] = 9;
			}
		}
		


	}

}
