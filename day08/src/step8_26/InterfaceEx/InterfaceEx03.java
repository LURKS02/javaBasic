package step8_26.InterfaceEx;

//표시 (marker) 인터페이스
interface Repairble{
}

//모든 유닛의 최고 조상 클래스
class Unit {
	//상수는 반드시 선언과 동시에 초기화 필요
	//선언시 초기화 하거나 생성자에서 초기화
	final int MAX_HP;
	int hp;
	//유닛 생성시 최대 HP를 넘겨받아 MAX_HP 초기화
	public Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairble {
	public Tank() {
		super(150);
		hp = MAX_HP;
		System.out.println("Tank의 현재 hp는 " + hp + " 입니다.");
	}
	@Override
	public String toString() {
		return "Tank [hp = " + hp + "]";
	}
}

class Marine extends GroundUnit {
	public Marine() {
		super(70);
		hp = MAX_HP;
		System.out.println("Marine의 현재 hp는 " + hp + " 입니다.");
	}
	@Override
	public String toString() {
		return "Marine [hp = " + hp + "]";
	}
}

class SCV extends GroundUnit implements Repairble {
	public SCV() {
		super(100);
		hp = MAX_HP;
		System.out.println("SCV의 현재 hp는 " + hp + " 입니다.");
	}
	
	/* 
	 * 메소드의 인수로 클래스 또는 인터페이스의 객체를 사용하면
	 * 인수로 사용되는 클래스/인터페이스를 구현받은 모든 클래스의 객체를 인수로 받을 수 있음
	 */
	
	public void repair(Repairble repairble) {
		Unit unit = (Unit) repairble;
		while (unit.hp != unit.MAX_HP) unit.hp++;
		System.out.println(unit + " 수리 완료");
	}
	
	@Override
	public String toString() {
		return "SCV [hp = " + hp + "]";
	}
}

class DropShip extends AirUnit implements Repairble {
	public DropShip() {
		super(120);
		hp = MAX_HP;
		System.out.println("DropShip의 현재 hp는 " + hp + " 입니다.");
	}
	@Override
	public String toString() {
		return "DropShip [hp = " + hp + "]";
	}
}

public class InterfaceEx03 {

	public static void main(String[] args) {
		
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropship = new DropShip();
		
		scv.repair(dropship);
	}
}
