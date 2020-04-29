package step3_13.arrayEx;
import java.util.Scanner;

/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

public class ArrayEx40_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0) System.out.print(" �� ");
				else {
					if (j != 0 && ladder[i][j - 1] == 1) System.out.print("���� ");
					else if (j != ladder[i].length - 1 && ladder[i][j + 1] == 1)
						System.out.print(" ����");
				}
			}
			System.out.println();
		}
		System.out.println("x�� �Է��ϼ���.");
		x = scan.nextInt();
		for (int i = 0; i < ladder.length; i++) {
			if (ladder[y][x] == 0) y++;
			else {
				if (x != 0 && ladder[y][x - 1] == 1) x--;
				else if (x != ladder[y].length - 1 && ladder[y][x + 1] == 1) x++;
				y++;
			}
		}
		System.out.println("x = " + x + " y = " + y);
	}
}
