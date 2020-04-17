package step1_10.whileEx;

//2차원 반복문

public class WhileEx21_문제 {

	public static void main(String[] args) {
		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("[i] = " + i + " [j] = " + j);
			}
		}
		
		// 문제) 구구단 출력
		
		for (int i = 0; i < 4; i++) {
			System.out.println("=== " + i + "단 ===");
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}

	}

}
