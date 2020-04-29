package step3_14.stringEx;

import java.util.Scanner;

/*
 * 문자열 비교
 * equals() 메서드로 확인
 */
public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = "김철수";
		System.out.println("이름을 입력해주세요.");
		String myName = scan.next();
		
		/* == 비교연산자
		 * 두 변수의 주소값을 비교 (call by Reference)
		 * int는 기본형 타입(Primitive type)이므로 실제값이 stack에 저장
		 * 즉 비교연산자를 통해 비교하면 실제값으로 비교하게 됨
		 */
		
		if (myName == name) {
			System.out.println("==연산자 : 일치");
		}
		else {
			System.out.println("==연산자 : 불일치");
		}
		
		/* equals() 메소드
		 * 두 변수의 값 자체를 비교 (call by Value)
		 * String은 Reference type이므로 heap에 저장되며 주소값 참조
		 */
		
		if (name.equals(myName)) {
			System.out.println("equals() 메서드 : 일치");
		}
		else {
			System.out.println("equals() 메서드 : 불일치");
		}

		/*
		 * Primitive type = boolean, byte, short, int, long, float, double, char
		 * Reference type = Array, String, Class, Interface
		 */	
	}
}
