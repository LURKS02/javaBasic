package step1_06.ifEx;

//�α��� - 3�ܰ�
//Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
//Id�� Ʋ�� ���, �޼����� ����Ѵ�.
//Pw�� Ʋ�� ���, �޼����� ����Ѵ�.
//Id�� Pw ��� ��ġ�ϴ� ���, �޼����� ����Ѵ�.

import java.util.Scanner;

public class IfEx09_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.println("Id �Է�");
		int inputId = scan.nextInt();
		
		if (inputId == dbId) {
			System.out.println("Pw �Է�");
			int inputPw = scan.nextInt();
			
			if (dbPw != inputPw) System.out.println("Pw�� Ȯ�����ּ���.");
			else System.out.println("�α��� ����");
		}
		
		else System.out.println("Id�� Ȯ�����ּ���.");
		
	}
}
