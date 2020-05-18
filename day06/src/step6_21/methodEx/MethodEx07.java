package step6_21.methodEx;

class Ex07{
	
	void test1(int x) { x = 100;}
	
	int test2() {
		int x = 100;
		return x;
	}
	
	void test3(int[] arr) {
		arr[1] = 77;
	}
}

public class MethodEx07 {

	public static void main(String[] args) {
		
		Ex07 e = new Ex07();
		
		int x = 7;
		System.out.println("x = " + x);
		e.test1(x);					//원래 값에는 영향x
		System.out.println("x = " + x);
		x = e.test2();				//100 리턴
		System.out.println("x = " + x);

		int[] arr = {10, 20, 30, 40, 50};
		e.test3(arr);
		
		System.out.println(arr[1]);
		
	}

}
