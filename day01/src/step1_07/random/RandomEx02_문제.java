package step1_07.random;

import java.util.Scanner;
import java.util.Random;

//���� ����
//0�Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
//0�� ������ �ո�, 1�� ������ �޸��̴�.
//������ �յ޸��� ���ߴ� ����

public class RandomEx02_���� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		System.out.println("������ �ո��ϱ� �޸��ϱ�?");
		int coinG = scan.nextInt();
		
		if (coin == coinG) {
			System.out.println("����");
		}
		else System.out.println("����");
	}

}
