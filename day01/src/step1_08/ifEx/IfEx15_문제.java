package step1_08.ifEx;

import java.util.Scanner;

//ATM - 1�ܰ�

public class IfEx15_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("���¸� �Է��ϼ���.");
		
		int inputAcc = scan.nextInt();
		
		if(inputAcc == myAcc) {
			System.out.println("��ü�� �ݾ��� �Է��ϼ���.");
			int inputMoney = scan.nextInt();
			if (myMoney >= inputMoney) {
				System.out.println("��ü�� �����մϴ�.");
				myMoney -= inputMoney;
				yourMoney += inputMoney;
			}
			else System.out.println("�ܾ��� �����մϴ�.");
		}
		else System.out.println("���¸� Ȯ���ϼ���.");
		
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");
		
	}

}
