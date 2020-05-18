package step6_21.methodEx;

/*
 * 클래스 구성요소
 * 1.변수		2.메서드(method)
 */

class Student {
	void say() {
		System.out.println("안녕하세요.");
		//return		: void일때 생략 가능
	}
}

public class MethodEx01 {

	public static void main(String[] args) {
		//main 메서드는 제일 먼저 호출됨
		
		Student hgd = new Student();
		hgd.say();
		//메서드 호출 시 메모리는 stack에 쌓인다.
	}
}
