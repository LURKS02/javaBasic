package step1_10.whileEx;

public class WhileEx03_문제 {

	public static void main(String[] args) {
		
		//문제1 : 1~5까지의 합 출력
		//정답 : 15
		int i = 1;
		int sum = 0;
		while (i <= 5) {
			sum += i;
			i++;
		}
		System.out.println("합 : " + sum);
		
		//문제2 : 1~10까지 반복해 3미만 7이상 출력
		//정답 : 1,2,7,8,9,10
		//문제3 : 문제 2의 조건에 맞는 수들의 합 출력
		//정답 : 37
		//문제4 : 문제2의 조건에 맞는 수들의 개수 출력
		//정답 : 6
		
		int j = 1;
		sum = 0;
		int cnt = 0;
		
		while(j <= 10) {
			if(j < 3 || j >= 7) {
				System.out.print(j + " ");
				sum += j;
				cnt++;
			}
			j++;
		}
		System.out.println();
		System.out.println("합 : " + sum);
		System.out.println("개수 : " + cnt);

	}

}
