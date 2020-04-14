package step2_11.arrayEx;

//배열(Array)
/*
 * 1. 같은 종류의 데이터를 여러 개 저장하기 위한 기술
 * 2. 사용법
 * 		int num = 10;
 * 		int[] arr = new int[방의 개수];
 * 		int arr[] = new int[방의 개수];
 * 3. 인덱스
 * 		0부터  시작하는 index가 부여됨
 * 4. 주소 변수
 * 
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		
		//1.일반 변수
		int num = 0;
		num = 10;
		System.out.println("num = " + num);
		
		//2.주소 변수
		int[] arr = null;
		arr = new int[5];
		System.out.println("arr = " + arr); //arr의 주소
		
		//배열을 초기화하지 않아도 시스템이 알아서
		//정수형은 0, double형은 0, string배열은 null, boolean배열은 false
		//default 설정
		
		//stack - 변수 자동할당/해제 : 정수 / 실수 / 논리
		//heap - 메모리 직접 할당 해제 필요 
		//		  포인터를 사용하여 엑세스, 속도 느림, 주소값
		//		 : 배열 / 열거 / 클래스 / 인터페이스
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		// java.lang.ArrayIndexOutOfBoundsException
		// 자료형에 존재하지 않는 인덱스 값을 불러오려고 할 때 발생하는 오류
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
