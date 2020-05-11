package step4_19.fileEx;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

//파일 로드하기

public class FileEx05_문제 {

	public static void main(String[] args) {
		
		String[] ids = new String[3];
		String[] pws = new String[3];
		int[] moneys = new int[3];
		
		String filename = "fileTest02.txt";
		File file = new File(filename);
		FileReader fr = null;
		BufferedReader br = null;
		
		if (file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				for (int i = 0; i < 3; i++) {
					String data = br.readLine();
					String[] arr = data.split("/");
					ids[i] = arr[0];
					pws[i] = arr[1];
					moneys[i] = Integer.parseInt(arr[2]);
				}
				fr.close();
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i] + " " + pws[i] + " " + moneys[i]);
		}
	}
}
