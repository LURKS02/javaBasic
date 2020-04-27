package step3_13.arrayEx;

public class ArrayEx32 {

	public static void main(String[] args) {
		
		int[] arr = {87, 100, 24, 11, 79};

		//arr객체의 주소값만 가져와 참조형 변수에 저장
		//하나의 객체를 두 변수가 참조하게됨
		int[] temp = arr; 
		temp[1] = 0; 
		
		/*
		 * 배열은 선언 시 메모리가 stack 영역에 생성
		 * 이때 값이 아닌 heap의 주소값이 들어감
		 * 실제 데이터를 저장하는 메모리는 heap영역에 생성
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
