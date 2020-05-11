package step4_19.fileEx;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

// ���� ��Ʈ�ѷ�[1�ܰ�] : ����

public class FileEx06_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vector = null;
		int count = 0;
		
		String filename = "vector.txt";
		
		while(true) {
			
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (count == 0) {
					vector = new int[count + 1];
				}
				else {
					int[]temp = vector;
					vector = new int[count + 1];
					
					for (int i = 0; i < count; i++) {
						vector[i] = temp[i];
					}
					temp = null;
				}
				System.out.println("�߰��� ������ �Է�");
				int data = scan.nextInt();
				vector[count++] = data;
				System.out.println("�����͸� �߰��Ͽ����ϴ�.");
			}
			
			else if(sel == 2) {
				System.out.println("������ ������ �Է�");
				int del = scan.nextInt();
				if (del > count - 1 || del < 0) System.out.println("������ �� ���� ��ġ�Դϴ�.");
				else {
					if (count == 1) vector = null;
					else {
						int[]temp = vector;
						vector = new int[count - 1];
						
						int j = 0;
						for (int i = 0; i < count; i++) {
							if (i != del) vector[j++] = temp[i];
						}
						temp = null;
					}
					count--;
					System.out.println("�����Ͽ����ϴ�.");
				}		
			}
			
			else if(sel == 3) {
				String data = "";
				if (count > 0) {
					for (int i = 0; i < count; i++) {
						data = data + vector[i] + "\n";
					}
					data = data.substring(0,data.length() - 1);
					
					FileWriter fw = null;
					try {
						fw = new FileWriter(filename);
						fw.write(data);
						fw.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				else System.out.println("������ �����Ͱ� �����ϴ�.");
			}
			
			else if(sel == 4) {
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
						data = data.substring(0, data.length() - 1);
						
						String[] temp = data.split("\n");
						vector = new int[temp.length];
						
						for (int i = 0; i < temp.length; i++) {
							vector[i] = Integer.parseInt(temp[i]);
						}
						count = vector.length;
						fr.close();
						br.close();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			else if(sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
