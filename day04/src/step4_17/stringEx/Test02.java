package step4_17.stringEx;

public class Test02 {

	public static void main(String[] args) {
		
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		data = data.substring(0 , data.length()-1); // 마지막 글삭제 
		
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
		
		// 문제1) 위 데이터 는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
		//		각 회원별 구입 총합을 출력하시오.
		
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
