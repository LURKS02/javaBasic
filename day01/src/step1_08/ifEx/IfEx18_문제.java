package step1_08.ifEx;
import java.util.Scanner;


//����ö ��� ���
//�̿��� ������ ���� �Է¹޴´�.
//������ ���� ���� ����� ���ȴ�.

//1-5 : 500��
//6-10 : 600��
//10������ ���Ĵ� 2�����帶�� 50�� �߰�


public class IfEx18_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���� �Է��ϼ���.");
		int station = scan.nextInt();
		if (station <= 5) System.out.println("��� : " + 500);
		else if (station <= 10) System.out.println("��� : " + 600);
		else {
			int ex = (station - 10) / 2;
			if (station % 2 == 0) System.out.println("��� : " + (600 + ex*50));
			else System.out.println("��� : " + (600 + ex*50 + 50));
		}

	}

}
