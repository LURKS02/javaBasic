package step1_06.ifEx;

import java.util.Scanner;

//���� ��ȿ�� �˻�
//1. ������ �Է¹޴´�.
//2. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
//3. ��, �Է¹��� ������ 
//	  �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.

public class IfEx07_���� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("������ �߸� �Է��߽��ϴ�.");
		}
		
		else {
			if (score >= 60) {
				System.out.println("�հ��Դϴ�.");
			}
			else {
				System.out.println("���հ��Դϴ�.");
			}
		}
	}	
}
