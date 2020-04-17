package step1_10.whileEx;

public class WhileEx22_巩力 {

	public static void main(String[] args) {
		
		//巩力1. ###
		//		###
		//		###
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		//巩力2. #
		//		##
		//		###
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		//巩力3. ###
		//		##
		//		#
		
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		//巩力4. @##
		//		@@#
		//		@@@
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int k = 3; k > i + 1; k--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		//巩力5.  #
		//  	###
		// 	   #####
		
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > i + 1; j--) System.out.print(" ");
			for (int k = 0; k < 2*i + 1; k++) System.out.print("#");
			for (int m = 3; m > i + 1; m--) System.out.print(" ");
			System.out.println();
		}
		System.out.println();
	}

}
