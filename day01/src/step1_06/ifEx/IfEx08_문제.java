package step1_06.ifEx;

import java.util.Scanner;

//놀이기구 이용제한
//키를 입력받는다.
//입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
//키가 120 미만이면, 놀이기구를 이용할 수 없다.
//단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.

public class IfEx08_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("부모님과 함께 오셨나요?");
		int parent = scan.nextInt();
		
		if(parent == 1) {
			System.out.println("놀이기구를 이용하실 수 있습니다.");
		}
		
		else {
			System.out.println("키를 입력해주세요.");
			int h = scan.nextInt();
			
			if (h >= 120) System.out.println("놀이기구를 이용하실 수 있습니다.");
			else System.out.println("놀이기구를 이용하실 수 없습니다.");
		}

	}

}
