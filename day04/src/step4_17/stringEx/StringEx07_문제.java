package step4_17.stringEx;

//문자열 1차원

public class StringEx07_문제 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		
		// arr 배열에 각 점수를 저장하고, 총점 출력
		
		int total = 0;
		String[] temp = str.split("/");
		for (int i = 0; i < 3; i++) {
			total += Integer.parseInt(temp[i]);
		}
		System.out.println(total);
		
		// scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		
		int[] scores = {11, 100, 89};
		String text = "";
		for (int i = 0; i < scores.length; i++) {
			text += String.valueOf(scores[i]);
			if (i != scores.length - 1) text += "/";
		}
		System.out.println(text);
	}
}
