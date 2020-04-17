package step1_03.var;

public class VarEx02_문제 {

	public static void main(String[] args) {
		
		//ex) 현금이 1000원 있을 때, 200원짜리 구입 후 잔돈 출력
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
				
		//문제1) 월급이 100원일때, 연봉은? (세금 10%)
		int pay = 100;
		int annual = pay*365*9/10;
		System.out.println("연봉 = " + annual + "원");
				
		//문제2) 시험점수를 30, 50, 4점 받았을 떄, 평균은?
		int ex1 = 30;
		int ex2 = 50;
		int ex3 = 4;
		
		int sum = ex1 + ex2 + ex3;
		
		System.out.println("평균 = " + sum + "점");
			
		//문제3) 가로가 3, 세로가 6인 삼각형의 넓이 출력
		int len = 3;
		int wid = 6;
		int area = len * wid / 2;
		
		System.out.println("넓이 = " + area);
				
		//문제4) 100초를 1분 40초로 출력
		int t1 = 100;
		int m = t1 / 60;
		int s = t1 % 60;
		
		System.out.println(m + "분 " + s + "초");
		
		//문제5) 800원에서 500원짜리의 개수, 100원짜리의 개수 출력
		int m1 = 800;
		int m2 = m1 / 500;
		int m3 = m1 % 500 / 100;
		System.out.println("500원 = " + m2 + "개, 100원 = " + m3 + "개" );
		
	}

}
