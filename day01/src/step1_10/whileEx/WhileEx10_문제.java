package step1_10.whileEx;

import java.util.Scanner;

//atm - 2�ܰ�

public class WhileEx10_���� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log = -1;
		boolean run = true;
		
		while(run) {
			System.out.println("1. �α���");
			System.out.println("2. �α׾ƿ�");
			System.out.println("3. �Ա�");
			System.out.println("4. ���");
			System.out.println("5. ��ü");
			System.out.println("6. ��ȸ");
			System.out.println("0. ����");
			
			System.out.println("�޴� ����");
			int sel = scan.nextInt();
			
			if (sel == 1) {				//�α���
				if (log > 0) System.out.println("�̹� �α��� �����Դϴ�.");
				else {
					System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
					int inputAcc = scan.nextInt();
					int inputPw = scan.nextInt();
					if (inputAcc == dbAcc1 && inputPw == dbPw1) {
						log = 1; //dbAcc1 �α���
						System.out.println("dbAcc1 �α��� �Ǿ����ϴ�.");			
					}
					else if (inputAcc == dbAcc2 && inputPw == dbPw2) {
						log = 2; //dbAcc2 �α���
						System.out.println("dbAcc2 �α��� �Ǿ����ϴ�.");
					}
					else {
						System.out.println("���� �Ұ�");
						run = false;
					}
				}
			}
			
			
			else if (sel == 2) {		//�α׾ƿ�
				if (log > 0) {
					System.out.println("�α׾ƿ� �մϴ�.");
					log = -1;
				}
				else System.out.println("�α��� ���¿����� �����մϴ�.");
			}
			
			
			else if (sel == 3) {		//�Ա�
				if (log == 1) {
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
					int cash = scan.nextInt();
					dbMoney1 += cash;
					System.out.println("�Ա� �Ϸ�, �ܾ� : " + dbMoney1);
				}
				else if (log == 2) {
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
					int cash = scan.nextInt();
					dbMoney2 += cash;
					System.out.println("�Ա� �Ϸ�, �ܾ� : " + dbMoney2);
				}
				else System.out.println("�α��� ���¿����� �����մϴ�.");
			}
			
			
			else if (sel == 4) {		//���
				if (log == 1) {
					System.out.println("����� �ݾ��� �Է��ϼ���.");
					int withdraw = scan.nextInt();
					if(dbMoney1 < withdraw) System.out.println("�ܾ��� �����մϴ�.");
					else {
						dbMoney1 -= withdraw;
						System.out.println("Acc " + log + "�� ��� �Ϸ�, �ܾ� : " + dbMoney1);
					}
				}
				else if (log == 2) {
					System.out.println("����� �ݾ��� �Է��ϼ���.");
					int withdraw = scan.nextInt();
					if(dbMoney2 < withdraw) System.out.println("�ܾ��� �����մϴ�.");
					else {
						dbMoney2 -= withdraw;
						System.out.println("Acc " + log + "�� ��� �Ϸ�, �ܾ� : " + dbMoney2);
					}
				}
				else System.out.println("�α��� ���¿����� �����մϴ�.");
			}
			
			
			else if (sel == 5) {		//��ü
				if (log == 1) {
					System.out.println("��ü�� ���¸� �Է��ϼ���.");
					int inputAcc = scan.nextInt();
					if (inputAcc != dbAcc2) System.out.println("���� ����");
					else {
						System.out.println("��ü�� �ݾ��� �Է��ϼ���.");
						int withdraw = scan.nextInt();
						if (dbMoney1 < withdraw) System.out.println("�ܾ��� �����մϴ�.");
						else {
							dbMoney1 -= withdraw;
							dbMoney2 += withdraw;
							System.out.println("��ü �Ϸ�, 1�� �ܾ� : " + dbMoney1 + ", 2�� �ܾ� : " + dbMoney2);
						}
					}
				}
				else if (log == 2) {
					System.out.println("��ü�� ���¸� �Է��ϼ���.");
					int inputAcc = scan.nextInt();
					if (inputAcc != dbAcc1) System.out.println("���� ����");
					else {
						System.out.println("��ü�� �ݾ��� �Է��ϼ���.");
						int withdraw = scan.nextInt();
						if (dbMoney2 < withdraw) System.out.println("�ܾ��� �����մϴ�.");
						else {
							dbMoney2 -= withdraw;
							dbMoney1 += withdraw;
							System.out.println("��ü �Ϸ�, 1�� �ܾ� : " + dbMoney1 + ", 2�� �ܾ� : " + dbMoney2);
						}
					}
				}
				else System.out.println("�α��� ���¿����� �����մϴ�.");
			}
			
			
			else if (sel == 6) {		//��ȸ
				System.out.println("1�� �ܾ� : " + dbMoney1 + ", 2�� �ܾ� : " + dbMoney2);
			}
			else {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}
}
