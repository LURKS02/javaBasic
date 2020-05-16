package step5_20.classEx;

class Student{
	String name;
	int score;
}

public class ClassEx02 {

	public static void main(String[] args) {
		
		//동일 패키지 안의 클래스는 다른 클래스에서도 사용 가능
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
		
		Student hgd = new Student();
		hgd.name = "홍길동";
		hgd.score = 100;
		
	}
}
