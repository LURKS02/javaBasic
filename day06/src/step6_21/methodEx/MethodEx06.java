package step6_21.methodEx;

/*
 * �޼����� ���� : ���ϰ��� �ִ� �޼���
 * 
 * int �޼����(�Ű�����[parameter]){
 * 		������ ����;
 * 		return ���ϰ�;
 * }
 * 
 * �޼��� ȣ��
 * int �� �޼����  = �޼����(�μ�[argument]);
 */

class Ex06{
	
	int num;
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
}

public class MethodEx06 {

	public static void main(String[] args) {
		Ex06 e = new Ex06();
		e.setNum(100);
		
		int result = e.getNum();
		System.out.println(result);
		
	}
}
