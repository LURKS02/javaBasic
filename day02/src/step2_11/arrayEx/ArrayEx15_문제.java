package step2_11.arrayEx;

import java.util.Scanner;
import java.util.Random;

/*
 * 기억력 게임
 */

public class ArrayEx15_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// 셔플(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();

		int finish = 0;
		while(true) {
			
			for (int k = 0; k < 10; k++) {
				System.out.print(back[k] + " ");
			}
			System.out.println();
			
			if(finish == 5) {
				System.out.println("게임 종료");
				break;
			}
			int cho1 = scan.nextInt();
			int cho2 = scan.nextInt();
			if (cho1 == cho2) {
				System.out.println("동일 카드를 선택하였습니다.");
				continue;
			}
			if (back[cho1] != 0 || back[cho2] != 0) {
				System.out.println("이미 고른 숫자입니다.");
			}
			else {
				if (front[cho1] == front[cho2]) {
					back[cho1] = 1;
					back[cho2] = 1;
					finish++;
				}
				else {
					System.out.println("오답입니다.");
				}
			}
		}
	}

}
