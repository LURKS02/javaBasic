package step1_08.ifEx;

import java.util.Random;

//369���� - 1�ܰ�

public class IfEx17_���� {

	public static void main(String[] args) {

		Random ran = new Random();
		int random = ran.nextInt(50) + 1;
		
		int x = random / 10;
		int y = random % 10;
		
		int cnt = 0;
		
		System.out.println("���� ���� : " + random);
		
		if (x == 3 || x == 6 || x == 9) cnt++;
		if (y == 3 || y == 6 || y == 9) cnt++;
		
		if(cnt == 2) System.out.println("¦¦");
		else if (cnt == 1) System.out.println("¦");
		else System.out.println(random);
		
	}
	
}

