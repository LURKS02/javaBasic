package step1_10.whileEx;

import java.util.Scanner;

//���θ� �ڷΰ���

public class WhileEx17_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. �����Ƿ� 2. �����Ƿ� 3. ����");
			System.out.println("�޴� ����");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				while(true) {
					System.out.println("1. Ƽ���� 2. ���� 3. �ڷΰ���");
					int sel2 = scan.nextInt();
					if (sel2 == 1) {}
					else if (sel2 == 2) {}
					else break;
				}
			}
			
			else if(sel == 2) {
				while(true) {
					System.out.println("1. ����� 2. ġ�� 3. �ڷΰ���");
					int sel2 = scan.nextInt();
					if (sel2 == 1) {}
					else if(sel2 == 2) {}
					else break;
				}
			}
			
			else {
				System.out.println("���α׷� ���� ");
				break;
			}
		}

	}

}
