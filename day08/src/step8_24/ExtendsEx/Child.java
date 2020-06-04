package step8_24.ExtendsEx;

//부모 (상위,슈퍼,기반) 클래스
class Parent {
	
	//private String name;
	//private boolean gender;
	protected String name;
	protected boolean gender;
	
	public Parent() {
		//현재 클래스의 다른 생성자
		//Parent(String name, boolean gender)를 실행
		this("무명씨", true);
		System.out.println("부모 클래스의 기본 생성자 실행");
	}
	
	public Parent(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return name + "(" + (gender? "남" : "여") + ")";
	}
}

//자식 (하위,서브,파생) 클래스
//상속 형식 : class 자식클래스 extends 부모클래스
//자바는 다중상속 지원x
public class Child extends Parent{
	private int age;
	private String nickName;
	
	public Child() {
		super();
		System.out.println("자식 클래스의 기본 생성자 실행");
	}
	
	public Child(String name, boolean gender, int age, String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
	
	@Override
	//상속에서 함수명과 리턴타입, 매개변수가 같은 함수를 부모/자식클래스에서 재정의 해주는 것
	public String toString() {
		return name + "(" + (gender ? "남" : "여") + ") - " + age + ", " + nickName;
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent);
		Parent parent2 = new Parent("성춘향", false);
		System.out.println(parent2);
		System.out.println("======================");
		
		//자식 클래스 생성자가 먼저 생성되기 전에 부모 클래스 생성자가 먼저 실행
		Child child = new Child();
		System.out.println(child);
		System.out.println("===");
		Child child2 = new Child("임꺽정", true, 42, "도적");
		System.out.println(child2);
		
	}
}

