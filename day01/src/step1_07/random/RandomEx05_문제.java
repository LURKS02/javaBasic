package step1_07.random;
import java.util.Scanner;
import java.util.Random;


//������ ���� - 2�ܰ�


public class RandomEx05_���� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num1 = ran.nextInt(9) + 1;
		int num2 = ran.nextInt(9) + 1;
		int mul = num1 * num2;
		
		System.out.println(num1 + " X " + num2 + " = ?");
		int input = scan.nextInt();
		
		if (input == mul) System.out.println("����");
		else System.out.println("����");
		
	}

}
