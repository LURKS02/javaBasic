package step3_15.arrayEx;

// 2Â÷¿ø¹è¿­[Á¤·Ä]

public class ArrayEx46_¹®Á¦ {

	public static void main(String[] args) {
		int bagcount = 5;
		String[][] bag = {
			{"Ã¶¼ö", "±è¹ä"},
			{"¿µÈñ", "°¨"},
			{"Ã¶¼ö", "»ç°ú"},
			{"¿µÈñ", "»ç°ú"},
			{"¿µÈñ", "±è¹ä"}
		};
		for(int i = 0; i < bag.length; i++) {
			System.out.println(bag[i][0] + " : " + bag[i][1]);
		}
		System.out.println();
		
		for (int i = 0; i < bag.length; i++) {
			for (int j = i + 1; j < bag.length; j++) {
				if (bag[i][0].compareTo(bag[j][0]) > 0) {
					String temp1 = bag[i][0];
					String temp2 = bag[i][1];
					bag[i][0] = bag[j][0];
					bag[i][1] = bag[j][1];
					bag[j][0] = temp1;
					bag[j][1] = temp2;
				}
				else if (bag[i][0].compareTo(bag[j][0]) == 0) {
					if (bag[i][1].compareTo(bag[j][1]) > 0) {
						String temp1 = bag[i][0];
						String temp2 = bag[i][1];
						bag[i][0] = bag[j][0];
						bag[i][1] = bag[j][1];
						bag[j][0] = temp1;
						bag[j][1] = temp2;
					}
				}
			}
		}
		for(int i = 0; i < bag.length; i++) {
			System.out.println(bag[i][0] + " : " + bag[i][1]);
		}

	}

}
