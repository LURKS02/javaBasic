package step1_10.whileEx;

import java.util.Scanner;

//������ ��� - 2�ܰ�

public class WhileEx05_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 1000;
		int price2 = 2000;
		int price3 = 3000;
		
		System.out.println("1�� �޴� : " + price1 + "��");
		System.out.println("2�� �޴� : " + price2 + "��");
		System.out.println("3�� �޴� : " + price3 + "��");
		
		int i = 1;
		int total = 0;
		int num1 = 0;
		int num2 = 0; 
		int num3 = 0;
		
		while (i <= 5) {
			System.out.println("�޴� ����");
			int menu = scan.nextInt();
			if (menu == 1) {
				total += price1;
				num1++;
			}
			else if (menu == 2) {
				total += price2;
				num2++;
			}
			else {
				total += price3;
				num3++;
			}
			i++;
		}
		
		System.out.println("������ �Է����ּ���.");
		int cash = scan.nextInt();
		int change = cash - total;
		
		System.out.println("1�� �޴� " + num1 + "��");
		System.out.println("2�� �޴� " + num2 + "��");
		System.out.println("3�� �޴� " + num3 + "��");
		System.out.println("�� �ݾ� : " + total + "��");
		System.out.println("�ܵ� : " + change + "��");
		
	}

}
