package step3_13.arrayEx;

import java.util.Scanner;
import java.util.Random;

//1 to 50[3단계] : 1 to 18


public class ArrayEx28_문제 {

	public static void main(String[] args) {
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for (int i = 0; i < SIZE; i++) {
			front[i] = i + 1;
			back[i] = SIZE + i + 1;
		}
		
		//shuffle
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(SIZE);
			int tmp = front[0];
			front[0] = front[r];
			front[r] = tmp;
			
			r = ran.nextInt(SIZE);
			tmp = back[0];
			back[0] = back[r];
			back[r] = tmp;
		}
		
		int num = 1;
		int input = -1;
		while(true) {
			if (num == 19) {
				System.out.println("모든 숫자를 찾았습니다. 게임 종료");
				break;
			}
			
			for(int i = 0; i < SIZE; i++) {
				System.out.print(front[i] + " ");
			}
			System.out.println();
			
			System.out.println(num + "번쨰 숫자의 위치는?");
			input = scan.nextInt();
			
			if(input < 0 || input > 8) {
				System.out.println("예외 처리");
				continue;
			}
			
			if (front[input] == num) {
				System.out.println("정답입니다.");
				if (num >= 10) front[input] = 0;
				else front[input] = back[input];
				num++;
			}
			
			else System.out.println("오답입니다.");
		}
		

	}

}
