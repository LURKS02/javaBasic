package step3_13.arrayEx;

//상수
/*
 * 변수 : 변할 수 있는 수
 * 상수 : 변할 수 없는 수
 * 		 자료형 앞에 final을 붙인다.
 * 		 일반 변수와의 구분을 위해 변수명을 대문자로 작성
 */

public class ArrayEx27 {

	public static void main(String[] args) {
		//변수
		int size = 9;
		size = 1;
		//상수
		final int MAX_SIZE = 9;
		//MAX_SIZE = 1;		 에러 발생
	}

}
