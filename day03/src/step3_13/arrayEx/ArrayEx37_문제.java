package step3_13.arrayEx;
import java.util.Scanner;

//2�����迭 [2�ܰ�]

public class ArrayEx37_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		// �ε��� 2���� �Է¹޾� �� ���
		System.out.println("�ε��� 2���� �Է��ϼ���.");
		int ind1 = scan.nextInt();
		int ind2 = scan.nextInt();
		System.out.printf("[%d][%d]��° ���� = %d\n", ind1, ind2, arr[ind1][ind2]);	
		
		// ���� �Է¹޾� �ε��� 2�� ���
		System.out.println("���� �Է��ϼ���.");
		int val = scan.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == val) {
					ind1 = i;
					ind2 = j;
				}
			}
		}
		System.out.printf("%d�� [%d][%d]��° �����Դϴ�.\n", val, ind1, ind2);
		
		// ���� ū ���� �ε��� 2�� ���
		int max = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					ind1 = i;
					ind2 = j;
				}
			}
		}
		System.out.printf("���� ū �� %d�� �ε����� [%d][%d]�Դϴ�.\n", max, ind1, ind2);
		
		// �� 2���� �Է¹޾� �� ��ü
		System.out.println("��ü�� �� 2���� �Է����ּ���.");
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		ind1 = -1;
		ind2 = -1;
		
		int ind3 = -1;
		int ind4 = -1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (val1 == arr[i][j]) {
					ind1 = i;
					ind2 = j;
				}
				if (val2 == arr[i][j]) {
					ind3 = i;
					ind4 = j;
				}
			}
		}
		if (ind1 == -1 || ind3 == -1) {
			System.out.println("���Ұ� �����ϴ�.");
		}
		else {
			int temp = arr[ind1][ind2];
			arr[ind1][ind2] = arr[ind3][ind4];
			arr[ind3][ind4] = temp;
			
			for(int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
