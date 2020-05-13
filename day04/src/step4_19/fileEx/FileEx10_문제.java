package step4_19.fileEx;

import java.util.Scanner;

//�ı� ���Ǳ� ���α׷� 

public class FileEx10_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
	
		int tickets = 5;		// �ı� ����
		int price = 3200;		// �ı� ����
		
		while(true) {
		
			System.out.println("[1]������");
			System.out.println("[2]�����");
		
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
		
			if(sel == 1) {
				while(true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");
				
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("������ �ı� �� �Է�");
						int addtk = scan.nextInt();
						tickets += addtk;
						System.out.println("���� �Ϸ� : ���� �ı� �� : " + tickets);
					}
					
					else if(choice == 2) {
						System.out.println("���� �ܵ�");
						for (int i = 0; i < money.length; i++) {
							System.out.println((i + 1) + ". " + money[i] + "��");
						}
						int addmy = scan.nextInt();
						charges[addmy - 1]++;
						System.out.println(money[addmy - 1] + "�� ���� �Ϸ�");
					}
					
					else if(choice == 3) {
						break;
					}
				}
			}
			
			else if(sel == 2) {
				while(true) {
					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");
				
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("���� �Ա����ּ���.");
						int inputmy = scan.nextInt();
						System.out.println("�ı��� �� �� �����Ͻðڽ��ϱ�?");
						int tknum = scan.nextInt();
						
						if ((tickets - tknum) < 0) {
							System.out.println("�ı��� �����մϴ�.");
							continue;
						}
						
						int change = inputmy - tknum * price;
						if (change < 0) {
							System.out.println("�ݾ��� �����մϴ�.");
							continue;
						}
						
						System.out.println("�ı� ���� : " + price);
						System.out.println("������ �ı� : " + tknum + "��");
						int[] mynum = new int[money.length];
						for (int i = 0; i < money.length; i++) {
							mynum[i] = 0;
							while (charges[i] > 0) {
								if (change < money[i]) break;
								change -= money[i];
								charges[i]--;
								mynum[i]++;
							}
						}
						if (change > 0) System.out.println("�ܵ��� �����մϴ�.");
						else {
							for (int i = 0; i < money.length; i++) {
								System.out.println(money[i] + "�� : " + mynum[i] + "��");
							}
						}
					}
					
					else if(choice == 2) {
						break;
					}
				}
			}
		}
	}

}
