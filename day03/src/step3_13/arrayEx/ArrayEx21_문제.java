package step3_13.arrayEx;

import java.util.Scanner;

// 최대값 구하기[3단계]

public class ArrayEx21_문제 {

	public static void main(String[] args) {
		
		int[] arr = {11, 87, 42, 100, 24};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			for (int i = 0; i < 5; i++) System.out.print(arr[i] + " ");
			System.out.println();
			
			int notblank = 0;
			int max = 0;
			int maxindex = -1;
			for (int i = 0; i < 5; i++) {
				if (max <= arr[i]) {
					max = arr[i];
					maxindex = i;
				}
				if (arr[i] != 0) notblank++;
			}
			if(notblank == 0) {
				System.out.println("모든 숫자가 0으로 변경되었습니다.");
				break;
			}
		
			System.out.println("최대값을 입력해주세요.");
			int input = scan.nextInt();
			if (input == arr[maxindex]) {
				arr[maxindex] = 0;
				System.out.println("최대값을 찾았습니다.");
			}
			else {
				System.out.println("최대값을 찾지 못했습니다.");
			}
		}
	}
}
