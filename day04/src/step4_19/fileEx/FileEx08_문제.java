package step4_19.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

//# 파일 컨트롤러[3단계] : 장바구니

public class FileEx08_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",   "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		
		final int MAX_SIZE = 100;
		int[][] bag = new int[MAX_SIZE][2];

		String filename = "bag.txt";
		
		int count = 0;
		int log = -1;
		
		while(true) {
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//로그인
			if(sel == 1) {
				if (!(log < 0)) System.out.println("이미 로그인 상태입니다.");
				else {
					System.out.println("아이디와 비밀번호를 입력해주세요.");
					String inputID = scan.next();
					String inputPW = scan.next();
					for (int i = 0; i < 3; i++) {
						if (inputID.equals(ids[i]) && inputPW.equals(pws[i])) {
							log = i;
							System.out.println("로그인 되었습니다.");
						}
					}
					if (log < 0) System.out.println("로그인 정보가 일치하지 않습니다.");
				}
			}
			
			//로그아웃
			else if(sel == 2) {
				if (log < 0) System.out.println("이미 로그아웃 상태입니다.");
				else {
					log = -1;
					System.out.println("로그아웃 되었습니다.");
				}
			}
			
			//쇼핑
			else if(sel == 3) {
				if (!(log < 0)) {
					for (int i = 0; i < items.length; i++) {
						System.out.println((i + 1) + "." + items[i]);
					}
					System.out.println("아이템을 선택하세요.");
					int input = scan.nextInt();
					
					bag[count][0] = log;
					bag[count++][1] = input;
					System.out.println("장바구니에 담았습니다.");
				}
				else {
					System.out.println("로그인 해주세요.");
				}
			}
			
			//장바구니
			else if(sel == 4) {
				if (!(log < 0)) {
					System.out.println(ids[log] + "님의 장바구니");
					
					for (int i = 0; i < count; i++) {
						if (bag[i][0] == log) {
							if (bag[i][1] == 1) System.out.println("사과");
							else if (bag[i][1] == 2)System.out.println("바나나");
							else System.out.println("딸기");
						}
					}
				}
				else {
					System.out.println("로그인 해주세요.");
				}
			}
			
			//저장
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
					System.out.println("데이터를 저장했습니다.");
				} catch(Exception e) {
					e.printStackTrace();
				}	
			}
			
			//로드
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
						System.out.println("로드했습니다.");
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
