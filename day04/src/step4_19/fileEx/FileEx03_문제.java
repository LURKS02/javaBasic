package step4_19.fileEx;

import java.io.FileWriter;
import java.io.IOException;

// ���� �����ϱ�

public class FileEx03_���� {

	public static void main(String[] args) {
		
		// ��ö��/20,�̸���/30,�̿���/40
		
		String[] names = {"��ö��", "�̸���", "�̿���"};
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
