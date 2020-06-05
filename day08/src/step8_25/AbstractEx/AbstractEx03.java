package step8_25.AbstractEx;

class Base {
	String name;
	public void say() {
		System.out.println(name + "님 안녕하세요");
	}
}

class Sub extends Base {
	int age;
	@Override
	public void say() {
		System.out.println(name + "님은 " + age + "살 입니다.");
	}
}

public class AbstractEx03 {

	public static void main(String[] args) {
		
		//부모 클래스 타입으로 부모 클래스 객체를 생성
		Base base = new Base();
		base.name = "홍길동";
		base.say();
		
		//자식 클래스 타입으로 자식 클래스 객체를 생성
		Sub sub = new Sub();
		sub.name = "임꺽정";
		sub.age = 35;
		sub.say();
		
		//부모 클래스 타입에 자식 클래스 타입 객체 대입 가능
		//Base b = new Sub();
		//자식 클래스 타입에 부모 클래스 타입 객체 대입 불가능
		//Sub s = new Base();
		
		//Upcasting : 부모 클래스 타입에 자식 클래스 객체 대입
		Base b = sub;
		
		//Downcasting : 자식 클래스 타입에 부모 클래스 타입 객체가 생성된 주소 대입
		//Sub s = (Sub) base;
		//ClassCastException 발생
		//instanceof 연산자 : 객체들끼리 정상적으로 형변환이 가능한지 여부를 판단할 수 있음
		if (base instanceof Sub) {
			Sub s = (Sub)base;
		} else System.out.println("base 객체를 Sub 클래스 타입으로 형변환 시킬 수 없습니다.");

		try {
			Sub s = (Sub)base;
		} catch(ClassCastException e) {
			System.out.println("base 객체를 Sub 클래스 타입으로 형변환 시킬 수 없습니다.");
		}
	}

}
