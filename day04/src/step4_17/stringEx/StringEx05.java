package step4_17.stringEx;

/*
 * ����ȯ (type conversion)
 * �ڷ��� (data type)�� �ٲٴ� ���� �ǹ�
 * (��ȯ�� �ڷ���)����
 */

public class StringEx05 {

	public static void main(String[] args) {
		
		//���� -> ����
		char ch = 'a';
		int aNum = (int)ch;
		System.out.println(aNum); 	//97
		
		ch = (char)(aNum + 1);
		System.out.println(ch);		//b
		
		//���ڿ� -> ����
		String strNum = "10";
		int num = Integer.parseInt(strNum);
		System.out.println(num + 1); 	//11
		
		//���� -> ���ڿ�
		strNum = num + "";
		System.out.println(strNum + 1); 	//101
		
		strNum = String.valueOf(num);
		System.out.println(strNum + 1); 	//101

	}

}
