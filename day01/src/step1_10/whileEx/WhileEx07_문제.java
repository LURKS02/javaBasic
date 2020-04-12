package step1_10.whileEx;
import java.util.Random;
import java.util.Scanner;

//up down 게임 - 2단계
/*
 * 정답을 맞추면 게임 종료
 * 100점부터 시작해 오답일 때마다 5점 차감
 * 게임 종료 후 점수를 출력
 */

public class WhileEx07_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
	
		int random = ran.nextInt(100) + 1;
		System.out.println("정답 : " + random);
		
		while(true) {
			
			if (score == 0) {
				System.out.println("게임 오버");
				break;
			}
			
			System.out.println("숫자 입력");
			int input = scan.nextInt();
			
			if (input == random) {
				System.out.println("정답입니다.");
				System.out.println("점수 : " + score);
				break;
			}
			else if (input < random) {
				System.out.println("Up");
				score -= 5;
			}
			else {
				System.out.println("Down");
				score -= 5;
			}
		}
	
	}

}
