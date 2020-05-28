package step7_22.ClassArrEx;
import java.util.ArrayList;

/*
 * �迭�� �Ѱ� : �迭�� �ѹ� �����ϸ� ���α׷����� ũ�⸦ �ٲ� �� ����
 * 
 * java.util.ArrayList
 * 1. ArrayList Ŭ������ �����Ͱ� �ԷµǸ� �ڵ����� ũ�Ⱑ Ŀ����
 *    �����Ͱ� ���ŵǸ� �ڵ����� ũ�Ⱑ �۾�����.
 * 2. �߰��� �����Ͱ� ���ԵǸ�, �����Ͱ� ���Ե� ��ġ���� ��� ������ �ڷ� �̵�
 * 3. �߰��� �����Ͱ� ���ŵǸ�, �����Ͱ� ���ŵ� ��ġ���� ��� ������ ������ �̵�
 * 
 * <E>
 * genetic : ArrayList�� ����� ������ Ÿ���� �ݵ�� Ŭ������ �ۼ�
 * �⺻ �ڷ��� �����͸� �����ϴ� ArrayList�� ��� ���� Ŭ���� ���
 * ArrayList<Integer> list = new ArrayList<>();
 */

class MyVector {
	int arr[];
	int count = 0;
	
	void add(int a) {
		if (count == 0) arr = new int[1];
		else {
			int [] temp = arr;
			arr = new int[count + 1];
			for (int i = 0; i < count; i++) arr[i] = temp[i];
			arr[count] = a;
			count++;
		}
	}
	
	int size() {
		return count;
	}
	
	void remove(int index) {
		int[] temp = arr;
		arr = new int[count - 1];
		for (int i = 0; i < index; i++) arr[i] = temp[i];
		for (int i = index; i < count - 1; i++) arr[i] = temp[i + 1];
		count--;
	}
}

public class ClassArrEx12 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//add(value) : ArrayList�� �� �ڿ� value �߰�
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//add(index, value) : ArrayList�� index ��ġ�� value �߰�
		list.add(0, 9);
		System.out.println(list);
		
		//remove(index) : ArrayList�� index ��ġ�� ������ ����
		list.remove(3);
		System.out.println(list);
		
		//size() : ArrayList�� ����� �������� ����
		int count = list.size();
		System.out.println("count = " + count);
		
		//get() : ArrayList�� index��° value
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(list.get(i));
			if (i != count - 1) System.out.print(", ");
		}
		System.out.println("]");
		
		//set(index, value) : ArrayList�� index�� ��ġ value ����
		list.set(3, 5);
		System.out.println(list);
		
		/*
		 * ���� for��
		 * �迭�̳� ArrayList ��ü �����͸� ������� �۾�
		 * for (�ڷ��� ������ : �迭 or ArrayList){
		 * 		�ݺ��� ����;
		 * }
		 */
		
		for (int num : list) System.out.println(num);
		
		//clear() : ArrayList�� ��� ������ ����
		list.clear();
		System.out.println(list.size());

	}
}
