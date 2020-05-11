package step4_19.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

//# ���� ��Ʈ�ѷ�[3�ܰ�] : ��ٱ���

public class FileEx08_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",   "2222", "3333"};
		String[] items = {"���", "�ٳ���", "����"};
		
		final int MAX_SIZE = 100;
		int[][] bag = new int[MAX_SIZE][2];

		String filename = "bag.txt";
		
		int count = 0;
		int log = -1;
		
		while(true) {
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[4]��ٱ���");
			System.out.println("[5]����");
			System.out.println("[6]�ε�");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//�α���
			if(sel == 1) {
				if (!(log < 0)) System.out.println("�̹� �α��� �����Դϴ�.");
				else {
					System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
					String inputID = scan.next();
					String inputPW = scan.next();
					for (int i = 0; i < 3; i++) {
						if (inputID.equals(ids[i]) && inputPW.equals(pws[i])) {
							log = i;
							System.out.println("�α��� �Ǿ����ϴ�.");
						}
					}
					if (log < 0) System.out.println("�α��� ������ ��ġ���� �ʽ��ϴ�.");
				}
			}
			
			//�α׾ƿ�
			else if(sel == 2) {
				if (log < 0) System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
				else {
					log = -1;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
				}
			}
			
			//����
			else if(sel == 3) {
				if (!(log < 0)) {
					for (int i = 0; i < items.length; i++) {
						System.out.println((i + 1) + "." + items[i]);
					}
					System.out.println("�������� �����ϼ���.");
					int input = scan.nextInt();
					
					bag[count][0] = log;
					bag[count++][1] = input;
					System.out.println("��ٱ��Ͽ� ��ҽ��ϴ�.");
				}
				else {
					System.out.println("�α��� ���ּ���.");
				}
			}
			
			//��ٱ���
			else if(sel == 4) {
				if (!(log < 0)) {
					System.out.println(ids[log] + "���� ��ٱ���");
					
					for (int i = 0; i < count; i++) {
						if (bag[i][0] == log) {
							if (bag[i][1] == 1) System.out.println("���");
							else if (bag[i][1] == 2)System.out.println("�ٳ���");
							else System.out.println("����");
						}
					}
				}
				else {
					System.out.println("�α��� ���ּ���.");
				}
			}
			
			//����
			else if(sel == 5) {
				String data = "";
				for (int i = 0; i < count; i++) {
					data = data + bag[i][0] + "/" + bag[i][1] + "\n";
				}
				
				FileWriter fw = null;
				try {
					fw = new FileWriter(filename);
					fw.write(data);
					fw.close();
					System.out.println("�����͸� �����߽��ϴ�.");
				} catch(Exception e) {
					e.printStackTrace();
				}	
			}
			
			//�ε�
			else if(sel == 6) {
				String data = "";
				File file = new File(filename);
				if (file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						while(true) {
							String line = br.readLine();
							if (line == null) break;
							data += line;
							data += "\n";
						}
						String[] temp = data.split("\n");
						count = 0;
						for (int i = 0; i < temp.length; i++) {
							String[] temp2 = temp[i].split("/");
							bag[count][0] = Integer.valueOf(temp2[0]);
							bag[count++][1] = Integer.valueOf(temp2[1]);
						}
						System.out.println("�ε��߽��ϴ�.");
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
