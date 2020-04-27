package step3_13.arrayEx;

// 2차원배열 [1단계]

public class ArrayEx36_문제 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				sum += arr[i][j];
				k += 1;
			}
		}
		
		// 전체 합 출력
		System.out.println("합 = " + sum);
		
		// 4의 배수만 출력
		int sum2 = 0;
		int cnt = 0;
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					sum2 += arr[i][j];
					System.out.print(arr[i][j] + " ");
					cnt++;
				}
			}
		}
		System.out.println();
		
		// 4의 배수의 합 출력
		System.out.println("4의 배수 합 = " + sum2);
		
		// 4의 배수의 개수 출력
		System.out.println("4의 배수 개수 = " + cnt);


	}

}
