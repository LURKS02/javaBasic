package step1_08.ifEx;
import java.util.Scanner;
import java.util.Random;

//연산자 기호 맞추기 게임
//1~10 사이 랜덤 숫자 2개를 저장
//1~4 사이 랜덤 숫자 1개를 저장
//연산자 기호 1.덧셈 2.뺄셈 3.곱셈 4.나머지
//사용한 연산자 기호를 맞추는 게임


public class IfEx19_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = ran.nextInt(10) + 1;
		int num2 = ran.nextInt(10) + 1;
		
		int op = ran.nextInt(4) + 1;
		int result;
		
		if(op == 1) result = num1 + num2;
		else if (op == 2) result = num1 - num2;
		else if (op == 3) result = num1 * num2;
		else result = num1 % num2;
		
		System.out.println(num1 + " ? " + num2 + " = " + result);
		System.out.println("덧셈 = 1 / 뺄셈 = 2 / 곱셈 = 3 / 나머지 = 4");
		int input = scan.nextInt();
		
		if (input == op) System.out.println("정답입니다.");
		else System.out.println("오답입니다.");

	}

}
