package step4_17.stringEx;

import java.util.Scanner;

// �����ձ�

public class StringEx10_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String start = "������";
		
		while (true) {
			System.out.println("���þ� : " + start);
			String input = scan.next();
			if (start.charAt(start.length() - 1) == input.charAt(0)) {
				start = input;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				break;
			}
		}
	}
}
