package step1_10.whileEx;

import java.util.Scanner;

//�������
/*
 * 1. break
 * �ݺ����� ��� Ż��
 * 
 * 2.continue
 * �ݺ����� ���ǽ����� �ٷ� �̵�
 * ���� ������ ������ �� ���
 * 
 */

public class WhileEx20 {

	public static void main(String[] args) {
		
		//break
		for (int i = 0; i < 15; i++) {
			if (i > 3) break;
			System.out.println(i);
		}
		
		//continue
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.�ܹ��� 2.�ݶ� 3.����");
			int sel = scan.nextInt();
			
			if (sel != 1 && sel != 2 && sel != 3) continue; //���� : true�� ���ư�
			
			if (sel == 1) {}
			else if (sel == 2) {}
			else {}
		}

	}

}
