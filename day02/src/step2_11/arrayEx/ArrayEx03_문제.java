package step2_11.arrayEx;

public class ArrayEx03_문제 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		//문제1 : 10~50까지 arr배열에 저장
		int k = 10;
		
		for(int i = 0; i < 5; i++) {
			arr[i] = k;
			System.out.print(arr[i] + " ");
			k += 10;
		}
		System.out.println();
		
		//문제2 : 4의 배수만 출력
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//문제3 : 4의 배수의 합 출력
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) total += arr[i];
		}
		System.out.println("total = " + total);
		
		//문제4 : 4의 배수 개수 출력
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) cnt++;
		}
		System.out.println("count = " + cnt);
		
		//문제5 : 짝수 개수 출력
		int even = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 2 == 0) even++;
		}
		System.out.println("even = " + even);
		System.out.println();

	}

}
