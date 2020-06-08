package step8_27.PolymorphismEx;

import java.util.Scanner;

/*
 * 다형성 [polymorphism]
 * 하나의 메소드가 서로 다른 클래스에서 다양하게 실행되는 것
 * 다형성 구현을 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 가져야 함
 * 부모와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 반드시 이 메소드를 Override 해야함
 * 부모 클래스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드 실행
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
		System.out.println("점을 찍는다.");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("선을 그린다.");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}
}

class TriAngle extends Shape {
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class PolymorphismEx02 {

	public static void main(String[] args) {
		
		Shape shape = new Point();
		shape.draw();
		
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 작업을 선택하세요.");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();

	}

}
