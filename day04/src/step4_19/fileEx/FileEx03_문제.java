package step4_19.fileEx;

import java.io.FileWriter;
import java.io.IOException;

// 파일 저장하기

public class FileEx03_문제 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[]     ages = {	   20,     30,     40};
		
		String filename = "fileTest01.txt";
		
		String data = "";
		
		for (int i = 0; i < 3; i++) {
			data = data + names[i] + "/" + String.valueOf(ages[i]);
			if (i != 2) data += ".";
		}
		System.out.println(data);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(filename);
			fw.write(data);
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
