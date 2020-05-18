package step6_21.methodEx;

class Student3 {
	int score;
	void setScore() {
		score = 87;
		System.out.println("this = " + this);
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		Student3 hgd = new Student3();
		hgd.score = 100;
		
		hgd.setScore();
		System.out.println(hgd.score);
		System.out.println("hgd = " + hgd);
	}
}
