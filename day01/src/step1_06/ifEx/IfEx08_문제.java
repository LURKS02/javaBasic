package step1_06.ifEx;

import java.util.Scanner;

//���̱ⱸ �̿�����

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
