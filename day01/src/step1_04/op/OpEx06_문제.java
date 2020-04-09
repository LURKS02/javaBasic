package step1_04.op;

public class OpEx06_문제 {

	public static void main(String[] args) {
		//ex) 점수가 60점 이상이면 true 출력
		int score = 30;
		System.out.println(score >= 60);
		
		//문제1) 3의 배수이면 true 출력
		int num = 15;
		System.out.println(num % 3 == 0);
		
		//문제2) 짝수이면 true 출력
		num = 22;
		System.out.println(num % 2 == 0);
		
		//문제3) 1000원 단위 화폐가 3장 이상이면 true 출력
		int money = 178600;
		System.out.println(money % 5000 / 1000 >= 3);
		
		
	}

}
