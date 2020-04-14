package step2_11.arrayEx;

import java.util.Random;

//OMR카드
//배열의 answer는 정답지이다.
//배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
//정답을 비교하여 정오표와 성적을 출력한다.
//한 문제당 20점

public class ArrayEx08_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1,3,4,2,5};
		int[] hgd = new int[5];
		char[] sheet = new char[5];
		
		int score = 0;
		for (int i = 0; i < 5; i++) {
			hgd[i] = ran.nextInt(5) + 1;
			System.out.print(hgd[i] + " ");
			if (hgd[i] == answer[i]) {
				sheet[i] = 'O';
				score += 20;
			}
			else sheet[i] = 'X';
		}
		System.out.println();
		System.out.print("정오표 = {");
		for(int i = 0; i < 5; i++) {
			if (i == 4) System.out.print(sheet[i]);
			else System.out.print(sheet[i] + ", ");
		}
		System.out.println("}");
		System.out.println("성적 = " + score);

	}

}
