package step1_10.whileEx;
import java.util.Scanner;
import java.util.Random;

//�ý� ����

public class WhileEx18_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//������
		int desX = ran.nextInt(21) - 10;
		int desY = ran.nextInt(21) - 10;
		
		//���� ��ġ
		int x = 0;
		int y = 0;
		
		//����
		int dir = 0;
		//�ӵ�
		int speed = 0;
		//���
		int fee = 0;
		//�̵� ĭ ��
		int move = 0;
		
		while(true) {
			System.out.println("�ý� ����");
			System.out.println("������ : " + desX + ", " + desY);
			System.out.println("����ġ : " + x + ", " + y);
			System.out.println("���� : " + dir);
			System.out.println("�ӵ� : " + speed);
			System.out.println();
			
			System.out.println("1. ���� ����   2. �ӵ� ����   3. �̵��ϱ�");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("������ �����ϼ���.");
				dir = scan.nextInt();
			}
			else if (sel == 2) {
				System.out.println("�ӵ��� �����ϼ���.");
				speed = scan.nextInt();
			}
			else {
				System.out.println("�̵��մϴ�.");
				if(dir == 1) x += speed;
				else if(dir == 2) x -= speed;
				else if(dir == 3) y -= speed;
				else y += speed;
				move += speed;
			}
			
			if (x == desX && y == desY) {
				if (move % 2 == 0) fee = (move / 2) * 50;
				else fee = (move / 2) * 50 + 50;
				
				System.out.println("������ ����");
				System.out.println("��� : " + fee);
				break;
			}
		}
	}

}
