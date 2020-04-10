package step1_07.random;

//·£´ı
import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//ex) 0 ~ 2 »çÀÌÀÇ ·£´ı
		int rNum = ran.nextInt(3);
		System.out.println(rNum);
		
		//ex) 1 ~ 5 »çÀÌÀÇ ·£´ı
		rNum = ran.nextInt(5) + 1;
		System.out.println(rNum);

		//ex) -3 ~ 3 »çÀÌÀÇ ·£´ı
		rNum = ran.nextInt(7) - 3;
		System.out.println(rNum);
	}

}
