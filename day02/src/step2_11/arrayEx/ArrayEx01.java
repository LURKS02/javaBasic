package step2_11.arrayEx;

//�迭(Array)
/*
 * 1. ���� ������ �����͸� ���� �� �����ϱ� ���� ���
 * 2. ����
 * 		int num = 10;
 * 		int[] arr = new int[���� ����];
 * 		int arr[] = new int[���� ����];
 * 3. �ε���
 * 		0����  �����ϴ� index�� �ο���
 * 4. �ּ� ����
 * 
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		
		//1.�Ϲ� ����
		int num = 0;
		num = 10;
		System.out.println("num = " + num);
		
		//2.�ּ� ����
		int[] arr = null;
		arr = new int[5];
		System.out.println("arr = " + arr); //arr�� �ּ�
		
		//�迭�� �ʱ�ȭ���� �ʾƵ� �ý����� �˾Ƽ�
		//�������� 0, double���� 0, string�迭�� null, boolean�迭�� false
		//default ����
		
		//stack - ���� �ڵ��Ҵ�/���� : ���� / �Ǽ� / ��
		//heap - �޸� ���� �Ҵ� ���� �ʿ� 
		//		  �����͸� ����Ͽ� ������, �ӵ� ����, �ּҰ�
		//		 : �迭 / ���� / Ŭ���� / �������̽�
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		// java.lang.ArrayIndexOutOfBoundsException
		// �ڷ����� �������� �ʴ� �ε��� ���� �ҷ������� �� �� �߻��ϴ� ����
		//ex. sysout arr[5]
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
