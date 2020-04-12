package step1_10.whileEx;

//369게임 - 2단계
/*
 * 1~50까지 반복한다.
 * 그 안에서 해당 숫자의 369게임 결과를 반환
 * 
 */

public class WhileEx12_문제 {

	public static void main(String[] args) {
		int k = 1;
		while(k <= 50) {
			int num1 = k / 10;
			int num2 = k % 10;
			int cnt = 0;
			
			if(num1 == 3 || num1 == 6 || num1 == 9) cnt++;
			if(num2 == 3 || num2 == 6 || num2 == 9) cnt++;
			
			if (cnt == 2) System.out.print("짝짝 ");
			else if (cnt == 1) System.out.print("짝 ");
			else System.out.print(k + " ");
			
			k++;
		}

	}

}
