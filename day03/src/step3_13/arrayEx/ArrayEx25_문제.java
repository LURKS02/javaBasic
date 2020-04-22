package step3_13.arrayEx;

import java.util.Random;

// 중복숫자 금지[2단계]

public class ArrayEx25_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[5];
		int arrnum = 0;
		while(true) {
			if (arrnum == 5) break;
			int new_num = ran.nextInt(10) + 1;
			int dup = 0;
			for (int i = 0; i < arrnum; i++) if (new_num == arr[i]) dup++;
			if(dup != 0) continue;
			else arr[arrnum++] = new_num;
		}
		for (int i = 0; i < 5; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
