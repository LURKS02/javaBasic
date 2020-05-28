package step6_21.methodEx;

/*
 * static 변수와 멤버 변수
 * <static 변수>
 * 1. 선언 위치 : 클래스 영역
 * 2. 작성 방법 : 변수 자료형 앞에 static
 * 클래스명 / 변수명 / new로 변수 생성 후 이름으로 사용
 * 
 * <멤버 변수>
 * 1. 선언 위치 : 클래스 영역
 * 2. 작성 방법 : 일반 변수와 동일하게 작성
 * new로 변수 생성 후 이름으로 사용
 * 
 * 공통점 : 클래스 영역에 선언하는 변수는 자동으로 값이 초기화된다.
 */

public class MethodEx11 {

	//클래스 영역
	
	static int x;
	//클래스 객체를 생성하지 않고도 사용 가능
	//모든 인스턴스가 공통적으로 가져야하는 속성
	
	int y;
	int z;
	
	public static void main(String[] args) {
		
		System.out.println("static 변수 = " + MethodEx11.x);
		MethodEx11 e = new MethodEx11();
		System.out.println("멤버 변수 = " + e.y);
		MethodEx11 e1 = new MethodEx11();
		System.out.println("멤버 변수 = " + e1.y);

	}

}
