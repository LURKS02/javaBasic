package step3_14.stringEx;

import java.util.Scanner;

/*
 * ���ڿ� ��
 * equals() �޼���� Ȯ��
 */
public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = "��ö��";
		System.out.println("�̸��� �Է����ּ���.");
		String myName = scan.next();
		
		/* == �񱳿�����
		 * �� ������ �ּҰ��� �� (call by Reference)
		 * int�� �⺻�� Ÿ��(Primitive type)�̹Ƿ� �������� stack�� ����
		 * �� �񱳿����ڸ� ���� ���ϸ� ���������� ���ϰ� ��
		 */
		
		if (myName == name) {
			System.out.println("==������ : ��ġ");
		}
		else {
			System.out.println("==������ : ����ġ");
		}
		
		/* equals() �޼ҵ�
		 * �� ������ �� ��ü�� �� (call by Value)
		 * String�� Reference type�̹Ƿ� heap�� ����Ǹ� �ּҰ� ����
		 */
		
		if (name.equals(myName)) {
			System.out.println("equals() �޼��� : ��ġ");
		}
		else {
			System.out.println("equals() �޼��� : ����ġ");
		}

		/*
		 * Primitive type = boolean, byte, short, int, long, float, double, char
		 * Reference type = Array, String, Class, Interface
		 */	
	}
}
