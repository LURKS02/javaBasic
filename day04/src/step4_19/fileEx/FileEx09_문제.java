package step4_19.fileEx;

import java.util.Scanner;

//스네이크 게임

public class FileEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = 10;
		int[][] map = new int[size][size];
		
		int[] x = new int[4];
		int[] y = new int[4];
		
		for(int i = 0; i < 4; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;
		}
		
		while(true) {
			
			for(int i = 0; i < size; i++) {
				for(int j=0; j<size; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = scan.nextInt();
			
			int xx = x[0];
			int yy = y[0];
			
			if(sel == 1) {
				if (xx == 0) {
					System.out.println("벽입니다.");
					continue;
				}
				xx--;
			}
			
			else if(sel == 2) {
				if (xx == 9) {
					System.out.println("벽입니다.");
					continue;
				}
				xx++;
			}
			
			else if(sel == 3) {
				if (yy == 0) {
					System.out.println("벽입니다.");
					continue;
				}
				yy--;
			}
			
			else if(sel == 4) {
				if (yy == 9) {
					System.out.println("벽입니다.");
					continue;
				}
				yy++;
			}
			
			if (map[yy][xx] != 0) {
				System.out.println("이동할 수 없습니다.");
				continue;
			}
			
			for (int i = 3; i > 0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}
			
			x[0] = xx;
			y[0] = yy;
			
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					map[i][j] = 0;
				}
			}
			
			for (int i = 0; i < 4; i++) {
				map[y[i]][x[i]] = i + 1;
			}
		}
	}
}
