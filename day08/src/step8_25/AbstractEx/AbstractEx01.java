package step8_25.AbstractEx;

/*
 * 클래스 속성
 * 은닉성, 상속, 추상화
 * 추상화 (Abstract) : 부모클래스를 상속받은 자식클래스에 특정 메서드를 만들도록 강제하는 것
 * 
 * abstract 위치 : 
 * 키워드를 강제할 메서드 앞
 * 클래스 앞
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
	abstract void test(); //메서드 이름만 만들어놓고 기능은 자식에서 생성
}

class D extends C {
	int d;
	void test() {
		//강제로 만들어야 하는 메서드
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
