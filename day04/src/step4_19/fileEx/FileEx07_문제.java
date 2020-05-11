package step4_19.fileEx;

import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

//# ���� ��Ʈ�ѷ�[2�ܰ�] : ATM

public class FileEx07_���� {

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
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա�");
			System.out.println("[6]���");
			System.out.println("[7]��ü");
			System.out.println("[8]�ܾ���ȸ");
			System.out.println("[9]����");
			System.out.println("[10]�ε�");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//ȸ�� ����
			if(sel == 1) {
				if (count == 5) {
					System.out.println("ȸ�� ����� ���� á���ϴ�.");
					continue;
				}
				else {
					System.out.println("ID �Է�");
					String inputID = scan.next();
					int ext = 0;
					for (int i = 0; i < count; i++) {
						if (inputID.equals(accs[i])) ext = 1;
					}
					if (ext == 1) {
						System.out.println("�̹� �����ϴ� ID�Դϴ�.");
						continue;
					}
					else {
						System.out.println("PW �Է�");
						String inputPW = scan.next();
						accs[count] = inputID;
						pws[count] = inputPW;
						moneys[count++] = 0;
						System.out.println("���̵� �����Ǿ����ϴ�.");
					}
				}
			}
			
			//ȸ�� Ż��
			else if(sel == 2) {
				if (log < 0) {
					System.out.println("�α��� ���°� �ƴմϴ�.");
					continue;
				}
				System.out.println("���� ȸ��Ż�� �Ͻðڽ��ϱ�? Y(1) / N(0)");
				int brk = scan.nextInt();
				if (brk == 0) System.out.println("��ҵǾ����ϴ�.");
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
					System.out.println("ȸ�� Ż�� �Ǿ����ϴ�.");
				}
			}
			
			//�α���
			else if(sel == 3) {
				if (log > 0) {
					System.out.println("�̹� �α��� �����Դϴ�.");
					continue;
				}
				System.out.println("�α����� ���̵�� ��й�ȣ�� �Է����ּ���.");
				String inputID = scan.next();
				String inputPW = scan.next();
				
				for (int i = 0; i < count; i++) {
					if (inputID.contentEquals(accs[i]) && inputPW.equals(pws[i])) {
						log = i;
					}
				}
				if (log < 0) System.out.println("���������� �߸��Ǿ����ϴ�.");
				else System.out.println("�α��� �Ǿ����ϴ�.");
			}
			
			//�α׾ƿ�
			else if(sel == 4) {
				if (log < 0) {
					System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
					continue;
				}
				log = -1;
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			}
			
			//�Ա�
			else if(sel == 5) {
				if (log < 0) {
					System.out.println("�α��� ���ּ���.");
					continue;
				}
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
				int inputmy = scan.nextInt();
				moneys[log] += inputmy;
				System.out.println("�ԱݵǾ����ϴ�. ���� �ܾ� : " + moneys[log]);		
			}
			
			//���
			else if(sel == 6) {
				if (log < 0) {
					System.out.println("�α��� ���ּ���.");
					continue;
				}
				System.out.println("����� �ݾ��� �Է��ϼ���.");
				int inputmy = scan.nextInt();
				if (moneys[log] < inputmy) System.out.println("�ܾ��� �����մϴ�.");
				else {
					moneys[log] -= inputmy;
					System.out.println("��ݵǾ����ϴ�.");
				}
			}
			
			//��ü
			else if(sel == 7) {
				if (log < 0) {
					System.out.println("�α��� ���ּ���.");
					continue;
				}
				System.out.println("������ ID�� �Է����ּ���.");
				String inputID = scan.next();
				int ext = -1;
				for (int i = 0; i < count; i++) {
					if (inputID.equals(accs[i])) ext = i;
				}
				if (ext == -1) System.out.println("��ġ�ϴ� ID�� �����ϴ�.");
				else {
					System.out.println("��ü�� �ݾ��� �Է��ϼ���.");
					int inputmy = scan.nextInt();
					if (inputmy > moneys[log]) System.out.println("�ܾ��� �����մϴ�.");
					else {
						moneys[log] -= inputmy;
						moneys[ext] += inputmy;
						System.out.println("��ü�� �Ϸ��߽��ϴ�. ���� �ܾ� : " + moneys[log] 
								+ " ����ܾ� : " + moneys[ext]);
					}
				}
			}
			
			//�ܾ���ȸ
			else if(sel == 8) {
				if (log < 0) System.out.println("�α��� ���ּ���.");
				else {
					System.out.println("���� �ܾ��� " + moneys[log] + "�� �Դϴ�.");
				}
			}
			
			//����
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
					System.out.println("������ �����߽��ϴ�.");
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//�ε�
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
						System.out.println("�ε��Ͽ����ϴ�.");
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
