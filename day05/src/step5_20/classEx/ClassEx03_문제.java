package step5_20.classEx;

//# �л��������� ���α׷�[1�ܰ�] : Ŭ���� + ����

class Ex03{
	int[]arr = {87, 100, 11, 72, 92};
}

public class ClassEx03_���� {

	public static void main(String[] args) {
		
		Ex03 e = new Ex03();
		
		// ��ü �� ���
		int total = 0;
		for (int i = 0; i < e.arr.length; i++) {
			total += e.arr[i];
		}
		System.out.println(total);
				
		// 4�� ����� �� ���
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) {
				sum += e.arr[i]; cnt++;
			}
		}
		System.out.println(sum);
		
		// 4�� ����� ���� ���
		System.out.println(cnt);
				
		// ¦���� ���� ���
		int cnt2 = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 2 == 0) cnt2++;
		}
		System.out.println(cnt2);

	}

}
