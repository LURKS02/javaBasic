package step1_07.random;

//����
import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//ex) 0 ~ 2 ������ ����
		int rNum = ran.nextInt(3);
		System.out.println(rNum);
		
		//ex) 1 ~ 5 ������ ����
		rNum = ran.nextInt(5) + 1;
		System.out.println(rNum);

		//ex) -3 ~ 3 ������ ����
		rNum = ran.nextInt(7) - 3;
		System.out.println(rNum);
	}

}
