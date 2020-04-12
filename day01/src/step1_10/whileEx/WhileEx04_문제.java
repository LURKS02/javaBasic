package step1_10.whileEx;
import java.util.Scanner;
import java.util.Random;

//구구단 게임 - 3단계
//구구단 게임을 5회 반복한다.
//정답을 맞추면 20점이다.
//게임 종료 후 성적을 출력한다.

public class WhileEx04_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int num1;
		int num2;
		int mul;
		int input;
		int score = 0;
		
		while(i <= 5) {
			num1 = ran.nextInt(10) + 1;
			num2 = ran.nextInt(10) + 1;
			mul = num1 * num2;
			
			System.out.println(num1 + " X " + num2 + " = ?");
			input = scan.nextInt();
			
			if(input == mul) {
				score += 20;
				System.out.println("정답");
			}
			else System.out.println("오답");
			
			i++;
		}
		
		System.out.println("점수는 " + score + "점 입니다.");

	}

}
