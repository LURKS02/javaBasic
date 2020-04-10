package step1_07.random;

import java.util.Scanner;
import java.util.Random;

//코인 게임
//0또는 1의 랜덤 숫자를 저장한다.
//0은 동전의 앞면, 1은 동전의 뒷면이다.
//동전의 앞뒷면을 맞추는 게임

public class RandomEx02_문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		System.out.println("동전은 앞면일까 뒷면일까?");
		int coinG = scan.nextInt();
		
		if (coin == coinG) {
			System.out.println("정답");
		}
		else System.out.println("오답");
	}

}
