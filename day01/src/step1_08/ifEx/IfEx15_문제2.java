package step1_08.ifEx;

import java.util.Scanner;

public class IfEx15_����2 {

	public static void main(String[] args) {
		int cash = 20000;
		int balance = 30000;
		int account = 11111;
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ATM ����");
		System.out.println("1.�α���   2.����");
		int select = scan.nextInt();
		
		if (select == 1) {
			System.out.println("���¿� ��й�ȣ�� �Է��ϼ���.");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			
			if (acc == account && pw == password) {
				System.out.println("1.�Ա�   2.���   3.��ȸ");
				select = scan.nextInt();
				if (select == 1) {
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
					int deposit = scan.nextInt();
					if (deposit > cash) System.out.println("�ݾ��� �����մϴ�.");

					else {
						cash -= deposit;
						balance += deposit;
						System.out.println("�ܾ� : cash = " + cash + " balance = " + balance);
					}
				}
				else if (select == 2) {
					System.out.println("����� �ݾ��� �Է��ϼ���.");
					int withdraw = scan.nextInt();
					if (withdraw > balance) System.out.println("�ݾ��� �����մϴ�.");
					else {
						cash += withdraw;
						balance -= withdraw;
						System.out.println("�ܾ� : cash = " + cash + " balance = " + balance);
					}
				}
				else System.out.println("��ȸ : " + balance + "��");
				
			}
			else System.out.println("���̵�� �н����带 Ȯ�����ּ���.");
		}
		else System.out.println("����");

	}

}
