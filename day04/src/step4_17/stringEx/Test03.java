package step4_17.stringEx;

/*
 * # 2차원 반복문
 * 1   2  3  4  5
 * 10  9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 */

public class Test03 {

	public static void main(String[] args) {
		int start = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (((start - 1) / 5) % 2 == 0) System.out.print(start++ + " ");
				else System.out.print(start++ + 4 - 2*j + " ");
			}
			System.out.println();
		}
	}
}
