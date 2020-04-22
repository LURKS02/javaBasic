package step3_13.arrayEx;
import java.util.Random;
import java.util.Scanner;

// 1 to 50[2단계] : 1 to 9

public class ArrayEx22_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = i+1;
		}
		
		//shuffle
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		int find = 1;
		while(true) {
			int notblank = 0;
			for (int i = 0; i < 9; i++) {
				System.out.print(arr[i] + " ");
				if (arr[i] != 0) notblank++;
			}
			System.out.println();
			if (notblank == 0) {
				System.out.println("모든 숫자를 찾았습니다.");
				break;
			}
			
			System.out.println("숫자를 입력해주세요.");
			int input = scan.nextInt();
			if (arr[input] == find) {
				System.out.println(find + "번째 숫자를 찾았습니다.");
				find++;
				arr[input] = 0;
			}
			else {
				System.out.println("틀렸습니다.");
			}
		}
	}

}
