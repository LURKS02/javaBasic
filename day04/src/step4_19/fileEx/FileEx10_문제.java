package step4_19.fileEx;

import java.util.Scanner;

//식권 자판기 프로그램 

public class FileEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
	
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		
		while(true) {
		
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
		
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
		
			if(sel == 1) {
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
				
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("충전할 식권 수 입력");
						int addtk = scan.nextInt();
						tickets += addtk;
						System.out.println("충전 완료 : 현재 식권 수 : " + tickets);
					}
					
					else if(choice == 2) {
						System.out.println("현재 잔돈");
						for (int i = 0; i < money.length; i++) {
							System.out.println((i + 1) + ". " + money[i] + "원");
						}
						int addmy = scan.nextInt();
						charges[addmy - 1]++;
						System.out.println(money[addmy - 1] + "원 충전 완료");
					}
					
					else if(choice == 3) {
						break;
					}
				}
			}
			
			else if(sel == 2) {
				while(true) {
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
				
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("돈을 입금해주세요.");
						int inputmy = scan.nextInt();
						System.out.println("식권을 몇 장 구입하시겠습니까?");
						int tknum = scan.nextInt();
						
						if ((tickets - tknum) < 0) {
							System.out.println("식권이 부족합니다.");
							continue;
						}
						
						int change = inputmy - tknum * price;
						if (change < 0) {
							System.out.println("금액이 부족합니다.");
							continue;
						}
						
						System.out.println("식권 가격 : " + price);
						System.out.println("구매한 식권 : " + tknum + "매");
						int[] mynum = new int[money.length];
						for (int i = 0; i < money.length; i++) {
							mynum[i] = 0;
							while (charges[i] > 0) {
								if (change < money[i]) break;
								change -= money[i];
								charges[i]--;
								mynum[i]++;
							}
						}
						if (change > 0) System.out.println("잔돈이 부족합니다.");
						else {
							for (int i = 0; i < money.length; i++) {
								System.out.println(money[i] + "원 : " + mynum[i] + "매");
							}
						}
					}
					
					else if(choice == 2) {
						break;
					}
				}
			}
		}
	}

}
