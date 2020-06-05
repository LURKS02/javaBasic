package step8_26.InterfaceEx;

class Point {
	int x, y;
	public void move() {}
}

class Shape {
	/*
	 * final (상수)
	 * 해당 변수는 프로그램에서 값을 변경시킬 수 없음
	 * final 메소드는 override시킬 수 없음
	 * final 클래스는 상속시킬 수 없음
	 */
	public static final double PI = 3.141592;
	public void draw() {}
	public void erase() {}
}

//class Line extends Point, Shape {} 
//java는 다중상속 지원 X

//interface는 정적멤버(static)변수와 추상메소드로만 구성된 클래스
interface Draw {
	public static final double PI = 3.141592;
	int LIMIT = 1000; //public static final 자동으로 붙여짐
	public abstract void move1(); //추상 메소드
	void erase(); //public abstract 자동으로 붗여짐
}

/* 클래스는 클래스끼리, 인터페이스는 인터페이스끼리 상속 가능
 * 클래스는 다중상속 허용 X 인터페이스는 다중상속 허용
 */

//표시(marker) 인터페이스 : 아무 내용도 없는 인터페이스
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
		
		//static 멤버 변수는 객체 선언이 필요하지 않음
		System.out.println(Shape.PI);
		
		//final 변수 값은 프로그램에서 변경 불가
		//Shape.PI = 1.2345678;
		
		System.out.println(Math.PI);
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);

	}

}
