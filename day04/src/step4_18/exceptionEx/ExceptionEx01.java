package step4_18.exceptionEx;

//예외처리 (Exception)

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int num = 10;
		// System.out.println(num / 0); : java.lang.ArithmeticException : / by zero
		// 오류를 발생시키는 내용은 
		// try(if) catch(else) 구문 사용
		
		try {
			System.out.println(num / 0);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("종료");
	}

}
