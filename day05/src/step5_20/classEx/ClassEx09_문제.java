package step5_20.classEx;

import java.util.Scanner;
import java.util.Random;

// 기억력 게임 : 클래스 + 변수

class Ex09{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
}

public class ClassEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int cnt = 0;
		Ex09 e = new Ex09();
		
		//shuffle
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(e.front.length);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		while(true) {
			
			if (cnt == 10) {
				System.out.println("모든 카드를 찾았습니다.");
				break;
			}
			
			for (int i = 0; i < e.front.length; i++) {
				System.out.print(e.front[i] + " ");
			}
			System.out.println("\n동일한 카드를 입력하세요.");
			int ind1 = scan.nextInt();
			int ind2 = scan.nextInt();
			
			if (ind1 == ind2) { System.out.println("동일한 인덱스입니다."); continue;}
			
			if (e.front[ind1] == e.front[ind2]) {
				if (e.back[ind1] == 1 || e.back[ind2] == 1) System.out.println("이미 선택한 카드입니다.");
				
				else {
					System.out.println("정답입니다!");
					e.back[ind1] = 1;
					e.back[ind2] = 1;
					e.front[ind1] = 0;
					e.front[ind2] = 0;
					cnt += 2;
				}
			}
			else System.out.println("틀렸습니다.");	
		}
	}
}
