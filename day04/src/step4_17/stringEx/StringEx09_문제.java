package step4_17.stringEx;

// ���ڿ� 2����

public class StringEx09_���� {

	public static void main(String[] args) {
		
		// �̸��� ������ �ϳ��� ���ڿ��� ����
				
		String[] name = {"��ö��", "�̸���", "�̿���"};
		int[] score = {87, 42, 95};
				
		String str = "";
		for (int i = 0; i < name.length; i++) {
			str = str + name[i] + "/" + String.valueOf(score[i]);
			if (i < name.length - 1) str += ",";
		}
		System.out.println(str);
	}

}
