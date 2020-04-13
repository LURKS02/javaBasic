package step1_10.whileEx;

import java.util.Scanner;

//쇼핑몰 뒤로가기

public class WhileEx17_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. 남성의류 2. 여성의류 3. 종료");
			System.out.println("메뉴 선택");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				while(true) {
					System.out.println("1. 티셔츠 2. 바지 3. 뒤로가기");
					int sel2 = scan.nextInt();
					if (sel2 == 1) {}
					else if (sel2 == 2) {}
					else break;
				}
			}
			
			else if(sel == 2) {
				while(true) {
					System.out.println("1. 가디건 2. 치마 3. 뒤로가기");
					int sel2 = scan.nextInt();
					if (sel2 == 1) {}
					else if(sel2 == 2) {}
					else break;
				}
			}
			
			else {
				System.out.println("프로그램 종료 ");
				break;
			}
		}

	}

}
