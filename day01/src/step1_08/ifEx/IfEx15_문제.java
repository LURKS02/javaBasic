package step1_08.ifEx;

import java.util.Scanner;

//ATM - 1단계

public class IfEx15_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("계좌를 입력하세요.");
		
		int inputAcc = scan.nextInt();
		
		if(inputAcc == myAcc) {
			System.out.println("이체할 금액을 입력하세요.");
			int inputMoney = scan.nextInt();
			if (myMoney >= inputMoney) {
				System.out.println("이체가 가능합니다.");
				myMoney -= inputMoney;
				yourMoney += inputMoney;
			}
			else System.out.println("잔액이 부족합니다.");
		}
		else System.out.println("계좌를 확인하세요.");
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
	}

}
