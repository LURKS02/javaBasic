package step4_19.fileEx;

import java.io.FileWriter;
import java.io.IOException;

//파일 저장하기

public class FileEx04_문제 {

	public static void main(String[] args) {
		
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
				
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
				
		String filename = "fileTest02.txt";
				
		String data = "";
		
		for (int i = 0; i < 3; i++) {
			data = data + names[i] + "/" + pws[i] + "/" + String.valueOf(moneys[i]) + "\n";
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
