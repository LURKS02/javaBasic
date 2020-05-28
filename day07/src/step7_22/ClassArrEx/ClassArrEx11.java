package step7_22.ClassArrEx;

/*
 * static : 전역변수
 * 프로그램 시작시 할당받고
 * 프로그램 종료시 해제되는 변수
 */

class Test{
	int a;
	static int b;
	int c;
	static void test() {
	}
}

public class ClassArrEx11 {

	public static void main(String[] args) {
		Test.b = 100;
		Test t = new Test();
		Test t1 = new Test();
		t.a = 1;
		t1.a = 2;
		t.b = 200;
		System.out.println(t1.a + " " + t1.b);
	}
}
