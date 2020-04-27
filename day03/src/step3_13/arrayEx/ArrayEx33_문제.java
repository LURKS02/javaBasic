package step3_13.arrayEx;
import java.util.Scanner;

/*
 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)
 * 1. �߰�
 * . ���� �Է¹޾� ���������� �߰�
 * 2. ����(�ε���)
 * . �ε����� �Է¹޾� �ش� ��ġ�� �� ����
 * 3. ����(��)
 * . ���� �Է¹޾� ����
 * . ���� �� �Է� �� ����ó��
 * 4. ����
 * . �ε����� ���� �Է¹޾� ����
 */

public class ArrayEx33_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0;
		
		while(true) {
			
			for (int i = 0; i < count; i++) System.out.print(score[i] + " ");
			System.out.println();
			System.out.println("���� ��Ʈ�ѷ�\n"
					+ "1.�߰�  2.�ε��� ����  3.�� ����  4.����  0.����\n"
					+ "�޴��� �Է����ּ���.");
			int sel = scan.nextInt();
			
			//�߰�
			if(sel == 1) {
				System.out.println("�߰��� ���� �Է��ϼ���.");
				int newval = scan.nextInt();
				if (count == 0) {
					score = new int[count + 1];
				}
				else if (count > 0) {
					int[]temp = score;
					score = new int[count + 1];
					for (int i = 0; i < count; i++) {
						score[i] = temp[i];
					}
					temp = null;
				}
				score[count++] = newval;
				System.out.println("���� �߰��Ǿ����ϴ�.");	
			}
			
			//�ε��� ����
			else if(sel == 2) {
				System.out.println("������ �ε����� �Է��ϼ���.");
				int delindex = scan.nextInt();
				if (delindex >= count || delindex < 0) {
					System.out.println("������ �� ���� ��ġ�Դϴ�.");
					continue;
				}
				int temp[] = score;
				score = new int[count - 1];
				for (int i = 0; i < count - 1; i++) {
					
					if (i < delindex) {
						score[i] = temp[i];
					}
					else {
						score[i] = temp[i + 1];
					}
				}
				count--;
				System.out.println("���� �����Ǿ����ϴ�.");
			}
			
			//�� ����
			else if(sel == 3) {
				System.out.println("������ ���� �Է��ϼ���.");
				int delval = scan.nextInt();
				int delindex = -1;
				for (int i = 0; i < count; i++) if (delval == score[i]) delindex = i;
		
				if(delindex == -1) {
					System.out.println("���� �������� �ʽ��ϴ�.");
					continue;
				}
				
				int temp[] = score;
				score = new int[count - 1];
				for (int i = 0; i < count - 1; i++) {
					
					if (i < delindex) {
						score[i] = temp[i];
					}
					else {
						score[i] = temp[i + 1];
					}
				}
				count--;
				System.out.println("���� �����Ǿ����ϴ�.");
				
			}
			
			//����
			else if(sel == 4) {
				System.out.println("������ �ε����� ���� �Է��ϼ���.");
				int newindex = scan.nextInt();
				int newval = scan.nextInt();
				if (newindex < 0 || newindex > count) {
					System.out.println("������ �Ұ����� ��ġ�Դϴ�.");
					continue;
				}
				int temp[] = score;
				score = new int[count + 1];
				for (int i = 0; i < count + 1; i++) {
					if (i == newindex) score[i] = newval;
					else if (i < newindex) score[i] = temp[i];
					else score[i] = temp[i - 1];
				}
				count++;
				System.out.println("���� �߰��Ǿ����ϴ�.");
			}
			
			else if(sel == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}

	}

}
