package step1_08.ifEx;

//if���� ����

/* 1. if 	  (���ǽ�1) {���ǽ�1�� ���� ��}
 *    else if (���ǽ�2) {���ǽ�2�� ���� ��}
 *    else 			  {���ǽ��� ��� ������ ��}
 */

public class IfEx13 {

	public static void main(String[] args) {
		
		int num = 10;
		
		if (num % 2 == 0) System.out.println("¦��");
		if (num % 2 == 1) System.out.println("Ȧ��");
		
		if (num % 2 == 0) System.out.println("¦��");
		else System.out.println("Ȧ��");
		
		if (10 == 10) System.out.println(10);
		if (11 == 11) System.out.println(11);
		
		//���� �� �Ϸ� ���� ���ǽ��� ������ ���� ������ �������� �ʴ´�.
		if (10 == 10) System.out.println(10);
		else if (11 == 11) System.out.println(11);
		
		System.out.println("1.��� 2.���� 3.��");
		int select = 1;
		if (select == 1) System.out.println("���");
		else if (select == 2) System.out.println("����");
		else if (select == 3) System.out.println("��");
		else System.out.println("����");
	}
}
