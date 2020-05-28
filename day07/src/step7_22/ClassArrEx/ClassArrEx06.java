package step7_22.ClassArrEx;

/*
 * 생성자(constructor)
 * 
 * 생성자는 반드시 클래스 이름과 같아야한다.
 * 생성자는 new 클래스명(); 시 호출된다.
 * 생성자는 멤버변수를 초기화시킬 목적으로 사용된다.
 * 
 * 생성자를 정의하지 않으면, 컴파일러가 자동으로 기본 생성자를 생성
 * 기본생성자 : 매개변수에 아무것도 없는 생성자
 * 생성자는 리턴타입을 가지지 않는다.
 */

class fruit {
	String name;
	int price;
	
	//기본 생성자
	fruit(){}
	
	//생성자 오버로딩
	fruit(String name, int price){
		this.name = name;
		this.price = price;	
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void printData() {
		System.out.println(name + "(" + price + "원)");
	}
}

public class ClassArrEx06 {

	public static void main(String[] args) {
		
		/* 생성자 메서드
		 * 인스턴스 변수들을 초기화할때 별도의 메서드를 만들지 않고 생성자 메서드를 제공
		 */
		fruit apple = new fruit();
		//직접 접근
		apple.name = "사과";
		apple.price = 1000;
		
		//메서드로 멤버변수 초기화
		apple.setData("사과", 1000);
		apple.printData();
		
		//생성자로 멤버변수 초기화
		fruit banana = new fruit("바나나", 3700);
		banana.printData();
		
	}

}
