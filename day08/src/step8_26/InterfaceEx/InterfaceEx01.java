package step8_26.InterfaceEx;

abstract class AA {
	abstract void test1();
	void test2() {}
}

class BB extends AA {
	void test1() {
	}
}

interface EE {
	public void test3();
}

interface CC {
	public void test1();
	public void test2();
}

class DD implements CC, EE {
	public void test1() {}
	public void test2() {}
	public void test3() {}
}

/*
 * �������̽� (Interface) Ŭ����
 * �߻� Ŭ�������� �� �߻�ȭ�� Ŭ���� (���� ����)
 * 1. ���� ������ ���� ���� ���� �⺻ ���赵
 * 2. ���, �߻� �޼��常 ����� ����
 * 3. �ν��Ͻ� ������ �Ұ���, Ŭ���� �ۼ��� ������ �ִ� ���� ����
 * 4. ������ ��Ģ�� �°� �����ϵ��� ǥ�� ����
 * 5. ���߻�� ����
 */

public class InterfaceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
