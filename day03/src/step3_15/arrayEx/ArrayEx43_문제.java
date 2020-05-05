package step3_15.arrayEx;
import java.util.Random;
// 당첨복권 1셋트

public class ArrayEx43_문제 {

	public static void main(String[] args) {
		
		int[][] lottoSet = new int[5][7];
		Random ran = new Random();
		
		int ext = -1;
		int count = 0;
		while(count < 5) {
			for (int i = 0; i < 7; i++) {
				lottoSet[count][i] = ran.nextInt(3) + 1;
			}
			int win = 0;
			for(int i = 0; i < 5; i++) {
				if (lottoSet[count][i] == 3 && 
						lottoSet[count][i + 1] == 3 && 
						lottoSet[count][i + 2] == 3)
					win = 1;
			}
			if (win == 1) {
				if (ext < 0) {
					ext = count;
				}
				else count--;
			}
			count++;
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("당첨 : " + (ext + 1) + "번");
	}

}
