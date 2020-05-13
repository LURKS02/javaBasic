package step4_19.fileEx;

import java.util.Random;

// 경마 게임

public class FileEx11_문제 {

	public static void main(String[] args) {
		int MAX = 20;
		int horse[][] = new int[5][MAX];
		Random ran = new Random();
		int rank[] = new int[5];
		int total[] = new int[5];
		int win = 1;
		
		while(win < 6) {
			
			int chk = 0;
			for (int i = 0; i < 5; i++) {
				if (rank[i] == 0) {
					int addnum = ran.nextInt(5) + 1;
					total[i] += addnum;
					if (total[i] >= 19) {
							total[i] = 19;
							rank[i] = win++;
							chk++;
					}
				}
			}
			
			System.out.println("===================");
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < MAX; j++) {
					System.out.print("[");
					if (total[i] == j) System.out.print("O");
					else System.out.print(" ");
					System.out.print("]");
				}
				System.out.println();
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + "번 말 : " + rank[i] + "등");
		}
	}
}
