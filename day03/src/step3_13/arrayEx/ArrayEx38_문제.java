package step3_13.arrayEx;

//2�����迭 [3�ܰ�]

public class ArrayEx38_���� {

	public static void main(String[] args) {
		
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
				}; 
		int[] row = new int[3];
		int[] column = new int[4];
			
		// ���� �� ���
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += arr[i][j];
			}
			row[i] = sum;
			System.out.print(row[i] + " ");
		}
		System.out.println();
		
		// ���� �� ���
		for (int j = 0; j < 4; j++) {
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += arr[i][j];
			}
			column[j] = sum;
			System.out.print(column[j] + " ");
		}
	}
	//test
}

