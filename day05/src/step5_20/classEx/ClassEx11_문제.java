package step5_20.classEx;

import java.util.Scanner;
import java.util.Random;

// ���ϱ� ����

class Ex11{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myidx = new int[3];
	
	int total = 0;
}

public class ClassEx11_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex11 e = new Ex11();
		
		for (int i = 0; i < e.game.length; i++) {
			e.game[i] = ran.nextInt(10) + 1;
		}
		
		while(true) {
			int total = 0;
			for (int i = 0; i < e.idx.length; i++) {
				e.idx[i] = ran.nextInt(6);
				for (int j = 0; j < i; j++) {
					if (e.idx[j] == e.idx[i]) i--;
					else total += e.game[e.idx[i]];
				}
			}
			System.out.println("�հ� : " + total);
			System.out.println("�ε��� : " + e.idx[0] + " " + e.idx[1] + " " + e.idx[2]);
			
			for (int i = 0; i < e.myidx.length; i++) e.myidx[i] = scan.nextInt();
			int cnt = 3;
			for (int i = 0; i < e.idx.length; i++) {
				for (int j = 0; j < e.myidx.length; j++) {
					if (e.idx[i] == e.myidx[j]) cnt--;
				}
			}
			if (cnt == 0) {
				System.out.println("�����Դϴ�.");
				break;
			}
			else System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	}
}
