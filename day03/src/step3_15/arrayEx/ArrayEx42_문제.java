package step3_15.arrayEx;
import java.util.Scanner;

// ���θ� - ��ٱ���

public class ArrayEx42_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] cart = new int[MAX_SIZE][2];
		
		int count = 0;
		String[] items = {"���", "�ٳ���", "����"};
		int log = -1;
		
		while(true) {
			
			System.out.println("[MEGA MART] 1.�α���  2.�α׾ƿ�  3.����  4.��ٱ���  0.����");
			System.out.print("�޴� ���� : ");
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (log != -1) {
					System.out.println("�̹� �α��ε� �����Դϴ�.");
					continue;
				}
				System.out.println("�α����� ���̵�� ��й�ȣ�� �Է��ϼ���.");
				String inputlog = scan.next();
				String inputpw = scan.next();
				
				for (int i = 0; i < 3; i++) {
					if (ids[i].compareTo(inputlog) == 0) {
						if (pws[i].compareTo(inputpw) == 0) {
							log = i;
							System.out.println("�α��� �Ǿ����ϴ�.");
						}
					}
				}
				if (log == -1) System.out.println("���� ������ Ʋ���ϴ�.");
			}
			
			else if(sel == 2) {
				if (log == -1) System.out.println("�α��� ���°� �ƴմϴ�.");
				else {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					log = -1;
				}
			}
			
			else if(sel == 3) {
				System.out.println("��ǰ ���");
				for (int i = 0; i < 3; i++) {
					System.out.println(i + ") " + items[i]);
				}
				if (count == 100) {
					System.out.println("��ٱ��� ����� �� ���� ������ ���� �� �����ϴ�.");
					continue;
				}
				System.out.println("��ٱ��Ͽ� ���� ��ǰ�� �����ϼ���.");
				int pick = scan.nextInt();
				cart[count][0] = log;
				cart[count][1] = pick;
				count++;
				System.out.println("��ٱ��Ͽ� ��ǰ�� ��ҽ��ϴ�.");
			}
			
			else if(sel == 4) {
				System.out.println("��ٱ��ϸ� ����մϴ�.");
				for (int i = 0; i < count; i++) {
					System.out.println(ids[cart[i][0]] + "ȸ��        > " + items[cart[i][1]] + " ����");
				}
			}
			
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}	
		}
	}
}
