package step3_16.project;

import java.util.Random;

// 1���� 5������ ���� ���ڸ� 2���� arr �迭�� �����ϱ�

public class Test03 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[]arr = new int[10];
		int[]ext = new int[5];
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			int ind = ran.nextInt(5) + 1;
			if (ext[ind - 1] == 2) {
				i--;
			}
			else {
				arr[i] = ind;
				ext[ind - 1]++;
			}
		}
		
		for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
		
	}
}
