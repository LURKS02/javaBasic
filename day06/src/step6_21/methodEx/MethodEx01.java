package step6_21.methodEx;

/*
 * Ŭ���� �������
 * 1.����		2.�޼���(method)
 */

class Student {
	void say() {
		System.out.println("�ȳ��ϼ���.");
		//return		: void�϶� ���� ����
	}
}

public class MethodEx01 {

	public static void main(String[] args) {
		//main �޼���� ���� ���� ȣ���
		
		Student hgd = new Student();
		hgd.say();
		//�޼��� ȣ�� �� �޸𸮴� stack�� ���δ�.
	}
}
