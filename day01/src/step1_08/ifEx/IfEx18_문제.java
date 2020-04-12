package step1_08.ifEx;
import java.util.Scanner;


//지하철 요금 계산
//이용할 정거장 수를 입력받는다.
//정거장 수에 따라 요금이 계산된다.

//1-5 : 500원
//6-10 : 600원
//10정거장 이후는 2정거장마다 50원 추가


public class IfEx18_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정거장 수를 입력하세요.");
		int station = scan.nextInt();
		if (station <= 5) System.out.println("요금 : " + 500);
		else if (station <= 10) System.out.println("요금 : " + 600);
		else {
			int ex = (station - 10) / 2;
			if (station % 2 == 0) System.out.println("요금 : " + (600 + ex*50));
			else System.out.println("요금 : " + (600 + ex*50 + 50));
		}

	}

}
