package step2_11.arrayEx;

//�л��������� ���α׷� - 4�ܰ�

public class ArrayEx07_���� {

	public static void main(String[] args) {
		
		int[] num = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		//���� : 1�� �л��� �й��� ���� ���
		
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < 5; i++) {
			if (scores[i] >= max) {
				max = scores[i];
				maxIndex = i;
			}
		}
		System.out.println("1�� �й� : " + num[maxIndex] + " ���� : " + max);
	}

}
