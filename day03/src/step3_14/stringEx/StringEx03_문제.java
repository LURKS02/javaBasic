package step3_14.stringEx;

//���ڿ� - ����
/*
 * compareTo() �޼ҵ�
 * 2���� ���ڿ��� ���Ͽ� int���� ��ȯ
 * A.compareTo(B)
 * A == B �̸� 0
 * A�� B���� ���̸� ����
 * A�� B���� ���̸� ���
 * 
 */

public class StringEx03_���� {

	public static void main(String[] args) {
		String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// ����
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// ���
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
		
		String[] names = {"ȫ�浿", "������", "������", "�ڹ�ŷ", "������"};
		for (int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		for (int i = 0; i < names.length; i++) System.out.print(names[i] + " ");
	}
}
