package step4_17.stringEx;

import java.util.Scanner;
import java.util.Random;

// Ÿ�ڿ��� [2�ܰ�]

public class StringEx12_���� {

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
			int k = ran.nextInt(words[i].length());
			String temp = words[i].substring(0,k) + "*" + words[i].substring(k + 1);
			System.out.println("���� : " + temp);
			
			String input = scan.next();
			if (input.equals(words[i])) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("�����Դϴ�.");
				i--;
			}
		}
		
	}
}
