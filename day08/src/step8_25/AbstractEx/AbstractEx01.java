package step8_25.AbstractEx;

/*
 * Ŭ���� �Ӽ�
 * ���м�, ���, �߻�ȭ
 * �߻�ȭ (Abstract) : �θ�Ŭ������ ��ӹ��� �ڽ�Ŭ������ Ư�� �޼��带 ���鵵�� �����ϴ� ��
 * 
 * abstract ��ġ : 
 * Ű���带 ������ �޼��� ��
 * Ŭ���� ��
 */

class A {
	int a;
	void test() {}
}

class B extends A {
	int b;
}

abstract class C {
	int c;
	abstract void test(); //�޼��� �̸��� �������� ����� �ڽĿ��� ����
}

class D extends C {
	int d;
	void test() {
		//������ ������ �ϴ� �޼���
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
