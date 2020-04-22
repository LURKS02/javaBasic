package step3_13.arrayEx;
import java.util.Scanner;

/*
 * # EXIT 게임
 * 1. game배열에서 exit변수와 값이 같은 위치를 입력한다.
 * 2. 정답을 맞추면 exit변수는 1증가한다.
 * 3. exit변수의 값이 16이되면 게임은 종료된다.
 */

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
