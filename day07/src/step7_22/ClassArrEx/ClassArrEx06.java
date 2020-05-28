package step7_22.ClassArrEx;

/*
 * ������(constructor)
 * 
 * �����ڴ� �ݵ�� Ŭ���� �̸��� ���ƾ��Ѵ�.
 * �����ڴ� new Ŭ������(); �� ȣ��ȴ�.
 * �����ڴ� ��������� �ʱ�ȭ��ų �������� ���ȴ�.
 * 
 * �����ڸ� �������� ������, �����Ϸ��� �ڵ����� �⺻ �����ڸ� ����
 * �⺻������ : �Ű������� �ƹ��͵� ���� ������
 * �����ڴ� ����Ÿ���� ������ �ʴ´�.
 */

class fruit {
	String name;
	int price;
	
	//�⺻ ������
	fruit(){}
	
	//������ �����ε�
	fruit(String name, int price){
		this.name = name;
		this.price = price;	
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void printData() {
		System.out.println(name + "(" + price + "��)");
	}
}

public class ClassArrEx06 {

	public static void main(String[] args) {
		
		/* ������ �޼���
		 * �ν��Ͻ� �������� �ʱ�ȭ�Ҷ� ������ �޼��带 ������ �ʰ� ������ �޼��带 ����
		 */
		fruit apple = new fruit();
		//���� ����
		apple.name = "���";
		apple.price = 1000;
		
		//�޼���� ������� �ʱ�ȭ
		apple.setData("���", 1000);
		apple.printData();
		
		//�����ڷ� ������� �ʱ�ȭ
		fruit banana = new fruit("�ٳ���", 3700);
		banana.printData();
		
	}

}
