package step1_10.whileEx;

//369∞‘¿” - 2¥‹∞Ë

public class WhileEx12_πÆ¡¶ {

	public static void main(String[] args) {
		int k = 1;
		while(k <= 50) {
			int num1 = k / 10;
			int num2 = k % 10;
			int cnt = 0;
			
			if(num1 == 3 || num1 == 6 || num1 == 9) cnt++;
			if(num2 == 3 || num2 == 6 || num2 == 9) cnt++;
			
			if (cnt == 2) System.out.print("¬¶¬¶ ");
			else if (cnt == 1) System.out.print("¬¶ ");
			else System.out.print(k + " ");
			
			k++;
		}

	}

}
