package step3_15.arrayEx;
import java.util.Scanner;

// ���θ� ���� - ī�װ�

public class ArrayEx41_���� {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		while(true) {

			System.out.println("1.ī�װ� ����  2.������ ����  3.��üǰ�� ���");
			
			System.out.print("�޴��� �Է��ϼ���.");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("�߰��� ī�װ��� �Է��ϼ���.");
				String category = scan.next();
				int cateErr = -1;
				for (int i = 0; i < 100; i++) if (category.equals(items[i][0])) cateErr = 1;
				if(cateErr == 1) {
					System.out.println("�̹� �����ϴ� ī�װ��Դϴ�.");
					continue;
				}
				else {
					items[itemCount++][0] = category;
				}
				
			}
			
			else if(sel == 2) {
				System.out.println("�߰��� �������� ī�װ��� �̸��� �Է����ּ���.");
				String category = scan.next();
				String itemname = scan.next();
				int cateind = -1;
				for (int i = 0; i < 100; i++) if(category.compareTo(items[i][0]) == 0) cateind = i;
				if (cateind == -1) {
					System.out.println("��ġ�ϴ� ī�װ��� �����ϴ�.");
					continue;
				}
				else {
					items[cateind][1] += itemname + "/";
				}	
			}
			
			else if(sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println(items[i][0] + " : " + items[i][1]);
				}
			}
		}
	}
}
