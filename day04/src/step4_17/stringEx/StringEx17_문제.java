package step4_17.stringEx;

import java.util.Scanner;

// �ܾ� ��ü�ϱ�

public class StringEx17_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.println("�����ϰ� ���� �ܾ� �Է�");
		String word = scan.nextLine();
		System.out.println("�ٲ� �ܾ� �Է�");
		String replace = scan.nextLine();
		
		int frontind = -1;
		int backind = -1;
		
		for (int i = 0; i < text.length() - word.length() + 1; i++) {
			int cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if (text.charAt(i + j) == word.charAt(j))cnt++;
			}
			if (cnt == word.length()) {
				frontind = i;
				backind = i + word.length();
			}
		}
		if (frontind == -1 || backind == -1) System.out.println("��ü�Ϸ��� �ܾ �����ϴ�.");
		
		else {
			String front = text.substring(0, frontind);
			String back = text.substring(backind);
			text = front + replace + back;
			System.out.println(text);
		}

	}

}
