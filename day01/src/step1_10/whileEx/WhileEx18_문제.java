package step1_10.whileEx;
import java.util.Scanner;
import java.util.Random;

//택시 서비스

public class WhileEx18_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//목적지
		int desX = ran.nextInt(21) - 10;
		int desY = ran.nextInt(21) - 10;
		
		//현재 위치
		int x = 0;
		int y = 0;
		
		//방향
		int dir = 0;
		//속도
		int speed = 0;
		//요금
		int fee = 0;
		//이동 칸 수
		int move = 0;
		
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
				System.out.println("방향을 설정하세요.");
				dir = scan.nextInt();
			}
			else if (sel == 2) {
				System.out.println("속도를 설정하세요.");
				speed = scan.nextInt();
			}
			else {
				System.out.println("이동합니다.");
				if(dir == 1) x += speed;
				else if(dir == 2) x -= speed;
				else if(dir == 3) y -= speed;
				else y += speed;
				move += speed;
			}
			
			if (x == desX && y == desY) {
				if (move % 2 == 0) fee = (move / 2) * 50;
				else fee = (move / 2) * 50 + 50;
				
				System.out.println("목적지 도착");
				System.out.println("요금 : " + fee);
				break;
			}
		}
	}

}
