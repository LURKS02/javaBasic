package step3_15.arrayEx;
import java.util.Scanner;

// 2Â÷¿ø¹è¿­[»èÁ¦]

public class ArrayEx45_¹®Á¦ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] bag = {
				{"Ã¶¼ö", "¼Ò°í±â"},
				{"Ã¶¼ö", "±è¹ä"},
				{"¿µÈñ", "±èÄ¡"},
				{"Ã¶¼ö", "¹Ù³ª³ª"},
				{"Ã¶¼ö", "»õ¿ì±ø"},
				{"¿µÈñ", "¿ÀÂ¡¾î"},
				{"¿µÈñ", "¸À¹ã"}
		};
		System.out.println("»èÁ¦ÇÒ ÀÌ¸§°ú ¹øÈ£ ÀÔ·Â");
		String inputname = scan.next();
		String inputnum = scan.next();
		
		int ind = -1;
		
		for (int i = 0; i < bag.length; i++) {
			if (inputname.equals(bag[i][0]) && inputnum.compareTo(bag[i][1]) == 0) {
				ind = i;
			}
		}
		if (ind == -1) System.out.println("ÀÏÄ¡ÇÏ´Â Á¤º¸°¡ ¾ø½À´Ï´Ù.");
		else {
			for (int i = 0; i < bag.length; i++) {
				if (i == bag.length - 1) {
					bag[i][0] = "";
					bag[i][1] = "";
				}
				else if (i >= ind) {
					bag[i][0] = bag[i + 1][0];
					bag[i][1] = bag[i + 1][1];
				}
			}
		}
		
		for (int i = 0; i < bag.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(bag[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
