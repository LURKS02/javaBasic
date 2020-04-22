package step3_13.arrayEx;
import java.util.Scanner;

// EXIT 게임

public class ArrayEx24_문제 {

	public static void main(String[] args) {
		
		int exit = 10;
		int[] game = {11, 15, 10, 14, 12, 13};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("현재 exit = " + exit);
			if(exit == 16) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			System.out.println("숫자를 입력하세요.");
			int input = scan.nextInt();
			if (game[input] == exit) {
				System.out.println("정답입니다.");
				exit++;
			}
			else {
				System.out.println("틀렸습니다.");
			}
			
		}

		
	}

}
