package step3_16.project;

// 삼각형 그리기 2

public class Test04 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9 - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print((i + 1) + " ");
			}
			for (int j = 0; j < 9 - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
