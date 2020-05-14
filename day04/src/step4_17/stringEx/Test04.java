package step4_17.stringEx;

public class Test04 {

	public static void main(String[] args) {
		
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		
		//전체 성적이 1등인 학생 이름 출력 
		
		double max = 0;
		String maxst = "";
		for (int i = 0; i < score.length; i++) {
			double avg = 0;
			for (int j = 1; j < score[i].length; j++) {
				avg += Integer.parseInt(score[i][j]);
			}
			avg /= (double)score[i].length;
			if (max < avg) {
				max = avg;
				maxst = score[i][0];
			}
		}
		
		for (int i = 0; i < student.length; i++) {
			if (maxst.equals(student[i][2])) System.out.println(student[i][0]);
		}
	}
}
