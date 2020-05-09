package step4_17.stringEx;

// 문자열 2차원

public class StringEx09_문제 {

	public static void main(String[] args) {
		
		// 이름과 성적을 하나의 문자열로 연결
				
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
				
		String str = "";
		for (int i = 0; i < name.length; i++) {
			str = str + name[i] + "/" + String.valueOf(score[i]);
			if (i < name.length - 1) str += ",";
		}
		System.out.println(str);
	}

}
