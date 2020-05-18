package step5_20.classEx;

import java.util.Scanner;

// 숫자이동[3단계] : 클래스 + 변수

class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}
public class ClassEx08_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex08 e = new Ex08();
		int ext = 4;
		
		while(true) {
			for (int i = 0; i < e.game.length; i++) {
				System.out.print(e.game[i] + " ");
			}
			System.out.println("\n이동할 숫자를 입력해주세요. [1]왼쪽 [2]오른쪽 [3]격파");
			int sel = scan.nextInt();
			if (sel == 1) {
				if (ext == 0) {
					System.out.println("끝에 도달했습니다.");
					break;
				}
				else if (e.game[ext - 1] == 1) System.out.println("벽입니다.");
				else {
					e.game[ext--] = 0;
					e.game[ext] = 2;		
				}
			}
			
			else if (sel == 2) {
				if (ext == 8) {
					System.out.println("끝에 도달했습니다.");
					break;
				}
				else if (e.game[ext + 1] == 1) System.out.println("벽입니다.");
				else {
					e.game[ext++] = 0;
					e.game[ext] = 2;
				}
			}
			
			else {
				if (e.game[ext + 1] == 1 || e.game[ext - 1] == 1) {
					System.out.println("벽을 격파합니다.");
					e.game[ext + 1] = 0;
					e.game[ext - 1] = 0;
				}
				else {
					System.out.println("격파할 벽이 없습니다.");
				}
			}
		}
	}
}
