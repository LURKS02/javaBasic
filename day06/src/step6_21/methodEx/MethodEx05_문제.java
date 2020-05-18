package step6_21.methodEx;

/*
 * �޼����� ����
 * void �޼����(�Ű�����[parameter]){
 * 		������ ����;
 * }
 * 
 * �޼����� ���(ȣ��)
 * �޼����(�μ�[argument]);
 * 
 */

class Ex05{
	
	void test1(int x, int y) {
		System.out.println(x + y);
	}
	
	void test2(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
		System.out.println(max);
	}
	
	void test3(int[]arr, int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
		
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	}
}

public class MethodEx05_���� {

	public static void main(String[] args) {
		
		Ex05 e = new Ex05();
		
		// ���� 1) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		e.test1(x, y);
				
		// ���� 2) arr�迭�� ���޹޾� �ִ밪�� ����ϴ� �޼���
		int[] arr = {87, 100, 35, 12, 46};
		e.test2(arr);
				
		// ���� 3) arr�迭�� ���޹޾� �ε��� 2���� �Է¹ް�, �ش� ��ġ�� ���� ��ü�ϴ� �޼���
		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);

	}
}
