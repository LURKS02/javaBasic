package step1_10.whileEx;

//�ݺ��� for
/*
 * �ݺ����� ���� ��� : �ʱ�� + ���ǽ� + ������
 * 
 * for���� ����
 * for(�ʱ��;���ǽ�;������){
 * 		���ǽ��� ���� ���� ������ ����
 * }
 * 
 * for�� ���� ����
 * �ʱ�� > ���ǽ� > ���๮ > ������ > ���ǽ� > ���๮ > ������ ...
 * 
 */

public class WhileEx19_���� {

	public static void main(String[] args) {
		//1-5���� ���
		int x = 1;
		while(x <= 5) {
			System.out.println(x);
			x++;
		}
		
		System.out.println();
		
		for (int y = 1; y <= 5; y++) System.out.println(y);
		
		System.out.println();
		
		//����1 : 1���� 5���� ���
		for (int i = 1; i <= 5; i++) System.out.print(i + " ");
		System.out.println();
		
		//����2 : 1���� 10���� �ݺ��Ͽ� 5~9 ���
		for (int j = 1; j <= 10; j++) {
			if (j>= 5 && j <= 9) System.out.print(j + " ");
		}
		System.out.println();
		
		//����3 : 1���� 10���� �ݺ��� 6~3 ���
		for (int k = 1; k <= 10; k++) {
			if (k >= 4 && k <= 7) System.out.print((10 - k) + " ");
		}
		System.out.println();
		
		//����4 : 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
		for (int m = 1; m <= 10; m++) {
			if (m < 3 || m >= 7) System.out.print(m + " ");
		}
		System.out.println();

	}

}
