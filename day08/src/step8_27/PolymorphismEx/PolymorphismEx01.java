package step8_27.PolymorphismEx;

class Unit {
	int hp;
	int power;
}

class Wolf extends Unit {
	int leg;
	int bite;
}

class Bat extends Unit {
	int fly;
	int poison;
}

public class PolymorphismEx01 {
	public static void main(String[] args) {
		
		Unit[] unitList = new Unit[10];
		
		Wolf wolf = new Wolf();
		unitList[0] = wolf;
		Bat bat = new Bat();
		unitList[1] = bat;

	}
}
