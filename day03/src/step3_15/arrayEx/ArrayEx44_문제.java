package step3_15.arrayEx;

//�ߺ����� ����

public class ArrayEx44_���� {

	public static void main(String[] args) {
		
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			temp1[test1[i]]++;
			temp2[test2[i]]++;
			temp3[test3[i]]++;
		}
		
		System.out.print("{ ");
		for (int i = 0; i < 5; i++) {
			if (temp1[test1[i]] > 1) System.out.print(test1[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("{ ");
		for (int i = 0; i < 5; i++) {
			if (temp2[test2[i]] > 1) System.out.print(test2[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("{ ");
		for (int i = 0; i < 5; i++) {
			if (temp3[test3[i]] > 1) System.out.print(test3[i] + " ");
		}
		System.out.println("}");
	}
}
