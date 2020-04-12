package step1_08.ifEx;

//if문의 구조

/* 1. if 	  (조건식1) {조건식1이 참일 때}
 *    else if (조건식2) {조건식2가 참일 때}
 *    else 			  {조건식이 모두 거짓일 때}
 */

public class IfEx13 {

	public static void main(String[] args) {
		
		int num = 10;
		
		if (num % 2 == 0) System.out.println("짝수");
		if (num % 2 == 1) System.out.println("홀수");
		
		if (num % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
		if (10 == 10) System.out.println(10);
		if (11 == 11) System.out.println(11);
		
		//다중 택 일로 참인 조건식을 만나면 이하 조건은 실행하지 않는다.
		if (10 == 10) System.out.println(10);
		else if (11 == 11) System.out.println(11);
		
		System.out.println("1.사과 2.포도 3.감");
		int select = 1;
		if (select == 1) System.out.println("사과");
		else if (select == 2) System.out.println("포도");
		else if (select == 3) System.out.println("감");
		else System.out.println("오류");
	}
}
