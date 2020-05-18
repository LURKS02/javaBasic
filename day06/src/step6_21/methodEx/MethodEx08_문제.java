package step6_21.methodEx;

class Ex08{
	int test1(int[]arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) if(arr[i] % 4 == 0) cnt++;
		System.out.println(cnt);
		return cnt;
	}
	int[] test2(int[] arr) {

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) if(arr[i] % 4 == 0) cnt++;
		int[] retarr = new int[cnt];
		cnt = 0;
		for (int i = 0; i < arr.length; i++) if(arr[i] % 4 == 0) retarr[cnt++] = arr[i];
		return retarr;
	}
}

public class MethodEx08_문제 {

	public static void main(String[] args) {
		
		Ex08 e = new Ex08();
		int[] arr = {87, 12, 21, 56, 100};
		
		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
		e.test1(arr);
				
		// 문제 2) 4의 배수만 배열 타입으로 리턴해주는 메서드
		int[] temp = e.test2(arr);
		for (int i = 0; i < temp.length; i++) System.out.print(temp[i] + " ");

	}

}
