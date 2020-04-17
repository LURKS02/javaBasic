package step2_11.arrayEx;

import java.util.Scanner;

//ATM[3단계]

public class ArrayEx20_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		while(true) {
			
			for (int i = 0; i < cnt; i++) {
				System.out.println("acc = " + accs[i] + " pw = " + pws[i]);
			}
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				if(cnt == 5) {
					System.out.println("더 이상 계정을 생성할 수 없습니다.");
					continue;
				}
				
				System.out.println("가입할 계좌번호를 입력하세요.");
				int newacc = scan.nextInt();
				int ext = -1;
				for(int i = 0; i < cnt; i++) {
					if (newacc == accs[i]) {
						System.out.println("이미 존재하는 계좌번호입니다.");
						ext = 1;
					}
				}
				if (ext == 1) continue;
				
				accs[cnt] = newacc;
				System.out.println("비밀번호를 입력하세요.");
				int newpw = scan.nextInt();
				pws[cnt++] = newpw;
				System.out.println("계정이 생성되었습니다.");
			}
			
			else if(sel == 2) {
				if(cnt == 0) {
					System.out.println("계좌 목록이 비었습니다.");
					continue;
				}
				
				System.out.println("삭제할 계좌번호를 입력하세요.");
				int delacc = scan.nextInt();
				int delindex = -1;
				for (int i = 0; i < cnt; i++) {
					if (delacc == accs[i]) delindex = i;
				}
				if(delindex == -1) {
					System.out.println("삭제할 계좌가 존재하지 않습니다.");
					continue;
				}
				for (int i = delindex; i < cnt; i++) {
					if(i == cnt - 1) {
						accs[i] = 0;
						pws[i] = 0;
					}
					else {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
					}
				}
				cnt--;
				System.out.println("삭제 되었습니다.");
			}
		}

	}

}
