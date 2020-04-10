package step1_06.ifEx;

//변수의 scope (생명 주기)
//변수는 일반적으로 자신이 속한 중괄호 내에서만 접근 가능
//지역변수는 선언된 영역을 벗어나면 자동으로 메모리에서 삭제

public class IfEx10 {

	public static void main(String[] args) {
		
		int x = 10;
		
		if(true) {
			System.out.println("x = " + x);
			
			int y = 20; //if문 내에서만 살아있는 변수
		}
		// System.out.println("y = " + y); 실행 불가

	}

}
