package step3_15.arrayEx;
import java.util.Scanner;

// 쇼핑몰 관리 - 카테고리

public class ArrayEx41_문제 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		while(true) {

			System.out.println("1.카테고리 관리  2.아이템 관리  3.전체품목 출력");
			
			System.out.print("메뉴를 입력하세요.");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("추가할 카테고리를 입력하세요.");
				String category = scan.next();
				int cateErr = -1;
				for (int i = 0; i < 100; i++) if (category.equals(items[i][0])) cateErr = 1;
				if(cateErr == 1) {
					System.out.println("이미 존재하는 카테고리입니다.");
					continue;
				}
				else {
					items[itemCount++][0] = category;
				}
				
			}
			
			else if(sel == 2) {
				System.out.println("추가할 아이템의 카테고리와 이름을 입력해주세요.");
				String category = scan.next();
				String itemname = scan.next();
				int cateind = -1;
				for (int i = 0; i < 100; i++) if(category.compareTo(items[i][0]) == 0) cateind = i;
				if (cateind == -1) {
					System.out.println("일치하는 카테고리가 없습니다.");
					continue;
				}
				else {
					items[cateind][1] += itemname + "/";
				}	
			}
			
			else if(sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println(items[i][0] + " : " + items[i][1]);
				}
			}
		}
	}
}
