package step1_03.var;

//변수 명명 규칙
//1. 숫자 시작 불가
//2. 특수문자는 _ / $ 가능
//3. 키워드 사용 불가
//4. 알파	벳 대소문자 구분

//패키지명, 변수명은 소문자로 시작, 클래스명은 대문자로 시작

public class VarEx03 {

	public static void main(String[] args) {
		
		int test = 1;
		int Test = 2;
		System.out.println(test);
		System.out.println(Test);
		
		int $money = 1000;
		int curPos = -1;
		System.out.println($money);
		System.out.println(curPos);
		
		int lnum = 10;
		System.out.println(lnum);
		
		//int #test = 10;
		//int void = 20;
		
	}

}
