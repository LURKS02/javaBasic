package step2_11.arrayEx;

import java.util.Scanner;

// �迭 ��Ʈ�ѷ�[1�ܰ�]

public class ArrayEx19_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		while(true) {

			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			System.out.println("[1]�߰�	[2]����	[3]����	[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();	
			
			//1. �߰�
			if(sel == 1) {
				
				if (cnt > 4) {
					System.out.println("�ڸ��� �����ϴ�.");
					continue;
				}
				System.out.print("�߰��� �� �Է� : ");
				int input = scan.nextInt();
				arr[cnt++] = input;
			}
			
			//2. ����
			else if (sel == 2) {
				if (cnt == 0) {
					System.out.println("�迭�� ����ֽ��ϴ�.");
					continue;
				}
				System.out.println("������ �� �Է� : ");
				int input = scan.nextInt();
				int drinx = -1;
				for (int i = 0; i < cnt; i++) {
					if(input == arr[i]) drinx = i; 
				}
				if(drinx == -1) System.out.println("������ ���� �������� �ʽ��ϴ�.");
				else {
					for(int j = drinx; j < cnt; j++) {
						if(j == 4) arr[j] = 0;
						else arr[j] = arr[j+1];
					}
					cnt--;
					System.out.println("�����Ͽ����ϴ�.");
				}
			}
			
			//3. ����
			else if (sel == 3) {
				if (cnt > 4) {
					System.out.println("�ڸ��� �����ϴ�.");
					continue;
				}
				System.out.println("������ ��ġ �Է�");
				int index = scan.nextInt();
				if (index > cnt || index < 0) {
					System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
					continue;
				}
				System.out.println("������ �� �Է�");
				int input = scan.nextInt();
				
				for(int i = cnt; i > index; i--) {
					arr[i] = arr[i - 1];
				}
				cnt++;
				arr[index] = input;
				System.out.println("���� �Ϸ�");
				
			}
			
			else if (sel == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			
		}
	}
}
