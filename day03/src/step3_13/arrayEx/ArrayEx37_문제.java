package step3_13.arrayEx;
import java.util.Scanner;

//2차원배열 [2단계]

public class ArrayEx37_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		// 인덱스 2개를 입력받아 값 출력
		System.out.println("인덱스 2개를 입력하세요.");
		int ind1 = scan.nextInt();
		int ind2 = scan.nextInt();
		System.out.printf("[%d][%d]번째 원소 = %d\n", ind1, ind2, arr[ind1][ind2]);	
		
		// 값을 입력받아 인덱스 2개 출력
		System.out.println("값을 입력하세요.");
		int val = scan.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == val) {
					ind1 = i;
					ind2 = j;
				}
			}
		}
		System.out.printf("%d는 [%d][%d]번째 원소입니다.\n", val, ind1, ind2);
		
		// 가장 큰 값의 인덱스 2개 출력
		int max = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					ind1 = i;
					ind2 = j;
				}
			}
		}
		System.out.printf("가장 큰 값 %d의 인덱스는 [%d][%d]입니다.\n", max, ind1, ind2);
		
		// 값 2개를 입력받아 값 교체
		System.out.println("교체할 값 2개를 입력해주세요.");
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		ind1 = -1;
		ind2 = -1;
		
		int ind3 = -1;
		int ind4 = -1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (val1 == arr[i][j]) {
					ind1 = i;
					ind2 = j;
				}
				if (val2 == arr[i][j]) {
					ind3 = i;
					ind4 = j;
				}
			}
		}
		if (ind1 == -1 || ind3 == -1) {
			System.out.println("원소가 없습니다.");
		}
		else {
			int temp = arr[ind1][ind2];
			arr[ind1][ind2] = arr[ind3][ind4];
			arr[ind3][ind4] = temp;
			
			for(int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
