package step1_10.whileEx;

//2���� �ݺ���

public class WhileEx21_���� {

	public static void main(String[] args) {
		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("[i] = " + i + " [j] = " + j);
			}
		}
		
		// ����) ������ ���
		
		for (int i = 0; i < 4; i++) {
			System.out.println("=== " + i + "�� ===");
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}

	}

}
