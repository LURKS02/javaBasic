package step2_11.arrayEx;

public class ArrayEx03_���� {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		//����1 : 10~50���� arr�迭�� ����
		int k = 10;
		
		for(int i = 0; i < 5; i++) {
			arr[i] = k;
			System.out.print(arr[i] + " ");
			k += 10;
		}
		System.out.println();
		
		//����2 : 4�� ����� ���
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//����3 : 4�� ����� �� ���
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) total += arr[i];
		}
		System.out.println("total = " + total);
		
		//����4 : 4�� ��� ���� ���
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) cnt++;
		}
		System.out.println("count = " + cnt);
		
		//����5 : ¦�� ���� ���
		int even = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 2 == 0) even++;
		}
		System.out.println("even = " + even);
		System.out.println();

	}

}
