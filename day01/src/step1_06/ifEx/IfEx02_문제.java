package step1_06.ifEx;

import java.util.Scanner;

//com �� 8�̴�.
// me �� com �� ���ڸ� �����.
// me < com : Up!
// me == com : Bingo!
// me > com : Down!

public class IfEx02_���� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		int me = scan.nextInt();
		
		if (me < com) {
			System.out.println("Up!");
		}
		
		if (me == com) {
			System.out.println("Bingo!");
		}
		
		if (me > com) {
			System.out.println("Down!");
		}
		
	}

}
