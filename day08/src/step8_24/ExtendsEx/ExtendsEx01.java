package step8_24.ExtendsEx;

/*
 * 클래스 4속성
 * 1. 은닉성 : private / default / public 접근제어자
 * 2. 상속 : 클래스 간 부모자식을 설정
 * 자바의 모든 클래스는 Object 클래스를 상속받은 상태에서 시작
 * 1개만 상속 가능
 */

class A extends Object {
	int a;
}

class B extends A {
	int b;
}

class C {
	A aa = new A();
	int c;
}

public class ExtendsEx01 {
	//상속
	public static void main(String[] args) {
		
		B bb = new B();
		C cc = new C();
		bb.a = 10;
		cc.aa.a = 10;
	}
}
