package step6_21.methodEx;

class Student2 {
	int setScore(int score) {
		score = 100;
		return score;
	}
}

public class MethodEx02 {

	public static void main(String[] args) {

		Student2 hgd = new Student2();
		
		int score = 87;
		System.out.println(score);	//87
		
		score = hgd.setScore(score);
		System.out.println(score);	//100
	}

}
