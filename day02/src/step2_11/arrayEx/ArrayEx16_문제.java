package step2_11.arrayEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # 1 to 50[1단계] : 1 to 4
 */

public class ArrayEx16_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int i = 0;
		while (i < 4) {
			int r = ran.nextInt(4);
			if (check[r] == 0) {
				check[r] = 1;
				arr[i] = r + 1;
				i++;
			}
		}
		
		while(true) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
			int cnt = 0;
			for (int k = 0; k < 4; k++) {
				if (arr[k] == 9) cnt++;
			}
			if (cnt == 4) {
				System.out.println("게임 종료");
				break;
			}
			System.out.println("숫자를 입력하세요.");
			int input = scan.nextInt();
			
			if(arr[input] == 9) System.out.println("이미 입력된 값입니다.");
			else {
				arr[input] = 9;
			}
		}
		


	}

}
