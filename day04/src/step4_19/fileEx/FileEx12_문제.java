package step4_19.fileEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

//콘솔 게시판

public class FileEx12_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        String filename = "board.txt";

		String[][] board = null;
		int count = 0;				// 전체 게시글 수
		int pageSize = 5;			// 한 페이지에 보여줄 게시글 수
		int curPageNum = 1;			// 현재 페이지 번호
		int pageCount = 1;			// 전체 페이지 개수
		int startRow = 0;			// 현재 페이지의 게시글 시작 번호
		int endRow = 0;				// 현재 페이지의 게시글 마지막 번호
		
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
			
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");

			int choice = scan.nextInt();
			
			if(choice == 1) {
				if (curPageNum == 1) System.out.println("첫번째 페이지입니다.");
				else curPageNum--;
				
			}
			
			else if(choice == 2) {
				if (curPageNum == pageCount) System.out.println("마지막 페이지입니다.");
				else curPageNum++;
			}
			
			else if(choice == 3) {
				System.out.println("글 제목과 내용을 입력해주세요.");
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
				System.out.println("등록되었습니다.");
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
				System.out.println("삭제할 게시글 번호를 입력해주세요.");
				int boardnum = scan.nextInt();
				if (boardnum < 1 || boardnum > count) System.out.println("해당 번호가 없습니다.");
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
					System.out.println("게시물이 없습니다.");
				}
				else {
					System.out.println("현재 페이지 : " + curPageNum);
					for (int i = startRow; i < endRow + 1; i++) {
						System.out.println("제목 : " + board[i][0]);
						System.out.println("내용 : " + board[i][1]);
					}
				}
			}
		}
	}
}
