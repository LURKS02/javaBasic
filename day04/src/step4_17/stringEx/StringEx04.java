package step4_17.stringEx;

/*
 * ���ڿ� = ������ �迭
 * 0������ ���۵Ǵ� index �ο�
 */

public class StringEx04 {

	public static void main(String[] args) {
		
		String str = "megait";
		System.out.println(str);	//megait
		
		// 1.���ڿ��� ���� : length()
		int size = str.length();
		System.out.println(size);	//6
		
		// 2.�ε��� (���� �Ѱ� ����) : charAt(index)
		char ch = str.charAt(0);
		System.out.println(ch);		//m
		ch = str.charAt(size - 1);
		System.out.println(ch);		//t
		
		// 3.�����̽� (���� ������ ����)
		//	[1] substring(index1, index2) : index1 ���� index2 �̸�
		String rs = str.substring(4, 6);
		System.out.println(rs); 	//it
		
		//  [2] substring(index) : index ���� ���ڿ� ������
		rs = str.substring(4);
		System.out.println(rs); 	//it
		
		//  [3] �����ڷ� �߶󳻱�
		str = "hello, java, android";
		String[] ar = str.split(",");
		System.out.println(ar.length); 	//3
		System.out.println(ar[0]); 		//hello
		System.out.println(ar[1]);		//java
		System.out.println(ar[2]);		//android

	}

}
