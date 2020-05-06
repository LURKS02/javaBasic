package step3_16.project;

//빙고 (플레이어 1명)

import java.util.Scanner;
import java.util.Random;

public class _02bingo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int MAX_NUM = 5;
		
		int [][]bingo = new int [MAX_NUM][MAX_NUM];
		int [][]mark = new int [MAX_NUM][MAX_NUM];
		
		int []temp = new int[MAX_NUM * MAX_NUM];
		int size = 50;
		int win = 0;
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
				}
			}
		}
		int k = 0;
		for (int i = 0; i < MAX_NUM; i++) {
			for (int j = 0; j < MAX_NUM; j++) {
				bingo[i][j] = temp[k++];
			}
		}
		
		while(true) {
			System.out.println();
			System.out.print("\t");
			for(int i = 0; i < MAX_NUM; i++) System.out.print(i + "\t");
			System.out.println("\n");
			for(int i = 0; i < MAX_NUM; i++) {
				System.out.print(i + "\t");
				for(int j = 0; j < MAX_NUM; j++) {
					if(mark[i][j] == 0) {
						System.out.print(bingo[i][j] + "\t");
					}else {
						System.out.print("O\t");
					}
				}
				System.out.println("\n");
			}
			if (win == 1) {
				System.out.println("승리 : 게임 종료");
				break;
			}
			
			System.out.println("좌표를 입력해주세요.");
			int indy = scan.nextInt();
			int indx = scan.nextInt();
			
			if(mark[indy][indx] == 0) {
				mark[indy][indx] = 1;
			}
			
			// 가로검사
			for(int i = 0; i < MAX_NUM; i++) {
				int cnt = 0;
				for(int j=0; j < MAX_NUM; j++) {
					if(mark[i][j] == 1) cnt++;
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			
			// 세로검사
			for(int j=0; j < MAX_NUM; j++) {
				int cnt = 0;
				for(int i=0; i < MAX_NUM; i++) {
					if(mark[i][j] == 1) cnt++;
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			
			// 대각선 검사
			int cnt = 0;
			for(int i = 0; i < MAX_NUM; i++) {
				if(mark[i][i] == 1) cnt++;
			}
			if(cnt == 5) {
				win = 1;
			}
			
			cnt = 0;
			for(int i=0; i < MAX_NUM; i++) {
				if(mark[i][(MAX_NUM - 1) - i] == 1) cnt++;
			}
			if(cnt == 5) {
				win = 1;
			}
		}
	}

}
