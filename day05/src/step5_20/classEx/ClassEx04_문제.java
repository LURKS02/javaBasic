package step5_20.classEx;

import java.util.Scanner;

//# �л��������� ���α׷�[2�ܰ�] : Ŭ���� + ����

class Ex04 {
	int[] nums = {1001, 1002, 1003, 1004, 1005};
	int[] scores = new int[5];
}

public class ClassEx04_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex04 e = new Ex04();
		
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		e.scores[0] = 87;
		e.scores[1] = 11;
		e.scores[2] = 92;
		e.scores[3] = 14;
		e.scores[4] = 47;
				
		// ����2) �������� ������ ��� ���
		int total = 0;
		double avg = 0;
		for (int i = 0; i < e.scores.length; i++) total += e.scores[i];
		avg = total / (double)e.scores.length;
		System.out.println(total + " " + avg);
				
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		int pass = 0;
		for (int i = 0; i < e.scores.length; i++) if(e.scores[i] >= 60) pass++;
		System.out.println(pass);
		
		// ����4) �ε����� �Է¹޾� ���� ���
		System.out.println("�ε��� �Է�");
		int index = scan.nextInt();
		System.out.println(e.scores[index]);
				
		// ����5) ������ �Է¹޾� �ε��� ���
		System.out.println("���� �Է�");
		int inputscore = scan.nextInt();
		int outind = -1;
		for (int i = 0; i < e.scores.length; i++) if(e.scores[i] == inputscore) outind = i;
		System.out.println(outind);
				
		// ����6) �й��� �Է¹޾� ���� ���
		System.out.println("�й� �Է�");
		int inputnum = scan.nextInt();
		for (int i = 0; i < e.nums.length; i++) if (inputnum == e.nums[i]) outind = i;
		System.out.println(e.scores[outind]);
				
		// ����7) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		System.out.println("�й� �Է�");
		inputnum = scan.nextInt();
		outind = -1;
		for (int i = 0; i < e.nums.length; i++) if (inputnum == e.nums[i]) outind = i;
		if (outind == -1) System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		else System.out.println(e.scores[outind]);
				
		// ����8) 1���л��� �й��� ���� ���
		int max = 0;
		int maxind = -1;
		for (int i = 0; i < e.scores.length; i++) {
			if (max < e.scores[i]) {
				max = e.scores[i];
				maxind = i;
			}
		}
		System.out.println(e.nums[maxind] + "�� (" + e.scores[maxind] + "��)");
		
	}
}
