package step4_17.stringEx;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		String [][] student = {{"aaa","����","1001"}, {"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} , {"ddd" , "����","1004"}};
		String[][] score = {
				{"��ȣ" ,"����" , "����"},
				{"1001" ,"����","20"},
				{"1002" ,"����","50"},
				{"1003" ,"����","60"},
				{"1004" ,"����","17"},
				{"1001" ,"����","65"},
				{"1002" ,"����","15"},
				{"1003" ,"����","80"},
				{"1004" ,"����","70"},
				{"1001" ,"����","43"},
				{"1002" ,"����","90"},
				{"1003" ,"����","30"},
				{"1004" ,"����","70"}
		};
		
		int[][] totalscore = new int [student.length][3];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < totalscore.length; j++) {
				if (score[i][0].equals(student[j][2])) {
					if (score[i][1].equals("����")) totalscore[j][0] = Integer.parseInt(score[i][2]);
					else if (score[i][1].equals("����")) totalscore[j][1] = Integer.parseInt(score[i][2]);
					else totalscore[j][2] = Integer.parseInt(score[i][2]);
				}
			}
		}
		for (int i = 0; i < totalscore.length; i++) {
			for (int j = 0; j < totalscore[i].length; j++)
				System.out.print(totalscore[i][j] + " ");
			System.out.println();
		}
		
		int max = 0;
		String maxst = "";
		for (int i = 0; i < totalscore.length; i++) {
			if (max < totalscore[i][0] + totalscore[i][1] + totalscore[i][2]) {
				max = totalscore[i][0] + totalscore[i][1] + totalscore[i][2];
				maxst = student[i][0];
			}
		}
		System.out.println(maxst);
		
	}

}
