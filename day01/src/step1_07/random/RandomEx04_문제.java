package step1_07.random;
import java.util.Random;
import java.util.Scanner;

//Ȧ¦ ����

public class RandomEx04_���� {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(100) + 1;
		int answer;
		
		if (num % 2 == 0) answer = 2;
		else answer = 1;
		
		System.out.println("1. Ȧ��");
		System.out.println("2. ¦��");
		
		System.out.println("��ȣ�� �Է��ϼ���.");
		int choice = scan.nextInt();
		
		if (choice == answer) System.out.println("�����Դϴ�. ���� : " + num);
		else System.out.println("�����Դϴ�. ���� : " + num);

	}

}
