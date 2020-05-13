package step4_19.fileEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

//�ܼ� �Խ���

public class FileEx12_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        String filename = "board.txt";

		String[][] board = null;
		int count = 0;				// ��ü �Խñ� ��
		int pageSize = 5;			// �� �������� ������ �Խñ� ��
		int curPageNum = 1;			// ���� ������ ��ȣ
		int pageCount = 1;			// ��ü ������ ����
		int startRow = 0;			// ���� �������� �Խñ� ���� ��ȣ
		int endRow = 0;				// ���� �������� �Խñ� ������ ��ȣ
		
		File file = new File(filename);
		if (file.exists()) {
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String data = "";
				while(true) {
					String line = br.readLine();
					if (line == null) break;
					data += line;
					data += "\n";
				}
				
				if (!data.equals("")) {
					data = data.substring(0, data.length() - 1);
					String[] parse = data.split("\n");
					board = new String[parse.length][2];
					for (int i = 0; i < parse.length; i++) {
						board[i][0] = parse[i].split("/")[0];
						board[i][1] = parse[i].split("/")[1];
					}
					count += parse.length;
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if (fr != null) { try {fr.close();} catch (IOException e) {}}
				if (br != null) { try {br.close();} catch (IOException e) {}}
			}
		}
		
		while(true) {
			
			pageCount = count / 5;
			if (count % pageSize > 0) pageCount++;
			
			startRow = (curPageNum - 1)*pageSize;
			endRow = startRow + pageSize - 1;
			if (endRow >= count) endRow = count - 1;
			
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");

			int choice = scan.nextInt();
			
			if(choice == 1) {
				if (curPageNum == 1) System.out.println("ù��° �������Դϴ�.");
				else curPageNum--;
				
			}
			
			else if(choice == 2) {
				if (curPageNum == pageCount) System.out.println("������ �������Դϴ�.");
				else curPageNum++;
			}
			
			else if(choice == 3) {
				System.out.println("�� ����� ������ �Է����ּ���.");
				String inputstr1 = scan.next();
				String inputstr2 = scan.next();
				
				if (count == 0) {
					board = new String[count + 1][2];
				}
				else {
					String[][] temp = board;
					board = new String[count + 1][2];
					for (int i = 0; i < count; i++) board[i] = temp[i];
					temp = null;
				}
				board[count][0] = inputstr1;
				board[count][1] = inputstr2;
				System.out.println("��ϵǾ����ϴ�.");
				count++;
				
				String data = "";
				for (int i = 0; i < count; i++) {
					data = data + board[i][0] + "/" + board[i][1] + "\n";
				}
				data = data.substring(0, data.length() - 1);
				
				FileWriter fw = null;
				try {
					fw = new FileWriter(filename);
					fw.write(data);
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (fw != null) { try { fw.close(); } catch (IOException e) {}}
				}
			}
			
			else if(choice == 4) {
				System.out.println("������ �Խñ� ��ȣ�� �Է����ּ���.");
				int boardnum = scan.nextInt();
				if (boardnum < 1 || boardnum > count) System.out.println("�ش� ��ȣ�� �����ϴ�.");
				else {
					String[][] temp = board;
					board = new String[count - 1][2];
					
					for (int i = 0; i < count - 1; i++) {
						if (i < boardnum - 1) {
							board[i] = temp[i];
						}
						else if (i >= boardnum - 1) {
							board[i] = temp[i + 1];
						}
					}
					count--;
					
					String data = "";
					
					if (count != 0) {
						for (int i = 0; i < count; i++) {
							data = data + board[i][0] + "/" + board[i][1] + "\n";
						}
						data = data.substring(0, (data.length() - 1));
					}
					
					FileWriter fw = null;
					try {
						fw = new FileWriter(filename);
						fw.write(data);
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						if (fw != null) { try { fw.close(); } catch (IOException e) {}}
					}
				}
			}
			
			else if(choice == 5) {
				if (count == 0) {
					System.out.println("�Խù��� �����ϴ�.");
				}
				else {
					System.out.println("���� ������ : " + curPageNum);
					for (int i = startRow; i < endRow + 1; i++) {
						System.out.println("���� : " + board[i][0]);
						System.out.println("���� : " + board[i][1]);
					}
				}
			}
		}
	}
}
