package step8_26.InterfaceEx;

//ǥ�� (marker) �������̽�
interface Repairble{
}

//��� ������ �ְ� ���� Ŭ����
class Unit {
	//����� �ݵ�� ����� ���ÿ� �ʱ�ȭ �ʿ�
	//����� �ʱ�ȭ �ϰų� �����ڿ��� �ʱ�ȭ
	final int MAX_HP;
	int hp;
	//���� ������ �ִ� HP�� �Ѱܹ޾� MAX_HP �ʱ�ȭ
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
		System.out.println("Tank�� ���� hp�� " + hp + " �Դϴ�.");
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
		System.out.println("Marine�� ���� hp�� " + hp + " �Դϴ�.");
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
		System.out.println("SCV�� ���� hp�� " + hp + " �Դϴ�.");
	}
	
	/* 
	 * �޼ҵ��� �μ��� Ŭ���� �Ǵ� �������̽��� ��ü�� ����ϸ�
	 * �μ��� ���Ǵ� Ŭ����/�������̽��� �������� ��� Ŭ������ ��ü�� �μ��� ���� �� ����
	 */
	
	public void repair(Repairble repairble) {
		Unit unit = (Unit) repairble;
		while (unit.hp != unit.MAX_HP) unit.hp++;
		System.out.println(unit + " ���� �Ϸ�");
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
		System.out.println("DropShip�� ���� hp�� " + hp + " �Դϴ�.");
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
