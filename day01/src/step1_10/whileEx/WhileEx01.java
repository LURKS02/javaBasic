package step1_10.whileEx;

//반복문 while
//반복문 : 초기식 + 조건식 + 증감식

//구조
//while(조건식){조건식이 참일 동안 실행할 문장 + 증감식}

public class WhileEx01 {

	public static void main(String[] args) {
		//ex) 1~5까지 출력
		int i = 1;      //초기식
		while(i <= 5) { //조건식
			System.out.println(i);
			i += 1;     //증감식
		}

	}

}
