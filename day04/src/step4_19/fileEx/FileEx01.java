package step4_19.fileEx;

import java.io.FileWriter;
import java.io.IOException;

//���� ����

public class FileEx01 {

	public static void main(String[] args) {
		
		String filename = "ex01.txt";
		//FileWriter fw = new FileWriter(filename);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(filename);
			fw.write("���� �����ϱ� ��������");
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// run ���� ������Ʈ ����, F5�ϸ� �޸��� ���� Ȯ�� ����
	}
}
