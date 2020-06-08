package step8_27.PolymorphismEx;

import java.util.Scanner;

/*
 * ������ [polymorphism]
 * �ϳ��� �޼ҵ尡 ���� �ٸ� Ŭ�������� �پ��ϰ� ����Ǵ� ��
 * ������ ������ ���ؼ��� �������� ������ �޼ҵ尡 ���Ե� ��� Ŭ������ ���� �θ� Ŭ������ ������ ��
 * �θ�� �ڽ� Ŭ������ ���� �޼ҵ尡 �־�� �ϸ� �ڽ� Ŭ������ �ݵ�� �� �޼ҵ带 Override �ؾ���
 * �θ� Ŭ���� Ÿ�Կ� �ڽ� Ŭ���� Ÿ���� ���Խ��� �������� ������ �޼ҵ� ����
 */

abstract class Shape {
	int x;
	int y;
	public void move() {}
	public abstract void draw();
}

class Point extends Shape {
	@Override
	public void draw() {
		System.out.println("���� ��´�.");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}
}

class TriAngle extends Shape {
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
}

public class PolymorphismEx02 {

	public static void main(String[] args) {
		
		Shape shape = new Point();
		shape.draw();
		
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �۾��� �����ϼ���.");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();

	}

}
