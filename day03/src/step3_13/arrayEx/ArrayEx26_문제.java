package step3_13.arrayEx;

import java.util.Scanner;

// 숫자 야구 게임

public class ArrayEx26_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] com = {1, 7, 3};
		for(int i = 0; i < 3; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		
		while(true) {
			
			int strike = 0;
			int ball = 0;
			int[] me = new int[3];
			int index = 0;
			
			for (int i = 0; i < 3; i++) {
				System.out.println("숫자 입력");
				int input = scan.nextInt();
				int dup = -1;
				for (int j = 0; j < index; j++) {
					if (me[j] == input) dup++;
				}
				if (dup != -1) {
					System.out.println("숫자가 겹칩니다.");
					i--;
					continue;
				}
				else {
					me[index++] = input;
				}
			}
			
			for (int i = 0; i < 3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.println();
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i] == me[j]) {
						if (i == j) strike++;
						else ball++;
					}
				}
			}
			System.out.println("strike = " + strike + ", ball = " + ball);
			if (strike == 3) {
				System.out.println("정답입니다.");
				break;
			}
			
		}

	}

}
