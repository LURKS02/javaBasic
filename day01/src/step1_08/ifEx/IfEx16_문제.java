package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

//가운데 숫자 맞추기 게임
// 150~250 사이의 랜덤 숫자 저장
// 랜덤 숫자의 가운데 숫자를 맞추는 게임

public class IfEx16_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int random = ran.nextInt(100) + 150;
		int answer = (random / 10) % 10;
		
		int input = scan.nextInt();
		
		if (input == answer) System.out.println("정답 : " + random);
		else System.out.println("오답 : " + random);

	}

}
