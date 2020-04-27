package step3_13.arrayEx;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 */

public class ArrayEx33_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0;
		
		while(true) {
			
			for (int i = 0; i < count; i++) System.out.print(score[i] + " ");
			System.out.println();
			System.out.println("벡터 컨트롤러\n"
					+ "1.추가  2.인덱스 삭제  3.값 삭제  4.삽입  0.종료\n"
					+ "메뉴를 입력해주세요.");
			int sel = scan.nextInt();
			
			//추가
			if(sel == 1) {
				System.out.println("추가할 값을 입력하세요.");
				int newval = scan.nextInt();
				if (count == 0) {
					score = new int[count + 1];
				}
				else if (count > 0) {
					int[]temp = score;
					score = new int[count + 1];
					for (int i = 0; i < count; i++) {
						score[i] = temp[i];
					}
					temp = null;
				}
				score[count++] = newval;
				System.out.println("값이 추가되었습니다.");	
			}
			
			//인덱스 삭제
			else if(sel == 2) {
				System.out.println("삭제할 인덱스를 입력하세요.");
				int delindex = scan.nextInt();
				if (delindex >= count || delindex < 0) {
					System.out.println("삭제할 수 없는 위치입니다.");
					continue;
				}
				int temp[] = score;
				score = new int[count - 1];
				for (int i = 0; i < count - 1; i++) {
					
					if (i < delindex) {
						score[i] = temp[i];
					}
					else {
						score[i] = temp[i + 1];
					}
				}
				count--;
				System.out.println("값이 삭제되었습니다.");
			}
			
			//값 삭제
			else if(sel == 3) {
				System.out.println("삭제할 값을 입력하세요.");
				int delval = scan.nextInt();
				int delindex = -1;
				for (int i = 0; i < count; i++) if (delval == score[i]) delindex = i;
		
				if(delindex == -1) {
					System.out.println("값이 존재하지 않습니다.");
					continue;
				}
				
				int temp[] = score;
				score = new int[count - 1];
				for (int i = 0; i < count - 1; i++) {
					
					if (i < delindex) {
						score[i] = temp[i];
					}
					else {
						score[i] = temp[i + 1];
					}
				}
				count--;
				System.out.println("값이 삭제되었습니다.");
				
			}
			
			//삽입
			else if(sel == 4) {
				System.out.println("삽입할 인덱스와 값을 입력하세요.");
				int newindex = scan.nextInt();
				int newval = scan.nextInt();
				if (newindex < 0 || newindex > count) {
					System.out.println("삽입이 불가능한 위치입니다.");
					continue;
				}
				int temp[] = score;
				score = new int[count + 1];
				for (int i = 0; i < count + 1; i++) {
					if (i == newindex) score[i] = newval;
					else if (i < newindex) score[i] = temp[i];
					else score[i] = temp[i - 1];
				}
				count++;
				System.out.println("값이 추가되었습니다.");
			}
			
			else if(sel == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}

	}

}
