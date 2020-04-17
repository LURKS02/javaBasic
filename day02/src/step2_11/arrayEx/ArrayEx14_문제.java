package step2_11.arrayEx;

import java.util.Scanner;

/*
 * 숫자이동 - 1단계
 */

public class ArrayEx14_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
		}
		
		while(true) {
			
			for (int i = 0; i < 7; i++) System.out.print(game[i] + " ");
			System.out.println();
			System.out.println("숫자를 입력하세요.");
			int input = scan.nextInt();
			if(input == 1) {
				if(player - 1 == -1) {
					System.out.println("게임 오버");
					break;
				}
				game[player - 1] = 2;
				game[player] = 0;
				player -= 1;
			}
			else {
				if(player + 1 == 7) {
					System.out.println("게임 오버");
					break;
				}
				game[player + 1] = 2;
				game[player] = 0;
				player += 1;
			}
		}		
	}
}
