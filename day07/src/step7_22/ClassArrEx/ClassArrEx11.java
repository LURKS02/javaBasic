package step7_22.ClassArrEx;

/*
 * static : ��������
 * ���α׷� ���۽� �Ҵ�ް�
 * ���α׷� ����� �����Ǵ� ����
 */

class Test{
	int a;
	static int b;
	int c;
	static void test() {
	}
}

public class ClassArrEx11 {

	public static void main(String[] args) {
		Test.b = 100;
		Test t = new Test();
		Test t1 = new Test();
		t.a = 1;
		t1.a = 2;
		t.b = 200;
		System.out.println(t1.a + " " + t1.b);
	}
}
