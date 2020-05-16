package step5_20.classEx;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03{
	int[]arr = {87, 100, 11, 72, 92};
}

public class ClassEx03_문제 {

	public static void main(String[] args) {
		
		Ex03 e = new Ex03();
		
		// 전체 합 출력
		int total = 0;
		for (int i = 0; i < e.arr.length; i++) {
			total += e.arr[i];
		}
		System.out.println(total);
				
		// 4의 배수의 합 출력
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) {
				sum += e.arr[i]; cnt++;
			}
		}
		System.out.println(sum);
		
		// 4의 배수의 개수 출력
		System.out.println(cnt);
				
		// 짝수의 개수 출력
		int cnt2 = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 2 == 0) cnt2++;
		}
		System.out.println(cnt2);

	}

}
