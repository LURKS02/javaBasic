package step3_15.arrayEx;
import java.util.Scanner;

// 2�����迭[����]

public class ArrayEx45_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] bag = {
				{"ö��", "�Ұ��"},
				{"ö��", "���"},
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
		};
		System.out.println("������ �̸��� ��ȣ �Է�");
		String inputname = scan.next();
		String inputnum = scan.next();
		
		int ind = -1;
		
		for (int i = 0; i < bag.length; i++) {
			if (inputname.equals(bag[i][0]) && inputnum.compareTo(bag[i][1]) == 0) {
				ind = i;
			}
		}
		if (ind == -1) System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		else {
			for (int i = 0; i < bag.length; i++) {
				if (i == bag.length - 1) {
					bag[i][0] = "";
					bag[i][1] = "";
				}
				else if (i >= ind) {
					bag[i][0] = bag[i + 1][0];
					bag[i][1] = bag[i + 1][1];
				}
			}
		}
		
		for (int i = 0; i < bag.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(bag[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
