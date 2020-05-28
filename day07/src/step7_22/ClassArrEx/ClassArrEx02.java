package step7_22.ClassArrEx;

class Card{
	static int width = 120;
	static int height = 300;
	int num;
	String shape;
}

public class ClassArrEx02 {

	public static void main(String[] args) {
		System.out.println(Card.width);
		Card c = new Card();
		Card c1 = new Card();
		
		Card[] arr = new Card[10];
		for (int i = 0; i < 10; i++) arr[i] = new Card();
	}
}
