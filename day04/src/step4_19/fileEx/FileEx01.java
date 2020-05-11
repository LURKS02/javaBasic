package step4_19.fileEx;

import java.io.FileWriter;
import java.io.IOException;

//파일 저장

public class FileEx01 {

	public static void main(String[] args) {
		
		String filename = "ex01.txt";
		//FileWriter fw = new FileWriter(filename);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(filename);
			fw.write("파일 저장하기 연습문제");
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// run 이후 프로젝트 선택, F5하면 메모장 파일 확인 가능
	}
}
