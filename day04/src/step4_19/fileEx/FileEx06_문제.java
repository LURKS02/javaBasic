package step4_19.fileEx;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

// 파일 컨트롤러[1단계] : 벡터

public class FileEx06_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vector = null;
		int count = 0;
		
		String filename = "vector.txt";
		
		while(true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
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
				System.out.println("추가할 데이터 입력");
				int data = scan.nextInt();
				vector[count++] = data;
				System.out.println("데이터를 추가하였습니다.");
			}
			
			else if(sel == 2) {
				System.out.println("삭제할 데이터 입력");
				int del = scan.nextInt();
				if (del > count - 1 || del < 0) System.out.println("삭제할 수 없는 위치입니다.");
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
					System.out.println("삭제하였습니다.");
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
				else System.out.println("저장할 데이터가 없습니다.");
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
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
