package step5_20.classEx;

import java.util.Random;

// OMR카드 : 클래스 + 변수

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}

public class ClassEx06_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Ex06 e = new Ex06();
		
		for (int i = 0; i < e.hgd.length; i++) e.hgd[i] = ran.nextInt(5) + 1;
		
		for (int i = 0; i < e.answer.length; i++) {
			if (i == 0) System.out.print("{");
			if (i != e.answer.length - 1) System.out.print(e.answer[i] + ", ");
			else System.out.println(e.answer[i] + "}");
		}
		
		for (int i = 0; i < e.hgd.length; i++) {
			if (i == 0) System.out.print("{");
			if (i != e.hgd.length - 1) System.out.print(e.hgd[i] + ", ");
			else System.out.println(e.hgd[i] + "}");
		}
		
		for (int i = 0; i < e.hgd.length; i++) {
			if (i == 0) System.out.print("{");
			if (e.answer[i] == e.hgd[i]) {
				if (i != e.hgd.length - 1) System.out.print("O, ");
				else System.out.println("O}");
				e.cnt++;
				e.score += 20;
			}
			else {
				if (i != e.hgd.length - 1) System.out.print("X, ");
				else System.out.println("X}");
			}
		}
		System.out.println("성적 : " + e.score);
		
	}

}
