package step1_06.ifEx;

import java.util.Scanner;

//���������� ����
//����[0], ����[1], ��[2]
//com �� ����[1]�� �� �� �ִ�.
//me �� 0~2 ������ ���ڸ� �Է¹޴´�.
//com �� me �� ���� "����/���� �̰��/���� ����" �� ����Ѵ�.

public class IfEx03_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int com = 1;
		int me = scan.nextInt();
		
		if(me < com) {
			System.out.println("���� ����.");
		}
		if(me == com) {
			System.out.println("����.");
		}
		if(me > com) {
			System.out.println("���� �̰��.");
		}
	}

}
