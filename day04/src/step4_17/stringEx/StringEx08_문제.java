package step4_17.stringEx;

// ���ڿ� 2����

public class StringEx08_���� {

	public static void main(String[] args) {
		
		// �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] split = str.split(",");
		for (int i = 0; i < 3; i++) {
			name[i] = split[i].split("/")[0];
			score[i] = Integer.parseInt(split[i].split("/")[1]);
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(name[i] + " : " + score[i] + "��");
		}

	}

}
