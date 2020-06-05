package step8_26.InterfaceEx;

abstract class AA {
	abstract void test1();
	void test2() {}
}

class BB extends AA {
	void test1() {
	}
}

interface EE {
	public void test3();
}

interface CC {
	public void test1();
	public void test2();
}

class DD implements CC, EE {
	public void test1() {}
	public void test2() {}
	public void test3() {}
}

/*
 * 인터페이스 (Interface) 클래스
 * 추상 클래스보다 더 추상화된 클래스 (전부 강제)
 * 1. 실제 구현된 것이 전혀 없는 기본 설계도
 * 2. 상수, 추상 메서드만 멤버로 지님
 * 3. 인스턴스 생성이 불가능, 클래스 작성에 도움을 주는 것이 목적
 * 4. 정해진 규칙에 맞게 구현하도록 표준 제시
 * 5. 다중상속 가능
 */

public class InterfaceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
