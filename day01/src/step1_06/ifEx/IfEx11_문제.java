package step1_06.ifEx;

import java.util.Scanner;

//������ ��� - 1�ܰ�
//�޴��� ���
//�ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է�
//������ �Է�
//�Է¹��� ���ݰ� �޴� ������ Ȯ���� ������ ���
//������ ������ ��� �޼����� ����Ѵ�.

public class IfEx11_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("�޴���");
		System.out.println("1�� : " + price1);
		System.out.println("2�� : " + price2);
		System.out.println("3�� : " + price3);
		
		System.out.println("�޴��� �Է����ּ���.");
		int orderNum = scan.nextInt();
		
		System.out.println("�����Ͻ� �ݾ��� �Է����ּ���.");
		int orderPrice = scan.nextInt();
		
		if (orderNum == 1) {
			if (orderPrice >= price1) {
				System.out.println("�ֹ��Ǿ����ϴ�.");
				System.out.println("�ܵ� : " + (orderPrice - price1));
			}
			else System.out.println("������ �����մϴ�.");
		}
		
		if (orderNum == 2) {
			if (orderPrice >= price2) {
				System.out.println("�ֹ��Ǿ����ϴ�.");
				System.out.println("�ܵ� : " + (orderPrice - price2));
			}
			else System.out.println("������ �����մϴ�.");
		}
		
		if (orderNum == 3) {
			if (orderPrice >= price3) {
				System.out.println("�ֹ��Ǿ����ϴ�.");
				System.out.println("�ܵ� : " + (orderPrice - price3));
			}
			else System.out.println("������ �����մϴ�.");
		}
		
	}

}
