package step2_11.arrayEx;

import java.util.Scanner;

//�̴ϸ���

public class ArrayEx18_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int win1 = 0;
		int win2 = 0;
		
		while(true) {
			for (int i = 0; i < 8; i++) System.out.print(game[i] + " ");
			System.out.println();
			for (int i = 0; i < 8; i++) System.out.print(p1[i] + " ");
			System.out.println();
			System.out.println("p1 �¸� : " + win1);
			if (win1 == 3) {
				System.out.println("[p1] �¸�!");
				break;
			}
			
			for (int i = 0; i < 8; i++) System.out.print(p2[i] + " ");
			System.out.println();
			System.out.println("p2 �¸� : " + win2);
			if (win2 == 3) {
				System.out.println("[p2] �¸�!");
				break;
			}
			
			if(turn % 2 == 0) {
				System.out.println("[p1] �Է� ");
				int input1 = scan.nextInt();
				p1[idx1] = 0;
				idx1 += input1;
				
				if(idx1 > 7) {
					win1++;
					idx1 = idx1 % 8;
					p1[idx1] = 1;
				}
				
				p1[idx1] = 1;
				if(idx1 == idx2) {
					System.out.println("[p1]�� [p2]�� ��Ҵ�.");
					p2[idx2] = 0;
					idx2 = 0;
					p2[idx2] = 2;
				}
			}
			
			else {
				System.out.println("[p2] �Է� ");
				int input2 = scan.nextInt();
				p2[idx2] = 0;
				idx2 += input2;
				if(idx2 > 7) {
					win2++;
					idx2 = idx2 % 8;
					p2[idx2] = 2;
				}
				p2[idx2] = 2;
				if(idx2 == idx1) {
					System.out.println("[p2]�� [p1]�� ��Ҵ�.");
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = 1;
				}
			}
			turn++;
		}
	}
}
