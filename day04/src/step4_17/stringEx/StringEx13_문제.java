package step4_17.stringEx;

import java.util.Scanner;

// ���ڿ� ��

public class StringEx13_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "�ڳ���";
		System.out.print("���� �̸��� �Է��ϼ��� : ");			// ex) Ƽ�����罺
		String input = scan.next();
		
		int check = -1;
		if (name.length() == input.length()) {
			check = 1;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) != input.charAt(i)) check = -1;
			}
		}
		if (check == 1) System.out.println(true);
		else System.out.println(false);
	}
}
