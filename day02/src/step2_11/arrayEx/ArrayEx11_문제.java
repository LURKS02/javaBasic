package step2_11.arrayEx;
import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 *
 */

public class ArrayEx11_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] check = new int[5];
		int[] arr = new int[5];
		
		int k = 0;
		for (int i = 0; i < 5; i++) {
			int num = ran.nextInt(5);
			if(check[num] == 1) {
				i -= 1;
				System.out.println("중복 숫자");
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
