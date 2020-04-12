package step1_10.whileEx;

import java.util.Scanner;

//반복문 종료 
//무한 반복을 하면서 숫자를 입력받는다.
//입력한 숫자가 -100이면 프로그램을 종료한다.

public class WhileEx06_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력");
			int input = scan.nextInt();
			if(input == -100) {
				System.out.println("종료");
				break;
			}
		}

	}

}
