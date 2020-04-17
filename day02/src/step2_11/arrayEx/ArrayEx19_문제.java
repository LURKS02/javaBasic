package step2_11.arrayEx;

import java.util.Scanner;

// 배열 컨트롤러[1단계]

public class ArrayEx19_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		while(true) {

			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			System.out.println("[1]추가	[2]삭제	[3]삽입	[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();	
			
			//1. 추가
			if(sel == 1) {
				
				if (cnt > 4) {
					System.out.println("자리가 없습니다.");
					continue;
				}
				System.out.print("추가할 값 입력 : ");
				int input = scan.nextInt();
				arr[cnt++] = input;
			}
			
			//2. 삭제
			else if (sel == 2) {
				if (cnt == 0) {
					System.out.println("배열이 비어있습니다.");
					continue;
				}
				System.out.println("삭제할 값 입력 : ");
				int input = scan.nextInt();
				int drinx = -1;
				for (int i = 0; i < cnt; i++) {
					if(input == arr[i]) drinx = i; 
				}
				if(drinx == -1) System.out.println("삭제할 값이 존재하지 않습니다.");
				else {
					for(int j = drinx; j < cnt; j++) {
						if(j == 4) arr[j] = 0;
						else arr[j] = arr[j+1];
					}
					cnt--;
					System.out.println("삭제하였습니다.");
				}
			}
			
			//3. 삽입
			else if (sel == 3) {
				if (cnt > 4) {
					System.out.println("자리가 없습니다.");
					continue;
				}
				System.out.println("삽입할 위치 입력");
				int index = scan.nextInt();
				if (index > cnt || index < 0) {
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
					continue;
				}
				System.out.println("삽입할 값 입력");
				int input = scan.nextInt();
				
				for(int i = cnt; i > index; i--) {
					arr[i] = arr[i - 1];
				}
				cnt++;
				arr[index] = input;
				System.out.println("삽입 완료");
				
			}
			
			else if (sel == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
		}
	}
}
