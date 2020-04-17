package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 즉석복권
 */

public class ArrayEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		
		while(true) {
			
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int get = 0;
			
			if(sel == 1) {
				for (int i = 0; i < 6; i++) {
					if (lotto1[i] == 7) {
						if (lotto1[i+1] == 7 && lotto1[i+2] == 7) {
							System.out.println("당첨입니다.");
							get = 1;
						}
					}
				}
				if(get == 0) System.out.println("꽝입니다.");
			}
			
			else if(sel == 2) {
				for (int i = 0; i < 6; i++) {
					if (lotto2[i] == 7) {
						if (lotto2[i+1] == 7 && lotto2[i+2] == 7) {
							System.out.println("당첨입니다.");
							get = 1;
						}
					}
				}
				if(get == 0) System.out.println("꽝입니다.");
			}
			
			else if(sel == 3) {
				for (int i = 0; i < 6; i++) {
					if (lotto3[i] == 7) {
						if (lotto3[i+1] == 7 && lotto3[i+2] == 7) {
							System.out.println("당첨입니다.");
							get = 1;
						}
					}
				}
				if(get == 0) System.out.println("꽝입니다.");
			}
		}

	}

}
