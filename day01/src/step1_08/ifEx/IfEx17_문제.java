package step1_08.ifEx;

import java.util.Random;

//369게임 - 1단계
//1~50 사이의 랜덤 숫자를 저장
//위 수에 369의 개수가
//2개이면 짝짝을 출력
//1개이면 짝을 출력
//0개이면 해당 숫자를 출력


public class IfEx17_문제 {

	public static void main(String[] args) {

		Random ran = new Random();
		int random = ran.nextInt(50) + 1;
		
		int x = random / 10;
		int y = random % 10;
		
		int cnt = 0;
		
		System.out.println("랜덤 숫자 : " + random);
		
		if (x == 3 || x == 6 || x == 9) cnt++;
		if (y == 3 || y == 6 || y == 9) cnt++;
		
		if(cnt == 2) System.out.println("짝짝");
		else if (cnt == 1) System.out.println("짝");
		else System.out.println(random);
		
	}
	
}

