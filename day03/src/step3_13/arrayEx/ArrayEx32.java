package step3_13.arrayEx;

public class ArrayEx32 {

	public static void main(String[] args) {
		
		int[] arr = {87, 100, 24, 11, 79};

		//arr��ü�� �ּҰ��� ������ ������ ������ ����
		//�ϳ��� ��ü�� �� ������ �����ϰԵ�
		int[] temp = arr; 
		temp[1] = 0; 
		
		/*
		 * �迭�� ���� �� �޸𸮰� stack ������ ����
		 * �̶� ���� �ƴ� heap�� �ּҰ��� ��
		 * ���� �����͸� �����ϴ� �޸𸮴� heap������ ����
		 */
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
