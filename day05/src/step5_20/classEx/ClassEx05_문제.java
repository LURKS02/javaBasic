package step5_20.classEx;

import java.util.Scanner;

// 학생성적 관리 프로그램[3단계] : 클래스 + 변수

class Ex05{
	String name = "";
	
	int[] nums = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = {92, 38, 87, 100, 11};
}

public class ClassEx05_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Ex05 e = new Ex05();
		e.name = "고등학교 성적관리 프로그램";
		
		while(true) {
			
			System.out.println("=== " + e.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				for (int i = 0; i < e.nums.length; i++) 
					System.out.println(e.nums[i] + "번 : " + e.scores[i] + "점");
			}
			
			else if(choice == 2) {
				int max = 0;
				int maxind = -1;
				for (int i = 0; i < e.nums.length; i++) {
					if (max < e.scores[i]) {
						max = e.scores[i];
						maxind = i;
					}
				}
				System.out.println("1등 학생 : " + e.nums[maxind] + ", " + e.scores[maxind] + "점");
			}
			
			else if(choice == 3) {
				
				int min = 101;
				int minind = -1;
				for (int i = 0; i < e.nums.length; i++) {
					if (min > e.scores[i]) {
						min = e.scores[i];
						minind = i;
					}
				}
				System.out.println("꼴등 학생 : " + e.nums[minind] + ", " + e.scores[minind] + "점");
			}
			
			else if(choice == 4) {
				System.out.println("어떤 학생의 성적을 확인하시겠습니까?");
				int inputnum = scan.nextInt();
				int findind = -1;
				for (int i = 0; i < e.nums.length; i++) {
					if (inputnum == e.nums[i]) findind = i;
				}
				if (findind == -1) System.out.println("해당 학번이 존재하지 않습니다.");
				else System.out.println(e.nums[findind] + "번 학생의 점수는 " + e.scores[findind] + "점 입니다.");
			}
			
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
