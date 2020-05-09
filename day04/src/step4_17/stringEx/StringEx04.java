package step4_17.stringEx;

/*
 * 문자열 = 문자의 배열
 * 0번부터 시작되는 index 부여
 */

public class StringEx04 {

	public static void main(String[] args) {
		
		String str = "megait";
		System.out.println(str);	//megait
		
		// 1.문자열의 길이 : length()
		int size = str.length();
		System.out.println(size);	//6
		
		// 2.인덱싱 (문자 한개 추출) : charAt(index)
		char ch = str.charAt(0);
		System.out.println(ch);		//m
		ch = str.charAt(size - 1);
		System.out.println(ch);		//t
		
		// 3.슬라이싱 (문자 여러개 추출)
		//	[1] substring(index1, index2) : index1 부터 index2 미만
		String rs = str.substring(4, 6);
		System.out.println(rs); 	//it
		
		//  [2] substring(index) : index 부터 문자열 끝까지
		rs = str.substring(4);
		System.out.println(rs); 	//it
		
		//  [3] 구분자로 잘라내기
		str = "hello, java, android";
		String[] ar = str.split(",");
		System.out.println(ar.length); 	//3
		System.out.println(ar[0]); 		//hello
		System.out.println(ar[1]);		//java
		System.out.println(ar[2]);		//android

	}

}
