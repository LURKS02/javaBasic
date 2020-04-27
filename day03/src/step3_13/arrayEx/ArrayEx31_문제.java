package step3_13.arrayEx;

//석차 출력 (성적 순으로 이름 출력)

public class ArrayEx31_문제 {

	public static void main(String[] args) {
		
		String[] name = {"홍길동", "김은희", "이민철", "오지현", "강수진"};
		int[] score   = {87, 42, 100, 11, 98};
		
		//selection sort
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5; j++) {
				if (score[i] < score[j]) {
					int tempi = score[i];
					score[i] = score[j];
					score[j] = tempi;
					
					String temps = name[i];
					name[i] = name[j];
					name[j] = temps;
				}
			}
		}
		
		for (int k = 0; k < 5; k++) {
			System.out.print(score[k] + " ");
		}
		System.out.println();
		
		for (int k = 0; k < 5; k++) {
			System.out.print(name[k] + " ");
		}
		System.out.println();

	}

}
