package step4_17.stringEx;

//���ڿ� 1����

public class StringEx07_���� {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		
		// arr �迭�� �� ������ �����ϰ�, ���� ���
		
		int total = 0;
		String[] temp = str.split("/");
		for (int i = 0; i < 3; i++) {
			total += Integer.parseInt(temp[i]);
		}
		System.out.println(total);
		
		// scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		
		int[] scores = {11, 100, 89};
		String text = "";
		for (int i = 0; i < scores.length; i++) {
			text += String.valueOf(scores[i]);
			if (i != scores.length - 1) text += "/";
		}
		System.out.println(text);
	}
}
