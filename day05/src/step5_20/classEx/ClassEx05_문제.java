package step5_20.classEx;

import java.util.Scanner;

// �л����� ���� ���α׷�[3�ܰ�] : Ŭ���� + ����

class Ex05{
	String name = "";
	
	int[] nums = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = {92, 38, 87, 100, 11};
}

public class ClassEx05_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Ex05 e = new Ex05();
		e.name = "����б� �������� ���α׷�";
		
		while(true) {
			
			System.out.println("=== " + e.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				for (int i = 0; i < e.nums.length; i++) 
					System.out.println(e.nums[i] + "�� : " + e.scores[i] + "��");
			}
			
			else if(choice == 2) {
				int max = 0;
				int maxind = -1;
				for (int i = 0; i < e.nums.length; i++) {
					if (max < e.scores[i]) {
						max = e.scores[i];
						maxind = i;
					}
				}
				System.out.println("1�� �л� : " + e.nums[maxind] + ", " + e.scores[maxind] + "��");
			}
			
			else if(choice == 3) {
				
				int min = 101;
				int minind = -1;
				for (int i = 0; i < e.nums.length; i++) {
					if (min > e.scores[i]) {
						min = e.scores[i];
						minind = i;
					}
				}
				System.out.println("�õ� �л� : " + e.nums[minind] + ", " + e.scores[minind] + "��");
			}
			
			else if(choice == 4) {
				System.out.println("� �л��� ������ Ȯ���Ͻðڽ��ϱ�?");
				int inputnum = scan.nextInt();
				int findind = -1;
				for (int i = 0; i < e.nums.length; i++) {
					if (inputnum == e.nums[i]) findind = i;
				}
				if (findind == -1) System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
				else System.out.println(e.nums[findind] + "�� �л��� ������ " + e.scores[findind] + "�� �Դϴ�.");
			}
			
			else if(choice == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
