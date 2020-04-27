package step3_13.arrayEx;

import java.util.Scanner;

// ATM[4단계] : 전체 기능구현

public class ArrayEx29_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int MAX = 5;
		
		int[] accID = new int[MAX];
		int[] accPW = new int[MAX];
		int[] accMY = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		while(true) {
			System.out.println("ATM : 1.회원가입  2.회원탈퇴  3.로그인  4.로그아웃\n"
					+ "5.입금  6.이체  7.잔액조회  8.종료"
					+ "\n현재 계정 : " + log);
			
			 int sel = scan.nextInt();
			 
			 if (sel == 1) {
				 if (count == 5) {
					 System.out.println("더 이상 아이디를 생성할 수 없습니다.");
					 continue;
				 }
				 System.out.println("회원가입을 진행합니다."
				 		+ "아이디와 비밀번호를 입력해주세요.");
				 int newID = scan.nextInt();
				 int newPW = scan.nextInt();
				 int isext = 0;
				 for (int i = 0; i < MAX; i++) if(newID == accID[i]) isext = 1;
				 if(isext == 1) {
					 System.out.println("이미 존재하는 아이디입니다. 가입 실패");
					 continue;
				 }
				 else {
					 accID[count] = newID;
					 accPW[count] = newPW;
					 System.out.println("가입 완료"
					 		+ "\n회원가입 이벤트 : 1000원 증정");
					 accMY[count] = 1000;
					 count++;
				 }
			 }
			 
			 else if (sel == 2) {
				 if (log < 0) {
					 System.out.println("로그인 상태가 아닙니다.");
					 continue;
				 }
				 System.out.println("정말 탈퇴하시겠습니까? 아이디 : " + accID[log]
						 + " (Yes - 1 / No - 0)");
				 int del = scan.nextInt();
				 if (del == 0) {
					 System.out.println("탈퇴 취소");
					 continue;
				 }
				 else {
					 for (int i = log; i < count; i++) {
						 if (i == 4) {
							 accID[i] = 0;
							 accPW[i] = 0;
							 accMY[i] = 0;
						 }
						 else {
							 accID[i] = accID[i + 1];
							 accPW[i] = accPW[i + 1];
							 accMY[i] = accMY[i + 1];
						 }
					 }
					 count--;
					 log = -1;
					 System.out.println("탈퇴 완료");
				 }
			 }
			 
			 else if (sel == 3) {
				 if (!(log < 0)) {
					 System.out.println("이미 로그인된 상태입니다.");
					 continue;
				 }
				 System.out.println("아이디와 비밀번호를 입력해주세요.");
				 int inputID = scan.nextInt();
				 int inputPW = scan.nextInt();
				 for (int i = 0; i < MAX; i++) {
					 if (inputID == accID[i] && inputPW == accPW[i]) log = i;
				 }
				 if (!(log < 0)) {
					 System.out.println("로그인 되었습니다. 로그인 아이디 = " + accID[log]);
				 }
				 else System.out.println("로그인 실패");
			 }
			 
			 else if (sel == 4) {
				 if (log < 0) {
					 System.out.println("로그인된 상태가 아닙니다.");
					 continue;
				 }
				 log = -1;
				 System.out.println("로그아웃 되었습니다.");
			 }
			 
			 else if (sel == 5) {
				 System.out.println("입금할 금액을 입력해주세요.");
				 int myMY = scan.nextInt();
				 accMY[log] += myMY;
				 System.out.println("입금 완료. 현재 잔액 : " + accMY[log]);
			 }
			 
			 else if (sel == 6) {
				 if (log < 0) {
					 System.out.println("로그인이 필요합니다.");
					 continue;
				 }
				 System.out.println("입금 계좌와 금액을 입력하세요.");
				 int inputID = scan.nextInt();
				 int inputMY = scan.nextInt();
				 
				 int isexist = -1;
				 for (int i = 0; i < MAX; i++) {
					 if (inputID == accID[i]) isexist = i;
				 }
				 if (isexist == log) {
					 System.out.println("오류 : 자기 계좌");
				 }
				 else if (isexist == -1) {
					 System.out.println("일치하는 계좌가 없습니다.");
				 }
				 else if (accMY[log] < inputMY) {
					 System.out.println("잔액이 부족합니다.");
					 continue;
				 }
				 else {
					 accMY[log] -= inputMY;
					 accMY[isexist] += inputMY;
					 System.out.println("입금되었습니다. 현재잔액 : " + accMY[log]);
				 }
			 }
			
			 else if (sel == 7) {
				 System.out.println("현재 " + accID[log] + " 계좌의 잔액은 " + accMY[log] + "원 입니다.");
			 }
			 else {
				 System.out.println("프로그램 종료");
				 break;
			 }	
		}
	}
}
