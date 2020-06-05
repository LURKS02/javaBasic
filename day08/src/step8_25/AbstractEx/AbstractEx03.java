package step8_25.AbstractEx;

class Base {
	String name;
	public void say() {
		System.out.println(name + "�� �ȳ��ϼ���");
	}
}

class Sub extends Base {
	int age;
	@Override
	public void say() {
		System.out.println(name + "���� " + age + "�� �Դϴ�.");
	}
}

public class AbstractEx03 {

	public static void main(String[] args) {
		
		//�θ� Ŭ���� Ÿ������ �θ� Ŭ���� ��ü�� ����
		Base base = new Base();
		base.name = "ȫ�浿";
		base.say();
		
		//�ڽ� Ŭ���� Ÿ������ �ڽ� Ŭ���� ��ü�� ����
		Sub sub = new Sub();
		sub.name = "�Ӳ���";
		sub.age = 35;
		sub.say();
		
		//�θ� Ŭ���� Ÿ�Կ� �ڽ� Ŭ���� Ÿ�� ��ü ���� ����
		//Base b = new Sub();
		//�ڽ� Ŭ���� Ÿ�Կ� �θ� Ŭ���� Ÿ�� ��ü ���� �Ұ���
		//Sub s = new Base();
		
		//Upcasting : �θ� Ŭ���� Ÿ�Կ� �ڽ� Ŭ���� ��ü ����
		Base b = sub;
		
		//Downcasting : �ڽ� Ŭ���� Ÿ�Կ� �θ� Ŭ���� Ÿ�� ��ü�� ������ �ּ� ����
		//Sub s = (Sub) base;
		//ClassCastException �߻�
		//instanceof ������ : ��ü�鳢�� ���������� ����ȯ�� �������� ���θ� �Ǵ��� �� ����
		if (base instanceof Sub) {
			Sub s = (Sub)base;
		} else System.out.println("base ��ü�� Sub Ŭ���� Ÿ������ ����ȯ ��ų �� �����ϴ�.");

		try {
			Sub s = (Sub)base;
		} catch(ClassCastException e) {
			System.out.println("base ��ü�� Sub Ŭ���� Ÿ������ ����ȯ ��ų �� �����ϴ�.");
		}
	}

}
