package step5_20.classEx;

import java.util.Scanner;

//# 학생성적관리 프로그램[2단계] : 클래스 + 변수

class Ex04 {
	int[] nums = {1001, 1002, 1003, 1004, 1005};
	int[] scores = new int[5];
}

public class ClassEx04_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex04 e = new Ex04();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		e.scores[0] = 87;
		e.scores[1] = 11;
		e.scores[2] = 92;
		e.scores[3] = 14;
		e.scores[4] = 47;
				
		// 문제2) 전교생의 총점과 평균 출력
		int total = 0;
		double avg = 0;
		for (int i = 0; i < e.scores.length; i++) total += e.scores[i];
		avg = total / (double)e.scores.length;
		System.out.println(total + " " + avg);
				
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		int pass = 0;
		for (int i = 0; i < e.scores.length; i++) if(e.scores[i] >= 60) pass++;
		System.out.println(pass);
		
		// 문제4) 인덱스를 입력받아 성적 출력
		System.out.println("인덱스 입력");
		int index = scan.nextInt();
		System.out.println(e.scores[index]);
				
		// 문제5) 성적을 입력받아 인덱스 출력
		System.out.println("성적 입력");
		int inputscore = scan.nextInt();
		int outind = -1;
		for (int i = 0; i < e.scores.length; i++) if(e.scores[i] == inputscore) outind = i;
		System.out.println(outind);
				
		// 문제6) 학번을 입력받아 성적 출력
		System.out.println("학번 입력");
		int inputnum = scan.nextInt();
		for (int i = 0; i < e.nums.length; i++) if (inputnum == e.nums[i]) outind = i;
		System.out.println(e.scores[outind]);
				
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		System.out.println("학번 입력");
		inputnum = scan.nextInt();
		outind = -1;
		for (int i = 0; i < e.nums.length; i++) if (inputnum == e.nums[i]) outind = i;
		if (outind == -1) System.out.println("해당 학번은 존재하지 않습니다.");
		else System.out.println(e.scores[outind]);
				
		// 문제8) 1등학생의 학번과 성적 출력
		int max = 0;
		int maxind = -1;
		for (int i = 0; i < e.scores.length; i++) {
			if (max < e.scores[i]) {
				max = e.scores[i];
				maxind = i;
			}
		}
		System.out.println(e.nums[maxind] + "번 (" + e.scores[maxind] + "점)");
		
	}
}
