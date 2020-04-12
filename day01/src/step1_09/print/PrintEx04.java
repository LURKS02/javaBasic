package step1_09.print;

//출력 서식
/* [-][0][n][.m]지시자
 * 지시자를 제외한 나머지는 생략 가능
 * n : 출력할 전체 자리수 ex) %3d : 전체자릿수가 3인 정수
 * 0 : 전체 자릿수가 지정된 경우 왼쪽의 남는 자리에 0을 출력 ex) %03d 
 * - : 전체 자릿수가 지정된 경우 왼쪽 정렬하고 빈칸에 공백 출력
 * .m : 소수점 아래 자릿수 지정. 잘리는 소수점 자릿수는 반올림 ex) 3.2f
 */

public class PrintEx04 {

	public static void main(String[] args) {
		System.out.printf("%d", 10);
		System.out.println();
		
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
		
		System.out.printf("%c\n", 'b');
		
		System.out.printf("%s\n", "출력문의 이해");
		
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다.\n", fruit, cnt);
		
	}

}
