package step6_21.methodEx;
import java.util.Scanner;

/*
 * 클래스의 구성요소 : 변수 + 메서드
 * 반복되는 코드를 메서드로 재활용 할 수 있음
 * 
 * 메서드의 구조
 * 키워드 메서드명() {
 * 		메서드 영역;
 * }
 * (숨겨진 변수 this : 자기 주소를 저장하는 변수)
 * 
 */

class Ex04 {
	int num;
	void setNum() {
		System.out.println(this);
		this.num = 10;
	}
	
	void test1() {
		int total = 0;
		for (int i = 1; i <= 5; i ++) total += i;
		System.out.println(total);	
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[3];
		int max = -99999;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
			if (nums[i] > max) max = nums[i];
		}
		System.out.println(max);
	}
}

public class MethodEx04_문제 {

	public static void main(String[] args) {
		
		Ex04 e = new Ex04();
		System.out.println(e);
		
		e.num = 20;
		System.out.println(e.num);
		e.setNum();
		System.out.println(e.num);
		
		// 문제 1) 1부터 5까지의 합을 출력하는 메서드
		e.test1();
				
		// 문제 2) 정수 3개를 입력받아 최대값을 출력하는 메서드
		e.test2();

	}

}
