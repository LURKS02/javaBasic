package step5_20.classEx;

import java.util.Scanner;

// ��ȭ�� �¼����� : Ŭ���� + ����

class Ex07{
	int[] seat = new int[7];
	int money = 0;
}

public class ClassEx07_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex07 e = new Ex07();
		
		while(true) {
			
			System.out.println("��ȭ�� ���α׷�");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("seat = ");
				for (int i = 0; i < e.seat.length; i++) System.out.print(e.seat[i] + " ");
				System.out.println();
				
				System.out.println("�¼� ����");
				int inputind = scan.nextInt();
				if (e.seat[inputind] == 1) System.out.println("�̹� ���ŵ� �¼��Դϴ�.");
				else {
					e.seat[inputind] = 1;
					e.money += 12000;
					System.out.print("seat = ");
					for (int i = 0; i < e.seat.length; i++) System.out.print(e.seat[i] + " ");
					System.out.println();
				}
				
			}
			else if(sel == 2) {
				System.out.println("����� : " + e.money);
				break;
			}
		}

	}

}
