package step4_17.stringEx;

import java.util.Random;
import java.util.Scanner;

// ���� : ����ܾ� ���߱�  

public class Test07 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int checks = 0;
		int check[] = new int[size];
		
		while (true) {
			if (checks == size) {
				System.out.println("������ ������ ���߽��ϴ�.");
				System.out.println("���� : " + word);
				System.out.println("���� : 0��");
				break;
			}
			
			System.out.print("���� : ");
			for (int i = 0; i < word.length(); i++) {
				if (check[i] == 0) System.out.print("*");
				else System.out.print(word.charAt(i));
			}
			System.out.println();
			System.out.println("�� : " + meaning);
			
			System.out.println("���� ?");
			String input = scan.next();
			if (!input.equals(word)) {
				System.out.println("������ �ƴմϴ�.");
				score -= 5;
				while(true) {
					int num = ran.nextInt(size);
					if (check[num] == 1) continue;
					else {
						for (int i = 0; i < size; i++) {
							if (word.charAt(num) == word.charAt(i)) {
								check[i] = 1;
								checks++;
							}
						}
						break;
					}
				}
			}
			else {
				System.out.println("�����Դϴ�.");
				System.out.println("���� : " + score);
				break;
			}
		}
	}
}
