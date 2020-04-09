package step1_02.op;

public class OpEx03_문제 {

	public static void main(String[] args) {
		
		//ex) 현금이 1000원 있을 때, 200원짜리 과자 구입 후 잔돈 출력
		System.out.println("잔돈 = " + (1000 - 200) + "원");
		
		//문제1) 월급이 100원일때, 연봉은? (세금 10%)
		System.out.println("연봉 = " + (100 * 365 * 90 / 100) + "원");
		
		//문제2) 시험점수를 30, 50, 4점 받았을 떄, 평균은?
		System.out.println("평균 = " + ((30 + 50 + 4) / 3));
		
		//문제3) 가로가 3, 세로가 6인 삼각형의 넓이 출력
		System.out.println("넓이 = " + (3 * 6 / 2));
		
		//문제4) 100초를 1분 40초로 출력
		System.out.println((100/60) + "분 " + (100%60) + "초");
		
		//문제5) 800원에서 500원짜리의 개수, 100원짜리의 개수 출력
		System.out.println("500원 = " + (800/500) + "개, 100원 = " + (800%500/100) + "개");
		
	}

}
