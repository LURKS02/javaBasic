package step8_25.AbstractEx;

/*
 * <�߻� Ŭ����>
 * �� �� �̻��� �߻� �޼ҵ带 ������ Ŭ����
 * abstract ���� �̿��� ����
 * ��ӽ�Ű�� ���� ����� ����ϴ� Ŭ����
 * �߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ �߻� Ŭ������ ��� �߻� �޼ҵ带 override ���Ѽ� ����ؾ� ��
 */

abstract class Product {
	/*
	 * �߻� �޼ҵ� : �ƹ��ϵ� ���� �ʴ� �޼ҵ�
	 * abstract�� �̿�, �ҿ����� �޼ҵ�
	 */
	public abstract void kindOf(); //�߻� �޼ҵ�
}

class Camera extends Product {
	
	@Override
	public void kindOf() {
		
	}
}

public class AbstractEx02 {

	public static void main(String[] args) {
		
		//Product product = new Product();
		//�߻� Ŭ������ ��ü�� ����� ����� �� ����
		
	}
}
