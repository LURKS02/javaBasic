package step1_06.ifEx;

//���ǹ� : if , switch-case
//�ݺ��� : for, while, do-while
//���� ��� : break, continue

//if
//if(���ǽ�){ ������ ���� �� ������ ���� }

public class IfEx01_���� {

	public static void main(String[] args) {
		if(true) {
			System.out.println("���� O");
		}

		if(false) {
			System.out.println("���� X");	
		}
		
		//ex) Ȧ¦
		int num = 8;
		System.out.println(num % 2 == 0);
		System.out.println(num % 2 == 1);
		
		if(num % 2 == 0) {
			System.out.println("¦��");
		}
		if(num % 2 == 1) {
			System.out.println("Ȧ��");
		}
		
		//���� 1) ���, 0, ���� ���
		num = -10;
		if (num > 0) {
			System.out.println("���");
		}
		if (num == 0) {
			System.out.println("0");
		}
		if (num < 0) {
			System.out.println("����");
		}
		
		
		//���� 2) 4�� ��� ���
		num = 12;
		if (num % 4 == 0) {
			System.out.println("4�� ���");
		}
		
		//���� 3) �հ�, ���հ� ���
		int score = 87;
		if (score >= 60) {
			System.out.println("�հ�");
		}
		if (score < 60) {
			System.out.println("���հ�");
		}
		
	}

}
