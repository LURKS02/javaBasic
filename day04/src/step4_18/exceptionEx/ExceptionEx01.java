package step4_18.exceptionEx;

//����ó�� (Exception)

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int num = 10;
		// System.out.println(num / 0); : java.lang.ArithmeticException : / by zero
		// ������ �߻���Ű�� ������ 
		// try(if) catch(else) ���� ���
		
		try {
			System.out.println(num / 0);
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		System.out.println("����");
	}

}
