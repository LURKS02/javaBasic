package step1_10.whileEx;
import java.util.Scanner;

//ATM - 2�ܰ�
//�α��� �� �� �α��� �Ұ�
//�α׾ƿ� ���¿����� �̿� ����
//�α׾ƿ��� �α��� ���¿����� �̿� ����

public class WhileEx08_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;
		boolean run = true;
		
		while(run) {
			System.out.println("1. �α���");
			System.out.println("2. �α׾ƿ�");
			System.out.println("0. ����");
			
			System.out.println("�޴� ����");
			int sel = scan.nextInt();
			
			if (sel == 1) {
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
			
			else if (sel == 2) {
				if (log > 0) {
					System.out.println("�α׾ƿ� �մϴ�.");
					log = -1;
				}
				else System.out.println("�α��� ���¿����� �����մϴ�.");
			}
			
			else if (sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}

	}

}
