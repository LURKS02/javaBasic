package step6_21.methodEx;

/*
 * 메서드의 구조 : 리턴값이 있는 메서드
 * 
 * int 메서드명(매개변수[parameter]){
 * 		실행할 내용;
 * 		return 리턴값;
 * }
 * 
 * 메서드 호출
 * int 새 메서드명  = 메서드명(인수[argument]);
 */

class Ex06{
	
	int num;
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
}

public class MethodEx06 {

	public static void main(String[] args) {
		Ex06 e = new Ex06();
		e.setNum(100);
		
		int result = e.getNum();
		System.out.println(result);
		
	}
}
