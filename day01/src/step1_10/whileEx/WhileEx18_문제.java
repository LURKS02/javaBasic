package step1_10.whileEx;
import java.util.Scanner;

public class WhileEx18_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int desX = 0;
		int desY = 0;
		
		int x = 0;
		int y = 0;
		
		int dir = 0;
		
		int speed = 0;
		
		int fee = 0;
		
		while(true) {
			System.out.println("택시 서비스");
			System.out.println("목적지 : " + desX + ", " + desY);
			System.out.println("현위치 : " + x + ", " + y);
			System.out.println("방향 : " + dir);
			System.out.println("속도 : " + speed);
			System.out.println();
			
			System.out.println("1. 방향 설정   2. 속도 설정   3. 이동하기");
			int sel = scan.nextInt();
			
			if (sel == 1) {
		
			}
			else if (sel == 2) {
				
			}
			else {
				
			}
		}
	}

}
