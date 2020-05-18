package step6_21.methodEx;

/*
 * 메서드의 구조
 * void 메서드명(매개변수[parameter]){
 * 		실행할 내용;
 * }
 * 
 * 메서드의 사용(호출)
 * 메서드명(인수[argument]);
 * 
 */

class Ex05{
	
	void test1(int x, int y) {
		System.out.println(x + y);
	}
	
	void test2(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
		System.out.println(max);
	}
	
	void test3(int[]arr, int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
		
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	}
}

public class MethodEx05_문제 {

	public static void main(String[] args) {
		
		Ex05 e = new Ex05();
		
		// 문제 1) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.test1(x, y);
				
		// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
		int[] arr = {87, 100, 35, 12, 46};
		e.test2(arr);
				
		// 문제 3) arr배열을 전달받아 인덱스 2개를 입력받고, 해당 위치의 값을 교체하는 메서드
		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);

	}
}
