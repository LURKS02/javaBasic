package step2_11.arrayEx;

import java.util.Scanner;

//��ȭ�� �¼�����
//����ڷκ��� �¼� index�� �Է¹޾� ����
//���ŵ� �¼� ���� 1, �籸�� �Ұ�
//�� �¼��� ���� ������ 12000
//��ȭ���� �� ����� ���

public class ArrayEx09_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[7];
		int money = 0;
		
		while(true) {
			System.out.println("1. �¼� ����      2. ����");
			System.out.println("�޴� ����");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("�¼� ��ȣ�� �Է��ϼ���.");
				System.out.print("seat = ");
				for (int i = 0; i < 7; i++) System.out.print(seat[i] + " ");
				
				int index = scan.nextInt();
				if (seat[index] == 1) System.out.println("�̹� ����� �¼��Դϴ�.");
				else {
					seat[index] = 1;
					money += 12000;
					System.out.println("���� �Ϸ�");
				}
			}
			else {
				System.out.println("������� " + money + "�� �Դϴ�.");
				break;
			}
		}
	}
}
