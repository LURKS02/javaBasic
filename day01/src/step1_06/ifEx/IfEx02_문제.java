package step1_06.ifEx;

import java.util.Scanner;

public class IfEx02_¹®Á¦ {

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
