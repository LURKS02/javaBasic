package step4_17.stringEx;

import java.util.Scanner;

/*
 * next() : ������ �������� �� �ܾ �Է¹���
 * nextLine() : ���� �� ���� ��ü�� �Է¹���
 */

public class StringEx15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է�");
		String name = scan.nextLine();
		System.out.println(name);
		//hello java
		
		System.out.println("�Է�");
		name = scan.next();
		System.out.println(name);
		//hello
		
	}

}
