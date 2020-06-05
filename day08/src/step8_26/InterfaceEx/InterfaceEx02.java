package step8_26.InterfaceEx;

class Point {
	int x, y;
	public void move() {}
}

class Shape {
	/*
	 * final (���)
	 * �ش� ������ ���α׷����� ���� �����ų �� ����
	 * final �޼ҵ�� override��ų �� ����
	 * final Ŭ������ ��ӽ�ų �� ����
	 */
	public static final double PI = 3.141592;
	public void draw() {}
	public void erase() {}
}

//class Line extends Point, Shape {} 
//java�� ���߻�� ���� X

//interface�� �������(static)������ �߻�޼ҵ�θ� ������ Ŭ����
interface Draw {
	public static final double PI = 3.141592;
	int LIMIT = 1000; //public static final �ڵ����� �ٿ���
	public abstract void move1(); //�߻� �޼ҵ�
	void erase(); //public abstract �ڵ����� �ʿ���
}

/* Ŭ������ Ŭ��������, �������̽��� �������̽����� ��� ����
 * Ŭ������ ���߻�� ��� X �������̽��� ���߻�� ���
 */

//ǥ��(marker) �������̽� : �ƹ� ���뵵 ���� �������̽�
interface Graphics extends Draw, Graphic {}

interface Graphic {
	void resize();
	void rotate();
}

class Line extends Point implements Draw, Graphic {
	
	//Graphic
	@Override
	public void resize () {
	}
	@Override
	public void rotate() {
	}
	
	//Draw
	@Override
	public void erase() {
	}
	
	//Point
	@Override
	public void move1() {
	}
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		
		//static ��� ������ ��ü ������ �ʿ����� ����
		System.out.println(Shape.PI);
		
		//final ���� ���� ���α׷����� ���� �Ұ�
		//Shape.PI = 1.2345678;
		
		System.out.println(Math.PI);
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);

	}

}
