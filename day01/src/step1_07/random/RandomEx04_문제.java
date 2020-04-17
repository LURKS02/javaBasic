package step1_07.random;
import java.util.Random;
import java.util.Scanner;

//홀짝 게임

public class RandomEx04_문제 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(100) + 1;
		int answer;
		
		if (num % 2 == 0) answer = 2;
		else answer = 1;
		
		System.out.println("1. 홀수");
		System.out.println("2. 짝수");
		
		System.out.println("번호를 입력하세요.");
		int choice = scan.nextInt();
		
		if (choice == answer) System.out.println("정답입니다. 숫자 : " + num);
		else System.out.println("오답입니다. 숫자 : " + num);

	}

}
