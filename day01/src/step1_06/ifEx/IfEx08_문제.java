package step1_06.ifEx;

import java.util.Scanner;

//���̱ⱸ �̿�����
//Ű�� �Է¹޴´�.
//�Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
//Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
//��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.

public class IfEx08_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�θ�԰� �Բ� ���̳���?");
		int parent = scan.nextInt();
		
		if(parent == 1) {
			System.out.println("���̱ⱸ�� �̿��Ͻ� �� �ֽ��ϴ�.");
		}
		
		else {
			System.out.println("Ű�� �Է����ּ���.");
			int h = scan.nextInt();
			
			if (h >= 120) System.out.println("���̱ⱸ�� �̿��Ͻ� �� �ֽ��ϴ�.");
			else System.out.println("���̱ⱸ�� �̿��Ͻ� �� �����ϴ�.");
		}

	}

}
