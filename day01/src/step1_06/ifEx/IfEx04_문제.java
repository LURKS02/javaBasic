package step1_06.ifEx;

import java.util.Scanner;

//�α��� - 1�ܰ�
//ID�� PW�� �Է¹޴´�.
//�Է¹��� �����Ϳ� DB�� ���� �α��� ó���� �����Ѵ�.
//ex. �α��� ���� or �α��� ����

public class IfEx04_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.println("Id�� �Է��ϼ���.");
		int inputId = scan.nextInt();
		
		System.out.println("Pw�� �Է��ϼ���.");
		int inputPw = scan.nextInt();
		
		if(dbId == inputId && dbPw == inputPw) {
			System.out.println("�α��� ����");
		}

		else {
			System.out.println("�α��� ����");
		}
	}

}
