package step1_09.print;

//��� ����
/* [-][0][n][.m]������
 * �����ڸ� ������ �������� ���� ����
 * n : ����� ��ü �ڸ��� ex) %3d : ��ü�ڸ����� 3�� ����
 * 0 : ��ü �ڸ����� ������ ��� ������ ���� �ڸ��� 0�� ��� ex) %03d 
 * - : ��ü �ڸ����� ������ ��� ���� �����ϰ� ��ĭ�� ���� ���
 * .m : �Ҽ��� �Ʒ� �ڸ��� ����. �߸��� �Ҽ��� �ڸ����� �ݿø� ex) 3.2f
 */

public class PrintEx04 {

	public static void main(String[] args) {
		System.out.printf("%d", 10);
		System.out.println();
		
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
		
		System.out.printf("%c\n", 'b');
		
		System.out.printf("%s\n", "��¹��� ����");
		
		String fruit = "���";
		int cnt = 5;
		System.out.printf("%s�� %d�� �ֽ��ϴ�.\n", fruit, cnt);
		
	}

}
