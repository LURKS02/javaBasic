package step1_10.whileEx;
import java.util.Scanner;

//atm - 2�ܰ�

public class WhileEx09_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1. �Ա�");
			System.out.println("2. ���");
			System.out.println("3. ��ü");
			System.out.println("4. ��ȸ");
			System.out.println("0. ����");
			
			System.out.println("�޴� ����");
			
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
				int cash = scan.nextInt();
				myMoney += cash;
				System.out.println("�Ա� �Ϸ�, �ܾ� : " + myMoney);
			}
			
			else if (sel == 2) {
				System.out.println("����� �ݾ��� �Է��ϼ���.");
				int withdraw = scan.nextInt();
				if(myMoney < withdraw) System.out.println("�ܾ��� �����մϴ�.");
				else {
					myMoney -= withdraw;
					System.out.println("��� �Ϸ�, �ܾ� : " + myMoney);
				}
			}
			
			else if (sel == 3) {
				System.out.println("��ü�� ���¸� �Է��ϼ���.");
				int inputAcc = scan.nextInt();
				if (inputAcc != yourAcc) System.out.println("���� ����");
				else {
					System.out.println("��ü�� �ݾ��� �Է��ϼ���.");
					int withdraw = scan.nextInt();
					if (myMoney < withdraw) System.out.println("�ܾ��� �����մϴ�.");
					else {
						myMoney -= withdraw;
						yourMoney += withdraw;
						System.out.println("��ü �Ϸ�, �� �ܾ� : " + myMoney + ", ��� �ܾ� : " + yourMoney);
					}
				}
			}
			else if (sel == 4) {
				System.out.println("�� �ܾ� : " + myMoney + ", ��� �ܾ� : " + yourMoney);
			}
			else {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}
}
