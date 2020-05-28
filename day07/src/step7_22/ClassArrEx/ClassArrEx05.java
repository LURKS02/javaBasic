package step7_22.ClassArrEx;

/*
 * 메서드 오버로딩(overloading)
 * 같은 이름을 사용하지만 서로 다른 매개변수 형식을 가지고 있는 메서드를 여러 개 정의
 * System.out.println() 메서드가 대표적인 예
 * 
 * 오버로딩의 조건
 * 1. 메서드의 이름이 같아야함
 * 2. 매개변수의 개수 또는 자료형이 달라야함
 */

class Mobile{
	String name;
	int price;
	String maker;
	
	void init() {
		name = "";
		price = 0;
		maker = "";
	}
	
	void init(String na, int pr, String ma) {
		name = na;
		price = pr;
		maker = ma;
	}
	
	void init(String na, int pr) {
		name = na;
		price = pr;
		maker = "";
	}
	
	void init(String na, String ma) {
		name = na;
		maker = ma;
		price = 0;
	}
	
	void init(int pr, String na) {
		name = na;
		price = pr;
		maker = "";
	}
}

public class ClassArrEx05 {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.init();
		m.init("아이폰", 1000, "애플");
		m.init("아이폰", 1000);

	}
}
