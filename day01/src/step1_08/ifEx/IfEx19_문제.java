package step1_08.ifEx;
import java.util.Scanner;
import java.util.Random;

//������ ��ȣ ���߱� ����

public class IfEx19_���� {

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
		System.out.println("���� = 1 / ���� = 2 / ���� = 3 / ������ = 4");
		int input = scan.nextInt();
		
		if (input == op) System.out.println("�����Դϴ�.");
		else System.out.println("�����Դϴ�.");

	}

}
