package step1_07.random;

import java.util.Scanner;
import java.util.Random;

//가위바위보 게임 - 2단계

public class RandomEx06_문제 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		System.out.println("com = " + com);
		System.out.println("가위 : 0 / 바위 : 1 / 보 : 2");
		int me = scan.nextInt();
		
		if (com >= me) {
			if (com == me) System.out.println("비겼습니다.");
			else {
				if (com == 2 && me == 0) System.out.println("이겼습니다.");
				else System.out.println("졌습니다.");
			}
		}
		else {
			if (com == 0 && me == 2) System.out.println("졌습니다.");
			else System.out.println("이겼습니다.");
		}
		
	}

}
