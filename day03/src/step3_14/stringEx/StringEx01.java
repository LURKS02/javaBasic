package step3_14.stringEx;
import java.util.Scanner;

/*
 * 문자열
 * 숫자나 영어단어를 입력할때는 커서를 옮길 필요가 없음
 * 한글을 입력할때는 커서를 끝으로 옮기고 작성해야 함
 */

public class StringEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		
		System.out.println("name = " + name);
	}
}
