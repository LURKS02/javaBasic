package step2_11.arrayEx;

import java.util.Random;

//OMRī��
//�迭�� answer�� �������̴�.
//�迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
//������ ���Ͽ� ����ǥ�� ������ ����Ѵ�.
//�� ������ 20��

public class ArrayEx08_���� {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1,3,4,2,5};
		int[] hgd = new int[5];
		char[] sheet = new char[5];
		
		int score = 0;
		for (int i = 0; i < 5; i++) {
			hgd[i] = ran.nextInt(5) + 1;
			System.out.print(hgd[i] + " ");
			if (hgd[i] == answer[i]) {
				sheet[i] = 'O';
				score += 20;
			}
			else sheet[i] = 'X';
		}
		System.out.println();
		System.out.print("����ǥ = {");
		for(int i = 0; i < 5; i++) {
			if (i == 4) System.out.print(sheet[i]);
			else System.out.print(sheet[i] + ", ");
		}
		System.out.println("}");
		System.out.println("���� = " + score);

	}

}
