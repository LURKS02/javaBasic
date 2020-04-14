package step2_11.arrayEx;

//학생성적관리 프로그램 - 4단계

public class ArrayEx07_문제 {

	public static void main(String[] args) {
		
		int[] num = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		//문제 : 1등 학생의 학번과 성적 출력
		
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < 5; i++) {
			if (scores[i] >= max) {
				max = scores[i];
				maxIndex = i;
			}
		}
		System.out.println("1등 학번 : " + num[maxIndex] + " 성적 : " + max);
	}

}
