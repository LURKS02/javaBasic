package step3_13.arrayEx;

// 2�����迭 [1�ܰ�]

public class ArrayEx36_���� {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				sum += arr[i][j];
				k += 1;
			}
		}
		
		// ��ü �� ���
		System.out.println("�� = " + sum);
		
		// 4�� ����� ���
		int sum2 = 0;
		int cnt = 0;
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					sum2 += arr[i][j];
					System.out.print(arr[i][j] + " ");
					cnt++;
				}
			}
		}
		System.out.println();
		
		// 4�� ����� �� ���
		System.out.println("4�� ��� �� = " + sum2);
		
		// 4�� ����� ���� ���
		System.out.println("4�� ��� ���� = " + cnt);


	}

}
