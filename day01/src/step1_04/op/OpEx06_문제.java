package step1_04.op;

public class OpEx06_���� {

	public static void main(String[] args) {
		//ex) ������ 60�� �̻��̸� true ���
		int score = 30;
		System.out.println(score >= 60);
		
		//����1) 3�� ����̸� true ���
		int num = 15;
		System.out.println(num % 3 == 0);
		
		//����2) ¦���̸� true ���
		num = 22;
		System.out.println(num % 2 == 0);
		
		//����3) 1000�� ���� ȭ�� 3�� �̻��̸� true ���
		int money = 178600;
		System.out.println(money % 5000 / 1000 >= 3);
		
		
	}

}
