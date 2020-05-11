package step4_19.fileEx;

import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx07_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int count = 0;
		int log = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String filename = "atm.txt";
		
		while(true) {
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//회원 가입
			if(sel == 1) {
				if (count == 5) {
					System.out.println("회원 목록이 가득 찼습니다.");
					continue;
				}
				else {
					System.out.println("ID 입력");
					String inputID = scan.next();
					int ext = 0;
					for (int i = 0; i < count; i++) {
						if (inputID.equals(accs[i])) ext = 1;
					}
					if (ext == 1) {
						System.out.println("이미 존재하는 ID입니다.");
						continue;
					}
					else {
						System.out.println("PW 입력");
						String inputPW = scan.next();
						accs[count] = inputID;
						pws[count] = inputPW;
						moneys[count++] = 0;
						System.out.println("아이디가 생성되었습니다.");
					}
				}
			}
			
			//회원 탈퇴
			else if(sel == 2) {
				if (log < 0) {
					System.out.println("로그인 상태가 아닙니다.");
					continue;
				}
				System.out.println("정말 회원탈퇴 하시겠습니까? Y(1) / N(0)");
				int brk = scan.nextInt();
				if (brk == 0) System.out.println("취소되었습니다.");
				else if (brk == 1) {
					for (int i = log; i < count; i++) {
						if (i == count - 1) {
							accs[i] = "";
							pws[i] = "";
							moneys[i] = 0;
						}
						else {
							accs[i] = accs[i + 1];
							pws[i] = pws[i + 1];
							moneys[i] = moneys[i + 1];
						}
					}
					count--;
					log = -1;
					System.out.println("회원 탈퇴 되었습니다.");
				}
			}
			
			//로그인
			else if(sel == 3) {
				if (log > 0) {
					System.out.println("이미 로그인 상태입니다.");
					continue;
				}
				System.out.println("로그인할 아이디와 비밀번호를 입력해주세요.");
				String inputID = scan.next();
				String inputPW = scan.next();
				
				for (int i = 0; i < count; i++) {
					if (inputID.contentEquals(accs[i]) && inputPW.equals(pws[i])) {
						log = i;
					}
				}
				if (log < 0) System.out.println("계정정보가 잘못되었습니다.");
				else System.out.println("로그인 되었습니다.");
			}
			
			//로그아웃
			else if(sel == 4) {
				if (log < 0) {
					System.out.println("이미 로그아웃 상태입니다.");
					continue;
				}
				log = -1;
				System.out.println("로그아웃 되었습니다.");
			}
			
			//입금
			else if(sel == 5) {
				if (log < 0) {
					System.out.println("로그인 해주세요.");
					continue;
				}
				System.out.println("입금할 금액을 입력하세요.");
				int inputmy = scan.nextInt();
				moneys[log] += inputmy;
				System.out.println("입금되었습니다. 현재 잔액 : " + moneys[log]);		
			}
			
			//출금
			else if(sel == 6) {
				if (log < 0) {
					System.out.println("로그인 해주세요.");
					continue;
				}
				System.out.println("출금할 금액을 입력하세요.");
				int inputmy = scan.nextInt();
				if (moneys[log] < inputmy) System.out.println("잔액이 부족합니다.");
				else {
					moneys[log] -= inputmy;
					System.out.println("출금되었습니다.");
				}
			}
			
			//이체
			else if(sel == 7) {
				if (log < 0) {
					System.out.println("로그인 해주세요.");
					continue;
				}
				System.out.println("이제할 ID를 입력해주세요.");
				String inputID = scan.next();
				int ext = -1;
				for (int i = 0; i < count; i++) {
					if (inputID.equals(accs[i])) ext = i;
				}
				if (ext == -1) System.out.println("일치하는 ID가 없습니다.");
				else {
					System.out.println("이체할 금액을 입력하세요.");
					int inputmy = scan.nextInt();
					if (inputmy > moneys[log]) System.out.println("잔액이 부족합니다.");
					else {
						moneys[log] -= inputmy;
						moneys[ext] += inputmy;
						System.out.println("이체를 완료했습니다. 현재 잔액 : " + moneys[log] 
								+ " 상대잔액 : " + moneys[ext]);
					}
				}
			}
			
			//잔액조회
			else if(sel == 8) {
				if (log < 0) System.out.println("로그인 해주세요.");
				else {
					System.out.println("현재 잔액은 " + moneys[log] + "원 입니다.");
				}
			}
			
			//저장
			else if(sel == 9) {
				String data = "";
				for (int i = 0; i < count; i++) {
					data = data + accs[i] + "/" + pws[i] + "/" + moneys[i] + "\n";
				}
				data = data.substring(0, data.length() - 1);
				
				FileWriter fw = null;
				try {
					fw = new FileWriter(filename);
					fw.write(data);
					fw.close();
					System.out.println("파일을 저장했습니다.");
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//로드
			else if(sel == 10) {
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
						
						String[] new_accs = new String[size];
						String[] new_pws = new String[size];
						int[] new_moneys = new int[size];
						count = 0;
						
						for (int i = 0; i < temp.length; i++) {
							String[] temp2 = temp[i].split("/");
							new_accs[count] = temp2[0];
							new_pws[count] = temp2[1];
							new_moneys[count++] = Integer.parseInt(temp2[2]);
						}
						accs = new_accs;
						pws = new_pws;
						moneys = new_moneys;
						System.out.println("로드하였습니다.");
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			else if(sel == 0) {
				break;
			}	
		}
	}
}
