package step2_11.arrayEx;
import java.util.Random;

/*
 * # �ߺ����� ����[1�ܰ�]
 *
 */

public class ArrayEx11_���� {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] check = new int[5];
		int[] arr = new int[5];
		
		int k = 0;
		for (int i = 0; i < 5; i++) {
			int num = ran.nextInt(5);
			if(check[num] == 1) {
				i -= 1;
				System.out.println("�ߺ� ����");
			}
			else {
				arr[k++] = num;
				check[num] = 1;
			}
		}
		
		for (int i = 0; i < 5; i++)
			System.out.println(arr[i] + " ");
	}

}
