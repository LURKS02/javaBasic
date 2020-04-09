package step1_03.var;

//변수 = 하나의 값을 저장할 수 있는 메모리 공간
//변수의 선언 (메모리 할당) : int a;
//변수 초기화 : a = 10;

public class VarEx01 {

	public static void main(String[] args) {
	
		//자료형
		
		//1. 정수 : int
		int num;
		num = 10;
		System.out.println(num);
		
		//2. 실수 : double
		double dnum = 3.14;
		System.out.println(dnum);
		
		//3. 문자 한개 : char
		char c1 = 'a';
		System.out.println(c1);
		char c2 = '가';
		System.out.println(c2);
		
		//4. 문자열 : string
		String str = "java";
		System.out.println(str);
		
		//5. 논리값 : boolean
		boolean result = true;
		System.out.println(result);
		
	}

}
