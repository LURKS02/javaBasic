package step1_10.whileEx;
import java.util.Scanner;

//º£½ºÅ²¶óºó½º 31

public class WhileEx11_¹®Á¦ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		while(br <= 31) {
			if (turn % 2 == 0) {
				System.out.println("p1 Â÷·Ê");
				int input = scan.nextInt();
				br += input;
				turn += 1;
				System.out.println("br = " + br);
			}
			else {
				System.out.println("p2 Â÷·Ê");
				int input = scan.nextInt();
				br += input;
				turn += 1;
				System.out.println("br = " + br);
			}
		}
		
		if(turn % 2 == 0) System.out.println("½Â¸®ÀÚ : p1");
		else System.out.println("½Â¸®ÀÚ : p2");

	}

}
