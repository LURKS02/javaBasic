package step1_03.var;

public class VarEx02_���� {

	public static void main(String[] args) {
		
		//ex) ������ 1000�� ���� ��, 200��¥�� ���� �� �ܵ� ���
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("�ܵ� = " + change + "��");
				
		//����1) ������ 100���϶�, ������? (���� 10%)
		int pay = 100;
		int annual = pay*365*9/10;
		System.out.println("���� = " + annual + "��");
				
		//����2) ���������� 30, 50, 4�� �޾��� ��, �����?
		int ex1 = 30;
		int ex2 = 50;
		int ex3 = 4;
		
		int sum = ex1 + ex2 + ex3;
		
		System.out.println("��� = " + sum + "��");
			
		//����3) ���ΰ� 3, ���ΰ� 6�� �ﰢ���� ���� ���
		int len = 3;
		int wid = 6;
		int area = len * wid / 2;
		
		System.out.println("���� = " + area);
				
		//����4) 100�ʸ� 1�� 40�ʷ� ���
		int t1 = 100;
		int m = t1 / 60;
		int s = t1 % 60;
		
		System.out.println(m + "�� " + s + "��");
		
		//����5) 800������ 500��¥���� ����, 100��¥���� ���� ���
		int m1 = 800;
		int m2 = m1 / 500;
		int m3 = m1 % 500 / 100;
		System.out.println("500�� = " + m2 + "��, 100�� = " + m3 + "��" );
		
	}

}
