package step3_14.stringEx;

//문자열 - 정렬
/*
 * compareTo() 메소드
 * 2개의 문자열을 비교하여 int값을 반환
 * A.compareTo(B)
 * A == B 이면 0
 * A가 B보다 앞이면 음수
 * A가 B보다 뒤이면 양수
 * 
 */

public class StringEx03_문제 {

	public static void main(String[] args) {
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// 양수
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		for (int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		for (int i = 0; i < names.length; i++) System.out.print(names[i] + " ");
	}
}
