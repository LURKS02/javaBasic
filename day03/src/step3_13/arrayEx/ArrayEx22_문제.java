package step3_13.arrayEx;
import java.util.Random;
import java.util.Scanner;
/*
 * # 1 to 50[2�ܰ�] : 1 to 9
 * 1. arr�迭�� 1~9 ������ ���ڸ� �����Ѵ�.
 * 2. shuffle�� ���� ���ڸ� ���´�.
 * 3. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 4. ������ ���߸� �ش� ���� 0���� ����Ǿ� ��� ���� 0�̵Ǹ� ������ ����ȴ�.
 */

public class ArrayEx22_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = i+1;
		}
		
		//shuffle
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		int find = 1;
		while(true) {
			int notblank = 0;
			for (int i = 0; i < 9; i++) {
				System.out.print(arr[i] + " ");
				if (arr[i] != 0) notblank++;
			}
			System.out.println();
			if (notblank == 0) {
				System.out.println("��� ���ڸ� ã�ҽ��ϴ�.");
				break;
			}
			
			System.out.println("���ڸ� �Է����ּ���.");
			int input = scan.nextInt();
			if (arr[input] == find) {
				System.out.println(find + "��° ���ڸ� ã�ҽ��ϴ�.");
				find++;
				arr[input] = 0;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}

}
