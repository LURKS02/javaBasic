package step1_10.whileEx;
import java.util.Scanner;
import java.util.Random;

//������ ���� - 3�ܰ�
//������ ������ 5ȸ �ݺ��Ѵ�.
//������ ���߸� 20���̴�.
//���� ���� �� ������ ����Ѵ�.

public class WhileEx04_���� {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int num1;
		int num2;
		int mul;
		int input;
		int score = 0;
		
		while(i <= 5) {
			num1 = ran.nextInt(10) + 1;
			num2 = ran.nextInt(10) + 1;
			mul = num1 * num2;
			
			System.out.println(num1 + " X " + num2 + " = ?");
			input = scan.nextInt();
			
			if(input == mul) {
				score += 20;
				System.out.println("����");
			}
			else System.out.println("����");
			
			i++;
		}
		
		System.out.println("������ " + score + "�� �Դϴ�.");

	}

}
