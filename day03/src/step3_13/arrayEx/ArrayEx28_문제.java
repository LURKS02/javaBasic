package step3_13.arrayEx;

import java.util.Scanner;
import java.util.Random;

/* 
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
 */

public class ArrayEx28_���� {

	public static void main(String[] args) {
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for (int i = 0; i < SIZE; i++) {
			front[i] = i + 1;
			back[i] = SIZE + i + 1;
		}
		
		//shuffle
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(SIZE);
			int tmp = front[0];
			front[0] = front[r];
			front[r] = tmp;
			
			r = ran.nextInt(SIZE);
			tmp = back[0];
			back[0] = back[r];
			back[r] = tmp;
		}
		
		int num = 1;
		int input = -1;
		while(true) {
			if (num == 19) {
				System.out.println("��� ���ڸ� ã�ҽ��ϴ�. ���� ����");
				break;
			}
			
			for(int i = 0; i < SIZE; i++) {
				System.out.print(front[i] + " ");
			}
			System.out.println();
			
			System.out.println(num + "���� ������ ��ġ��?");
			input = scan.nextInt();
			
			if(input < 0 || input > 8) {
				System.out.println("���� ó��");
				continue;
			}
			
			if (front[input] == num) {
				System.out.println("�����Դϴ�.");
				if (num >= 10) front[input] = 0;
				else front[input] = back[input];
				num++;
			}
			
			else System.out.println("�����Դϴ�.");
		}
		

	}

}
