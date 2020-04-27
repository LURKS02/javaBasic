package step3_13.arrayEx;

//2차원 배열

public class ArrayEx35 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		System.out.println(arr); //stack에 저장된 arr의 주소값
		
		System.out.println(arr[0]);	 //arr의 0번째 인덱스 주소값 : heap
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		System.out.println(arr[1]);	 //arr의 1번째 인덱스 주소값
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println(arr[2]);	 //arr의 2번째 인덱스 주소값
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] temp = arr[1]; 					//인덱스 1 자리의 배열 첫주소
		for(int i = 0; i < temp.length; i++) {  //temp.length = 3
			System.out.print(temp[i] + " ");
		}		
	}
}
