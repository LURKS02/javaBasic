package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # �Ｎ����
 */

public class ArrayEx10_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		
		while(true) {
			
			System.out.println("[1]������ ���Ȯ��");
			System.out.println("[2]������ ���Ȯ��");
			System.out.println("[3]������ ���Ȯ��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			int get = 0;
			
			if(sel == 1) {
				for (int i = 0; i < 6; i++) {
					if (lotto1[i] == 7) {
						if (lotto1[i+1] == 7 && lotto1[i+2] == 7) {
							System.out.println("��÷�Դϴ�.");
							get = 1;
						}
					}
				}
				if(get == 0) System.out.println("���Դϴ�.");
			}
			
			else if(sel == 2) {
				for (int i = 0; i < 6; i++) {
					if (lotto2[i] == 7) {
						if (lotto2[i+1] == 7 && lotto2[i+2] == 7) {
							System.out.println("��÷�Դϴ�.");
							get = 1;
						}
					}
				}
				if(get == 0) System.out.println("���Դϴ�.");
			}
			
			else if(sel == 3) {
				for (int i = 0; i < 6; i++) {
					if (lotto3[i] == 7) {
						if (lotto3[i+1] == 7 && lotto3[i+2] == 7) {
							System.out.println("��÷�Դϴ�.");
							get = 1;
						}
					}
				}
				if(get == 0) System.out.println("���Դϴ�.");
			}
		}

	}

}
