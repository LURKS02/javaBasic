package step1_10.whileEx;

import java.util.Scanner;

//�Ҽ�ã�� - 1�ܰ�

public class WhileEx13_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int i = 1;
		int cnt = 0;
		
		while(i <= input) {
			if (input % i == 0) cnt++;
			i++;
		}
		
		if(cnt == 2) System.out.println("�Ҽ��Դϴ�.");
		else System.out.println("�Ҽ��� �ƴմϴ�.");

	}

}
