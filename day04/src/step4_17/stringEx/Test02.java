package step4_17.stringEx;

public class Test02 {

	public static void main(String[] args) {
		
		String data = "10001/��ö��/600\n";
		data += "10002/�̿���/800\n";
		data += "10001/��ö��/1400\n";
		data += "10003/���缮/780\n";
		data += "10002/�̿���/950\n";
		data += "10004/�ڸ��/330\n";
		data += "10001/��ö��/670\n";
		data += "10003/���缮/3300\n";
		data += "10002/�̿���/200\n";
		data += "10004/�ڸ��/6800\n";
		data = data.substring(0 , data.length()-1); // ������ �ۻ��� 
		
		System.out.println("=====================");
		
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;

		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		
		for(int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		
		for(int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		
		System.out.println("=====================");
		
		// ����1) �� ������ ��  ������ ȸ���� ������ �������������� ����� �����̴�.
		//		�� ȸ���� ���� ������ ����Ͻÿ�.
		
		int[] checkList = new int[totalSize];
		
		for (int i = 0; i < totalSize; i++) {
			if (checkList[i] == 1) continue;
			int cnt = 0;
			int num1 = numList[i];
			for (int j = 0; j < totalSize; j++) {
				int num2 = numList[j];
				if (num1 == num2) {
					cnt += priceList[j];
					checkList[j] = 1;
				}
			}
			System.out.println(numList[i] + " " + nameList[i] + " " + cnt);
		}
		System.out.println("=====================");
	}

}
