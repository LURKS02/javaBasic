package step5_20.classEx;

import java.util.Scanner;

// ������ ����ϱ� : Ŭ���� + ����

class Ex10 {
	String name = "";		// ���� �̸�
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"ġ�����", "�Ұ�����", "����Ƣ��", "��      ��"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}

public class ClassEx10_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex10 e = new Ex10();
		
		while(true) {
			System.out.println("==============");
			System.out.println("�޴� ���� : [1]�ֹ� [2]����");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("� �޴��� �ֹ��Ͻðڽ��ϱ�?");
				for (int i = 0; i < e.arMenu.length; i++) {
					System.out.println("[" + (i + 1) + "] " + e.arMenu[i]);
				}
				int input = scan.nextInt();
				if (input > 0 && input <= e.arMenu.length) {
					System.out.println("�ֹ��Ǿ����ϴ�.");
					e.arCount[input - 1]++;
				}
				else {
					System.out.println("�Է� ����");
				}
			}
			
			else {
				System.out.println("�ݾ��� �Է����ּ���.");
				int money = scan.nextInt();
				int total = 0;
				for (int i = 0; i < e.arMenu.length; i++) total += e.arPrice[i]*e.arCount[i];
				if (total > money) { System.out.println("�ܾ��� �����մϴ�."); break; }
				
				System.out.println("==============");
				for (int i = 0; i < e.arMenu.length; i++) {
					System.out.println(e.arMenu[i] + " : " + e.arCount[i] + "��\t" + e.arPrice[i]*e.arCount[i] + "��");
				}
				System.out.println("�հ�ݾ� : " + total + "��");
				System.out.println("�����ݾ� : " + money + "��");
				System.out.println("==============");
				System.out.println("�ܵ� : " + (money - total) + "��");
				break;
			}
		}

	}

}
