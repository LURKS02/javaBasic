package step6_21.methodEx;

/*
 * static ������ ��� ����
 * <static ����>
 * 1. ���� ��ġ : Ŭ���� ����
 * 2. �ۼ� ��� : ���� �ڷ��� �տ� static
 * Ŭ������ / ������ / new�� ���� ���� �� �̸����� ���
 * 
 * <��� ����>
 * 1. ���� ��ġ : Ŭ���� ����
 * 2. �ۼ� ��� : �Ϲ� ������ �����ϰ� �ۼ�
 * new�� ���� ���� �� �̸����� ���
 * 
 * ������ : Ŭ���� ������ �����ϴ� ������ �ڵ����� ���� �ʱ�ȭ�ȴ�.
 */

public class MethodEx11 {

	//Ŭ���� ����
	
	static int x;
	//Ŭ���� ��ü�� �������� �ʰ� ��� ����
	//��� �ν��Ͻ��� ���������� �������ϴ� �Ӽ�
	
	int y;
	int z;
	
	public static void main(String[] args) {
		
		System.out.println("static ���� = " + MethodEx11.x);
		MethodEx11 e = new MethodEx11();
		System.out.println("��� ���� = " + e.y);
		MethodEx11 e1 = new MethodEx11();
		System.out.println("��� ���� = " + e1.y);

	}

}
