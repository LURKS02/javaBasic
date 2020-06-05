package step8_25.AbstractEx;

/*
 * <추상 클래스>
 * 한 개 이상의 추상 메소드를 포함한 클래스
 * abstract 예약어를 이용해 생성
 * 상속시키기 위해 만들어 사용하는 클래스
 * 추상 클래스를 상속받은 자식 클래스는 추상 클래스의 모든 추상 메소드를 override 시켜서 사용해야 함
 */

abstract class Product {
	/*
	 * 추상 메소드 : 아무일도 하지 않는 메소드
	 * abstract를 이용, 불완전한 메소드
	 */
	public abstract void kindOf(); //추상 메소드
}

class Camera extends Product {
	
	@Override
	public void kindOf() {
		
	}
}

public class AbstractEx02 {

	public static void main(String[] args) {
		
		//Product product = new Product();
		//추상 클래스는 객체를 만들어 사용할 수 없음
		
	}
}
