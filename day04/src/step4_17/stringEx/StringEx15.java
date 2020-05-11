package step4_17.stringEx;

import java.util.Scanner;

/*
 * next() : 공백을 기준으로 한 단어씩 입력받음
 * nextLine() : 문장 한 라인 전체를 입력받음
 */

public class StringEx15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력");
		String name = scan.nextLine();
		System.out.println(name);
		//hello java
		
		System.out.println("입력");
		name = scan.next();
		System.out.println(name);
		//hello
		
	}

}
