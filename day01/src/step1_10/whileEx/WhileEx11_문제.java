package step1_10.whileEx;
import java.util.Scanner;

//베스킨라빈스 31
/*
 * p1과 p2가 번갈아가면서 1~3을 입력한다.
 * br은 p1과 p2의 입력값을 누적해서 저장한다.
 * br이 31을 넘으면 게임은 종료된다.
 * 승리자를 출력한다.
 */

public class WhileEx11_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		while(br <= 31) {
			if (turn % 2 == 0) {
				System.out.println("p1 차례");
				int input = scan.nextInt();
				br += input;
				turn += 1;
				System.out.println("br = " + br);
			}
			else {
				System.out.println("p2 차례");
				int input = scan.nextInt();
				br += input;
				turn += 1;
				System.out.println("br = " + br);
			}
		}
		
		if(turn % 2 == 0) System.out.println("승리자 : p1");
		else System.out.println("승리자 : p2");

	}

}
