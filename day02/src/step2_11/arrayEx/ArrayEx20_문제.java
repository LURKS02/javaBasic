package step2_11.arrayEx;

import java.util.Scanner;

//ATM[3�ܰ�]

public class ArrayEx20_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		while(true) {
			
			for (int i = 0; i < cnt; i++) {
				System.out.println("acc = " + accs[i] + " pw = " + pws[i]);
			}
			
			System.out.println("1.����");
			System.out.println("2.Ż��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				if(cnt == 5) {
					System.out.println("�� �̻� ������ ������ �� �����ϴ�.");
					continue;
				}
				
				System.out.println("������ ���¹�ȣ�� �Է��ϼ���.");
				int newacc = scan.nextInt();
				int ext = -1;
				for(int i = 0; i < cnt; i++) {
					if (newacc == accs[i]) {
						System.out.println("�̹� �����ϴ� ���¹�ȣ�Դϴ�.");
						ext = 1;
					}
				}
				if (ext == 1) continue;
				
				accs[cnt] = newacc;
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				int newpw = scan.nextInt();
				pws[cnt++] = newpw;
				System.out.println("������ �����Ǿ����ϴ�.");
			}
			
			else if(sel == 2) {
				if(cnt == 0) {
					System.out.println("���� ����� ������ϴ�.");
					continue;
				}
				
				System.out.println("������ ���¹�ȣ�� �Է��ϼ���.");
				int delacc = scan.nextInt();
				int delindex = -1;
				for (int i = 0; i < cnt; i++) {
					if (delacc == accs[i]) delindex = i;
				}
				if(delindex == -1) {
					System.out.println("������ ���°� �������� �ʽ��ϴ�.");
					continue;
				}
				for (int i = delindex; i < cnt; i++) {
					if(i == cnt - 1) {
						accs[i] = 0;
						pws[i] = 0;
					}
					else {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
					}
				}
				cnt--;
				System.out.println("���� �Ǿ����ϴ�.");
			}
		}

	}

}
