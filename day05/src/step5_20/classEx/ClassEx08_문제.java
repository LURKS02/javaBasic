package step5_20.classEx;

import java.util.Scanner;

// �����̵�[3�ܰ�] : Ŭ���� + ����

class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}
public class ClassEx08_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex08 e = new Ex08();
		int ext = 4;
		
		while(true) {
			for (int i = 0; i < e.game.length; i++) {
				System.out.print(e.game[i] + " ");
			}
			System.out.println("\n�̵��� ���ڸ� �Է����ּ���. [1]���� [2]������ [3]����");
			int sel = scan.nextInt();
			if (sel == 1) {
				if (ext == 0) {
					System.out.println("���� �����߽��ϴ�.");
					break;
				}
				else if (e.game[ext - 1] == 1) System.out.println("���Դϴ�.");
				else {
					e.game[ext--] = 0;
					e.game[ext] = 2;		
				}
			}
			
			else if (sel == 2) {
				if (ext == 8) {
					System.out.println("���� �����߽��ϴ�.");
					break;
				}
				else if (e.game[ext + 1] == 1) System.out.println("���Դϴ�.");
				else {
					e.game[ext++] = 0;
					e.game[ext] = 2;
				}
			}
			
			else {
				if (e.game[ext + 1] == 1 || e.game[ext - 1] == 1) {
					System.out.println("���� �����մϴ�.");
					e.game[ext + 1] = 0;
					e.game[ext - 1] = 0;
				}
				else {
					System.out.println("������ ���� �����ϴ�.");
				}
			}
		}
	}
}
