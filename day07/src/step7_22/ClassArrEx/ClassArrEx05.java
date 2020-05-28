package step7_22.ClassArrEx;

/*
 * �޼��� �����ε�(overloading)
 * ���� �̸��� ��������� ���� �ٸ� �Ű����� ������ ������ �ִ� �޼��带 ���� �� ����
 * System.out.println() �޼��尡 ��ǥ���� ��
 * 
 * �����ε��� ����
 * 1. �޼����� �̸��� ���ƾ���
 * 2. �Ű������� ���� �Ǵ� �ڷ����� �޶����
 */

class Mobile{
	String name;
	int price;
	String maker;
	
	void init() {
		name = "";
		price = 0;
		maker = "";
	}
	
	void init(String na, int pr, String ma) {
		name = na;
		price = pr;
		maker = ma;
	}
	
	void init(String na, int pr) {
		name = na;
		price = pr;
		maker = "";
	}
	
	void init(String na, String ma) {
		name = na;
		maker = ma;
		price = 0;
	}
	
	void init(int pr, String na) {
		name = na;
		price = pr;
		maker = "";
	}
}

public class ClassArrEx05 {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.init();
		m.init("������", 1000, "����");
		m.init("������", 1000);

	}
}
