package step4_19.fileEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//파일 불러오기

public class FileEx02 {

	public static void main(String[] args) {
		
		String filename = "ex01.txt";
		
		File file = new File(filename);
		FileReader fr = null;
		BufferedReader br = null;
		
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
			
				String data = br.readLine(); // 한 줄 읽어오기
				System.out.println(data);
				fr.close();
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
