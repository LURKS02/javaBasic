package step4_17.stringEx;

import java.util.Scanner;
import java.util.Random;

// Ÿ�ڿ��� [1�ܰ�]

public class StringEx11_���� {

	public static void main(String[] args) {
	
		String[] words = {"java", "mysql", "jsp", "spring"};
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		// ����
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		for (int i = 0; i < words.length; i++) {
			System.out.println("���� : " + words[i]);
			String input = scan.next();
			if (words[i].compareTo(input) == 0) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				i--;
			}
		}
	}
}
