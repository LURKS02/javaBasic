package step1_10.whileEx;

import java.util.Scanner;

public class WhileEx16_���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int HP = 100;
		int ���ݷ� = 5;
		
		System.out.println("���� ����");
		System.out.println("�г����� �����ϼ���.");
		
		int name = scan.nextInt();
		System.out.println(name + "�� ȯ���մϴ�.");
		System.out.println();
		System.out.println("���� ����");
		
		int start = 0;
		int place = 0;
		int place2 = 0;
		int money = 200;
		int ���ݷ�2 = 1;
		
		while(start == 0) {
			System.out.println("�̵��� ��Ҹ� �����ϼ���.");
			System.out.printf("1.����\n2.����\n3.����\n");
			
			place = scan.nextInt();
			if (place < 1 || place > 3) System.out.println("��� ����");
			else {
				
				
				if (place == 1) {
					if (place2 == 1) System.out.printf("�̹� ������ �ֽ��ϴ�.\n\n");
					else {
						System.out.println("������ �̵��մϴ�.");
						place2 = 1;
						
						while (true) {
							System.out.println();
							System.out.println("������ �Ͻðڽ��ϱ�?");
							System.out.printf("1.ü�� ȸ��\n2.�ٸ� ������ �̵�\n");
						
							int village = scan.nextInt();
							if (village == 1) {
								if (HP == 100) System.out.printf("�̹� ü���� ���� á���ϴ�.\n\n");
								else {
									System.out.println("ü���� ȸ���մϴ�. ���� ü�� : " + HP);
									HP = 100;
									System.out.println("");
									System.out.println("ü���� ȸ���Ǿ����ϴ�.");
								}
							}
							else if (village == 2) break;
							else System.out.println("������ ����");
						}
					}
				}
				
				
				else if (place == 2) {
					if (place2 == 2) System.out.printf("�̹� ������ �ֽ��ϴ�.\n\n");
					else {
						place2 = 2;
						System.out.println("�������� �̵��մϴ�.");
						
						while(true) {
							System.out.println("������ �Ͻðڽ��ϱ�?");
							System.out.printf("1.���� ��ȭ\n2.�ٸ� ������ �̵�\n");
							int store = scan.nextInt();
							if (store == 1) {
								while(true) {
									System.out.println("1.��ȭ �ϱ� (�ʿ� ��� = " + ���ݷ�2*50 + ")");
									System.out.println("2.�ڷ� ����");
									int choice = scan.nextInt();
									if (choice == 1) {
										if(���ݷ�2 * 50 > money) System.out.println("���� �����մϴ�.");
										else {
											money -= ���ݷ�2*50;
											���ݷ� += 10;
											���ݷ�2++;
											System.out.println("���Ⱑ ��ȭ�Ǿ����ϴ�.");
											System.out.println("���ݷ� : " + ���ݷ� + ", ��ȭ��ġ : " + ���ݷ�2);
											System.out.println("���� �� : " + money);
											
										}
									}
									else if (choice == 2) break;
									else System.out.println("������ ����");
								}
							}
							else if (store == 2) break;
							else System.out.println("������ ����");
						}
					}
				}
				
				else if (place == 3) {
					if (place2 == 3) System.out.printf("�̹� ������ �ֽ��ϴ�.\n\n");
					else {
						place2 = 3;
						System.out.println("�������� �̵��մϴ�.");
						
						while(true) {
							System.out.println("������ �Ͻðڽ��ϱ�?");
							System.out.println("1.���� ���\n2.�ٸ� ������ �̵�\n");
							int fight = scan.nextInt();
							if (fight == 1) {
								int enemyHP = 100;
								while(enemyHP > 0) {
									enemyHP = enemyHP - ���ݷ�;
									HP -= 3;
									if (HP <= 0) {
										HP = 0;
										System.out.println("HP = 0");
										System.out.println("���� ����!");
										break;
									}
									
									System.out.println("������ ü���� " + enemyHP + " ���ҽ��ϴ�.");
									System.out.println("�÷��̾��� ü���� " + HP + " ���ҽ��ϴ�.");
									System.out.println();
								}
								if (HP == 0) break;
								
								System.out.println("���� óġ! 50��� ȹ��");
								money += 50;
								System.out.println("���� ��� : " + money);
							}
							else if (fight == 2) break;
							else System.out.println("������ ����");
						}
					}
				}
				
			}
		}

	}

}
