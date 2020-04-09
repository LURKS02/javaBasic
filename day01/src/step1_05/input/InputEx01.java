package step1_05.input;

import java.util.Scanner;
//java.util 패키지 안의 Scanner 클래스 파일을 불러온다.
//scan 변수 설정 : Scanner scan = new Scanner(System.in);

public class InputEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		System.out.println("입력하신 숫자는 " + num + "입니다.");
		
		System.out.print("나이를 입력하세요.");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "세 입니다.");

	}

}
