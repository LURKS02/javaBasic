package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # �����̵�[1�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 */

public class ArrayEx14_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
		}
		
		while(true) {
			
			for (int i = 0; i < 7; i++) System.out.print(game[i] + " ");
			System.out.println();
			System.out.println("���ڸ� �Է��ϼ���.");
			int input = scan.nextInt();
			if(input == 1) {
				if(player - 1 == -1) {
					System.out.println("���� ����");
					break;
				}
				game[player - 1] = 2;
				game[player] = 0;
				player -= 1;
			}
			else {
				if(player + 1 == 7) {
					System.out.println("���� ����");
					break;
				}
				game[player + 1] = 2;
				game[player] = 0;
				player += 1;
			}
		}		
	}
}
