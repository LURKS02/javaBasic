package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

//가위바위보 게임 : 2단계
//if - else if 구문으로 구현

public class IfEx14_문제 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		System.out.println("com = " + com);
		System.out.println("가위 : 0 / 바위 : 1 / 보 : 2");
		int me = scan.nextInt();
		
		if (com == me) System.out.println("비겼습니다.");
		else if (com == 0 && me == 1) System.out.println("이겼습니다.");
		else if (com == 1 && me == 2) System.out.println("이겼습니다.");
		else if (com == 2 && me == 0) System.out.println("이겼습니다.");
		else System.out.println("졌습니다.");
		
	}

}
