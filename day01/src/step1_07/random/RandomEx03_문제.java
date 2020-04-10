package step1_07.random;
import java.util.Random;

//´çÃ· º¹±Ç - 1´Ü°è : 30%ÀÇ ´çÃ· È®·ü

public class RandomEx03_¹®Á¦ {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = ran.nextInt(10);
		
		System.out.println("º¹±Ç µ¹¸®±â");
		if(num < 3) System.out.println("´çÃ·!");
		else System.out.println("²Î!");

	}

}
