package step8_24.ExtendsEx;

/*
 * Ŭ���� 4�Ӽ�
 * 1. ���м� : private / default / public ����������
 * 2. ��� : Ŭ���� �� �θ��ڽ��� ����
 * �ڹ��� ��� Ŭ������ Object Ŭ������ ��ӹ��� ���¿��� ����
 * 1���� ��� ����
 */

class A extends Object {
	int a;
}

class B extends A {
	int b;
}

class C {
	A aa = new A();
	int c;
}

public class ExtendsEx01 {
	//���
	public static void main(String[] args) {
		
		B bb = new B();
		C cc = new C();
		bb.a = 10;
		cc.aa.a = 10;
	}
}
