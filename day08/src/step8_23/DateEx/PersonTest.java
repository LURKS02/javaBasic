package step8_23.DateEx;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		System.out.println(person);
		//toString() : 객체에 저장된 내용을 출력
		System.out.println(person.toString());
		
		Person person2 = new Person("홍길동", true, "1등입니다.");
		System.out.println("person2 : " + person2);
		
		Person person3 = new Person("홍길동", true, "1등입니다.");
		System.out.println("person3 : " + person3);
		
		person.count = 100;
		System.out.println(person2.count);
		
		Person.count = 999;
		System.out.println(person.count);
		System.out.println(person2.count);
		System.out.println(person3.count);

	}

}
