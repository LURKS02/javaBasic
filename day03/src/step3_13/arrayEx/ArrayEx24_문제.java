package step3_13.arrayEx;
import java.util.Scanner;

/*
 * # EXIT ����
 * 1. game�迭���� exit������ ���� ���� ��ġ�� �Է��Ѵ�.
 * 2. ������ ���߸� exit������ 1�����Ѵ�.
 * 3. exit������ ���� 16�̵Ǹ� ������ ����ȴ�.
 */

public class ArrayEx24_���� {

	public static void main(String[] args) {
		
		int exit = 10;
		int[] game = {11, 15, 10, 14, 12, 13};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� exit = " + exit);
			if(exit == 16) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			System.out.println("���ڸ� �Է��ϼ���.");
			int input = scan.nextInt();
			if (game[input] == exit) {
				System.out.println("�����Դϴ�.");
				exit++;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
		}

		
	}

}
