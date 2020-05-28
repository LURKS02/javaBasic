package step7_22.ClassArrEx;
import java.util.ArrayList;

/*
 * 배열의 한계 : 배열은 한번 선언하면 프로그램에서 크기를 바꿀 수 없음
 * 
 * java.util.ArrayList
 * 1. ArrayList 클래스는 데이터가 입력되면 자동으로 크기가 커지고
 *    데이터가 제거되면 자동으로 크기가 작아진다.
 * 2. 중간에 데이터가 삽입되면, 데이터가 삽입된 위치부터 모든 데이터 뒤로 이동
 * 3. 중간의 데이터가 제거되면, 데이터가 제거된 위치부터 모든 데이터 앞으로 이동
 * 
 * <E>
 * genetic : ArrayList에 저장될 데이터 타입을 반드시 클래스로 작성
 * 기본 자료형 데이터를 저장하는 ArrayList의 경우 래퍼 클래스 사용
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
		
		//add(value) : ArrayList의 맨 뒤에 value 추가
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//add(index, value) : ArrayList의 index 위치에 value 추가
		list.add(0, 9);
		System.out.println(list);
		
		//remove(index) : ArrayList의 index 위치의 데이터 삭제
		list.remove(3);
		System.out.println(list);
		
		//size() : ArrayList에 저장된 데이터의 개수
		int count = list.size();
		System.out.println("count = " + count);
		
		//get() : ArrayList의 index번째 value
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(list.get(i));
			if (i != count - 1) System.out.print(", ");
		}
		System.out.println("]");
		
		//set(index, value) : ArrayList의 index번 위치 value 수정
		list.set(3, 5);
		System.out.println(list);
		
		/*
		 * 향상된 for문
		 * 배열이나 ArrayList 전체 데이터를 대상으로 작업
		 * for (자료형 변수명 : 배열 or ArrayList){
		 * 		반복할 문장;
		 * }
		 */
		
		for (int num : list) System.out.println(num);
		
		//clear() : ArrayList의 모든 데이터 제거
		list.clear();
		System.out.println(list.size());

	}
}
