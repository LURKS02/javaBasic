package step1_10.whileEx;

import java.util.Scanner;

//�ݺ��� ���� 
//���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
//�Է��� ���ڰ� -100�̸� ���α׷��� �����Ѵ�.

public class WhileEx06_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("�Է�");
			int input = scan.nextInt();
			if(input == -100) {
				System.out.println("����");
				break;
			}
		}

	}

}
