package step1_08.ifEx;

import java.util.Random;

//369°ÔÀÓ - 1´Ü°è

public class IfEx17_¹®Á¦ {

	public static void main(String[] args) {

		Random ran = new Random();
		int random = ran.nextInt(50) + 1;
		
		int x = random / 10;
		int y = random % 10;
		
		int cnt = 0;
		
		System.out.println("·£´ı ¼ıÀÚ : " + random);
		
		if (x == 3 || x == 6 || x == 9) cnt++;
		if (y == 3 || y == 6 || y == 9) cnt++;
		
		if(cnt == 2) System.out.println("Â¦Â¦");
		else if (cnt == 1) System.out.println("Â¦");
		else System.out.println(random);
		
	}
	
}

