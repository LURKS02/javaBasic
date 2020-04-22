package step3_13.arrayEx;
import java.util.Scanner;

// 숫자이동[2단계]

public class ArrayEx23_문제 {

	public static void main(String[] args) {
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		Scanner scan = new Scanner(System.in);
		
		int index = 4;
		
		while(true) {
			
			for (int i = 0; i < 9; i++)
				System.out.print(game[i] + " ");
			System.out.println();
			
			System.out.println("1.왼쪽  2.오른쪽  3.격파");
			System.out.println("숫자를 입력하세요.");
			int input = scan.nextInt();
			
			if (input == 1) {
				index--;
				if (index == -1) {
					System.out.println("끝에 도달했습니다. 게임 종료");
					break;
				}
				else if (game[index] == 1) {
					System.out.println("벽이 있습니다. 이동 불가 ");
					index++;
				}
				else {
					System.out.println("이동합니다.");
					game[index] = 2;
					game[index + 1] = 0;
				}
			}
			else if (input == 2) {
				index++;
				if (index == 9) {
					System.out.println("끝에 도달했습니다. 게임 종료");
					break;
				}
				else if (game[index] == 1){
					System.out.println("벽이 있습니다. 이동 불가 ");
					index--;
				}
				else {
					System.out.println("이동합니다.");
					game[index] = 2;
					game[index - 1] = 0;
				}
			}
			else {
				if (game[index - 1] == 1) {
					System.out.println("벽을 격파합니다.");
					game[index - 1] = 0;
				}
				else if (game[index + 1] == 1) {
					System.out.println("벽을 격파합니다.");
					game[index + 1] = 0;
				}
				else System.out.println("격파할 벽이 없습니다.");
			}
			
		}

	}

}
