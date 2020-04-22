package step3_13.arrayEx;
import java.util.Scanner;

/*
 * # �����̵�[2�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 */

public class ArrayEx23_���� {

	public static void main(String[] args) {
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		Scanner scan = new Scanner(System.in);
		
		int index = 4;
		
		while(true) {
			
			for (int i = 0; i < 9; i++)
				System.out.print(game[i] + " ");
			System.out.println();
			
			System.out.println("1.����  2.������  3.����");
			System.out.println("���ڸ� �Է��ϼ���.");
			int input = scan.nextInt();
			
			if (input == 1) {
				index--;
				if (index == -1) {
					System.out.println("���� �����߽��ϴ�. ���� ����");
					break;
				}
				else if (game[index] == 1) {
					System.out.println("���� �ֽ��ϴ�. �̵� �Ұ� ");
					index++;
				}
				else {
					System.out.println("�̵��մϴ�.");
					game[index] = 2;
					game[index + 1] = 0;
				}
			}
			else if (input == 2) {
				index++;
				if (index == 9) {
					System.out.println("���� �����߽��ϴ�. ���� ����");
					break;
				}
				else if (game[index] == 1){
					System.out.println("���� �ֽ��ϴ�. �̵� �Ұ� ");
					index--;
				}
				else {
					System.out.println("�̵��մϴ�.");
					game[index] = 2;
					game[index - 1] = 0;
				}
			}
			else {
				if (game[index - 1] == 1) {
					System.out.println("���� �����մϴ�.");
					game[index - 1] = 0;
				}
				else if (game[index + 1] == 1) {
					System.out.println("���� �����մϴ�.");
					game[index + 1] = 0;
				}
				else System.out.println("������ ���� �����ϴ�.");
			}
			
		}

	}

}
