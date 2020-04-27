package step3_13.arrayEx;

import java.util.Scanner;

// ATM[4�ܰ�] : ��ü ��ɱ���

public class ArrayEx29_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int MAX = 5;
		
		int[] accID = new int[MAX];
		int[] accPW = new int[MAX];
		int[] accMY = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		while(true) {
			System.out.println("ATM : 1.ȸ������  2.ȸ��Ż��  3.�α���  4.�α׾ƿ�\n"
					+ "5.�Ա�  6.��ü  7.�ܾ���ȸ  8.����"
					+ "\n���� ���� : " + log);
			
			 int sel = scan.nextInt();
			 
			 if (sel == 1) {
				 if (count == 5) {
					 System.out.println("�� �̻� ���̵� ������ �� �����ϴ�.");
					 continue;
				 }
				 System.out.println("ȸ�������� �����մϴ�."
				 		+ "���̵�� ��й�ȣ�� �Է����ּ���.");
				 int newID = scan.nextInt();
				 int newPW = scan.nextInt();
				 int isext = 0;
				 for (int i = 0; i < MAX; i++) if(newID == accID[i]) isext = 1;
				 if(isext == 1) {
					 System.out.println("�̹� �����ϴ� ���̵��Դϴ�. ���� ����");
					 continue;
				 }
				 else {
					 accID[count] = newID;
					 accPW[count] = newPW;
					 System.out.println("���� �Ϸ�"
					 		+ "\nȸ������ �̺�Ʈ : 1000�� ����");
					 accMY[count] = 1000;
					 count++;
				 }
			 }
			 
			 else if (sel == 2) {
				 if (log < 0) {
					 System.out.println("�α��� ���°� �ƴմϴ�.");
					 continue;
				 }
				 System.out.println("���� Ż���Ͻðڽ��ϱ�? ���̵� : " + accID[log]
						 + " (Yes - 1 / No - 0)");
				 int del = scan.nextInt();
				 if (del == 0) {
					 System.out.println("Ż�� ���");
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
					 System.out.println("Ż�� �Ϸ�");
				 }
			 }
			 
			 else if (sel == 3) {
				 if (!(log < 0)) {
					 System.out.println("�̹� �α��ε� �����Դϴ�.");
					 continue;
				 }
				 System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
				 int inputID = scan.nextInt();
				 int inputPW = scan.nextInt();
				 for (int i = 0; i < MAX; i++) {
					 if (inputID == accID[i] && inputPW == accPW[i]) log = i;
				 }
				 if (!(log < 0)) {
					 System.out.println("�α��� �Ǿ����ϴ�. �α��� ���̵� = " + accID[log]);
				 }
				 else System.out.println("�α��� ����");
			 }
			 
			 else if (sel == 4) {
				 if (log < 0) {
					 System.out.println("�α��ε� ���°� �ƴմϴ�.");
					 continue;
				 }
				 log = -1;
				 System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			 }
			 
			 else if (sel == 5) {
				 System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
				 int myMY = scan.nextInt();
				 accMY[log] += myMY;
				 System.out.println("�Ա� �Ϸ�. ���� �ܾ� : " + accMY[log]);
			 }
			 
			 else if (sel == 6) {
				 if (log < 0) {
					 System.out.println("�α����� �ʿ��մϴ�.");
					 continue;
				 }
				 System.out.println("�Ա� ���¿� �ݾ��� �Է��ϼ���.");
				 int inputID = scan.nextInt();
				 int inputMY = scan.nextInt();
				 
				 int isexist = -1;
				 for (int i = 0; i < MAX; i++) {
					 if (inputID == accID[i]) isexist = i;
				 }
				 if (isexist == log) {
					 System.out.println("���� : �ڱ� ����");
				 }
				 else if (isexist == -1) {
					 System.out.println("��ġ�ϴ� ���°� �����ϴ�.");
				 }
				 else if (accMY[log] < inputMY) {
					 System.out.println("�ܾ��� �����մϴ�.");
					 continue;
				 }
				 else {
					 accMY[log] -= inputMY;
					 accMY[isexist] += inputMY;
					 System.out.println("�ԱݵǾ����ϴ�. �����ܾ� : " + accMY[log]);
				 }
			 }
			
			 else if (sel == 7) {
				 System.out.println("���� " + accID[log] + " ������ �ܾ��� " + accMY[log] + "�� �Դϴ�.");
			 }
			 else {
				 System.out.println("���α׷� ����");
				 break;
			 }	
		}
	}
}
