package step1_06.ifEx;

import java.util.Scanner;

//가위바위보 게임
//가위[0], 바위[1], 보[2]
//com 은 바위[1]만 낼 수 있다.
//me 는 0~2 사이의 숫자를 입력받는다.
//com 과 me 를 비교해 "비겼다/내가 이겼다/내가 졌다" 를 출력한다.

public class IfEx03_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int com = 1;
		int me = scan.nextInt();
		
		if(me < com) {
			System.out.println("내가 졌다.");
		}
		if(me == com) {
			System.out.println("비겼다.");
		}
		if(me > com) {
			System.out.println("내가 이겼다.");
		}
	}

}
