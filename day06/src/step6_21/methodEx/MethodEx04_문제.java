package step6_21.methodEx;
import java.util.Scanner;

/*
 * Ŭ������ ������� : ���� + �޼���
 * �ݺ��Ǵ� �ڵ带 �޼���� ��Ȱ�� �� �� ����
 * 
 * �޼����� ����
 * Ű���� �޼����() {
 * 		�޼��� ����;
 * }
 * (������ ���� this : �ڱ� �ּҸ� �����ϴ� ����)
 * 
 */

class Ex04 {
	int num;
	void setNum() {
		System.out.println(this);
		this.num = 10;
	}
	
	void test1() {
		int total = 0;
		for (int i = 1; i <= 5; i ++) total += i;
		System.out.println(total);	
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[3];
		int max = -99999;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
			if (nums[i] > max) max = nums[i];
		}
		System.out.println(max);
	}
}

public class MethodEx04_���� {

	public static void main(String[] args) {
		
		Ex04 e = new Ex04();
		System.out.println(e);
		
		e.num = 20;
		System.out.println(e.num);
		e.setNum();
		System.out.println(e.num);
		
		// ���� 1) 1���� 5������ ���� ����ϴ� �޼���
		e.test1();
				
		// ���� 2) ���� 3���� �Է¹޾� �ִ밪�� ����ϴ� �޼���
		e.test2();

	}

}
