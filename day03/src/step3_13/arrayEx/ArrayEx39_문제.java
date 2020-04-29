package step3_13.arrayEx;
import java.util.Scanner;

//������

public class ArrayEx39_���� {

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
		
		// ������ ������ �� ���
		for (int i = 0; i < 3; i++) {
			int floorsum = 0;
			for (int j = 0; j < 3; j++) {
				floorsum += pay[i][j];
			}
			System.out.print(floorsum + " ");
		}
		System.out.println();
		
		// ȣ�� �Է��ϸ� ������ ���
		System.out.println("ȣ�� �Է����ּ���.");
		int add = scan.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (add == apt[i][j]) System.out.println("������ : " + pay[i][j]);
			}
		}
		
		// ������ ���� ���� ���� ��, ���� ���� �� ���
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
		System.out.println("���� ���� ���� �� = " + maxapt + " ���� ���� ���� �� = " + minapt);
		
		// ȣ 2���� �Է��ϸ� ������ ��ü
		System.out.println("��ü�� ȣ�� 2�� �Է����ּ���.");
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
