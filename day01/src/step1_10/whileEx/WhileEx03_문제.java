package step1_10.whileEx;

public class WhileEx03_���� {

	public static void main(String[] args) {
		
		//����1 : 1~5������ �� ���
		//���� : 15
		int i = 1;
		int sum = 0;
		while (i <= 5) {
			sum += i;
			i++;
		}
		System.out.println("�� : " + sum);
		
		//����2 : 1~10���� �ݺ��� 3�̸� 7�̻� ���
		//���� : 1,2,7,8,9,10
		//����3 : ���� 2�� ���ǿ� �´� ������ �� ���
		//���� : 37
		//����4 : ����2�� ���ǿ� �´� ������ ���� ���
		//���� : 6
		
		int j = 1;
		sum = 0;
		int cnt = 0;
		
		while(j <= 10) {
			if(j < 3 || j >= 7) {
				System.out.print(j + " ");
				sum += j;
				cnt++;
			}
			j++;
		}
		System.out.println();
		System.out.println("�� : " + sum);
		System.out.println("���� : " + cnt);

	}

}
