package step1_09.print;

//��¹��� ����
/*
 * 1. System.out.println();
 * �ٹٲ� ���� (ln = �ٹٲ�)
 * 
 * 2. System.out.print();
 * �ٹٲ� �Ұ�
 * 
 * 3. System.out.printf();
 * ���Ĺ��� ���
 * %d = ���� / %f = �Ҽ� / %c = ���� 1�� / %s = ���� ������
 * 
 */

public class PrintEx03 {

	public static void main(String[] args) {
		
		System.out.println("�ȳ��ϼ���.");
		//�ٹٲ�
		
		System.out.print("�ȳ�"); //�ٹٲ� X
		System.out.println("�ϼ���.");
		
		/* �̽������� ����
		 * \n = �ٹٲ�
		 * \t = tab
		 * \" = "
		 * \' = '
		 */

		System.out.println("�ȳ�\n�ϼ���."); //�ٹٲ�
		System.out.println("�ȳ�\t�ϼ���."); //��
		System.out.println("\"�ȳ��ϼ���.\"");
		System.out.println("\'�ȳ��ϼ���.\'");
		
	}

}
