package step5_20.classEx;

/*
 * 클래스(Class)
 * class 클래스명
 * {} : 자료형 영역
 * 
 * 선언
 * 자료형 변수명 = new 자료형();
 */

class Ex01{
	int x;
	int y;
}

public class ClassEx01 {
	public static void main(String[] args) {
		
		int a;
		String b;
		int[] arr;
		
		a = 10;
		b = "김영수";
		arr = new int[3];
		
		//클래스 : 사용자 정의 자료형
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
		
		System.out.println(e);

	}

}
