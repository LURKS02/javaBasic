package step5_20.classEx;

/*
 * Ŭ����(Class)
 * class Ŭ������
 * {} : �ڷ��� ����
 * 
 * ����
 * �ڷ��� ������ = new �ڷ���();
 */

class Ex01{
	int x;
	int y;
}

public class ClassEx01 {
	public static void main(String[] args) {
		
		int a;
		String b;
		int[] arr;
		
		a = 10;
		b = "�迵��";
		arr = new int[3];
		
		//Ŭ���� : ����� ���� �ڷ���
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
		
		System.out.println(e);

	}

}
