package step1_06.ifEx;

import java.util.Scanner;

//�α��� - 2�ܰ�
//Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
//���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
//���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
//ex. �α��� ���� or �α��� ����

public class IfEx05_���� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.println("ȸ�������� �����մϴ�.");
		System.out.println("Id�� �Է����ּ���.");
		dbId = scan.nextInt();
		System.out.println("Pw�� �Է����ּ���.");
		dbPw = scan.nextInt();
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		
		System.out.println("�α����� �����մϴ�.");
		
		System.out.println("Id�� �Է����ּ���.");
		int inputId = scan.nextInt();
		System.out.println("Pw�� �Է����ּ���.");
		int inputPw = scan.nextInt();
		
		if(dbId == inputId && dbPw == inputPw) {
			System.out.println("�α��� ����");
		}
		
		else {
			System.out.println("�α��� ����");
		}

	}

}
