package step3_13.arrayEx;

//�������� ����

public class ArrayEx30_���� {

	public static void main(String[] args) {
		
		int[] score = {10, 50, 30, 40, 80, 7};
		
		int index = 0;
		
		while(index < 6){
			for (int i = 0; i < 6; i++) System.out.print(score[i] + " ");
			System.out.println();
			int max = index;
			for (int i = index; i < 6; i++) {
				if (score[max] < score[i]) {
					max = i;
				}
			}
			int temp = score[index];
			score[index] = score[max];
			score[max] = temp;
			index++;
		}
	}

}
