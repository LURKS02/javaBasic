package step1_07.random;
import java.util.Random;

//��÷ ���� - 1�ܰ� : 30%�� ��÷ Ȯ��

public class RandomEx03_���� {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = ran.nextInt(10);
		
		System.out.println("���� ������");
		if(num < 3) System.out.println("��÷!");
		else System.out.println("��!");

	}

}
