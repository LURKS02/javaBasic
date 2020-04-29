package step3_13.arrayEx;
import java.util.Scanner;

//관리비

public class ArrayEx39_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
			{101, 102, 103},	
			{201, 202, 203},	
			{301, 302, 303}	
		};
		
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
		
		// 각층별 관리비 합 출력
		for (int i = 0; i < 3; i++) {
			int floorsum = 0;
			for (int j = 0; j < 3; j++) {
				floorsum += pay[i][j];
			}
			System.out.print(floorsum + " ");
		}
		System.out.println();
		
		// 호를 입력하면 관리비 출력
		System.out.println("호를 입력해주세요.");
		int add = scan.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (add == apt[i][j]) System.out.println("관리비 : " + pay[i][j]);
			}
		}
		
		// 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		int maxapt = 0;
		int minapt = 0;
		int max = 0;
		int min = 10000;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (max < pay[i][j]) {
					max = pay[i][j];
					maxapt = apt[i][j]; 
				}
				if (min > pay[i][j]) {
					min = pay[i][j];
					minapt = apt[i][j];
				}
			}
		}
		System.out.println("가장 많이 나온 집 = " + maxapt + " 가장 적게 나온 집 = " + minapt);
		
		// 호 2개를 입력하면 관리비 교체
		System.out.println("교체할 호를 2개 입력해주세요.");
		int add1 = scan.nextInt();
		int add2 = scan.nextInt();
		int add1_ind1 = -1, add1_ind2 = -1;
		int add2_ind1 = -1, add2_ind2 = -1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(apt[i][j] == add1) {
					add1_ind1 = i;
					add1_ind2 = j;
				}
				if(apt[i][j] == add2) {
					add2_ind1 = i;
					add2_ind2 = j;
				}
			}
		}
		int temp = pay[add1_ind1][add1_ind2];
		pay[add1_ind1][add1_ind2] = pay[add2_ind1][add2_ind2];
		pay[add2_ind1][add2_ind2] = temp;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		



	}

}
