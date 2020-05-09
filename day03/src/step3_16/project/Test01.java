package step3_16.project;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		// 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력 
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int count = 0;
		int nums[] = new int [7];
		
		while(input > 0) {
			nums[count++] = input % 10;
			input /= 10;
		}
		if (count % 2 == 0) System.out.println("짝수 자리이다.");
		else System.out.println(nums[count / 2]);
	}

}
