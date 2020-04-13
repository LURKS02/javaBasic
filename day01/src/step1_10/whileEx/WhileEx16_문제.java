package step1_10.whileEx;

import java.util.Scanner;

public class WhileEx16_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int HP = 100;
		int 공격력 = 5;
		
		System.out.println("던전 게임");
		System.out.println("닉네임을 설정하세요.");
		
		int name = scan.nextInt();
		System.out.println(name + "님 환영합니다.");
		System.out.println();
		System.out.println("게임 시작");
		
		int start = 0;
		int place = 0;
		int place2 = 0;
		int money = 200;
		int 공격력2 = 1;
		
		while(start == 0) {
			System.out.println("이동할 장소를 선택하세요.");
			System.out.printf("1.마을\n2.상점\n3.던전\n");
			
			place = scan.nextInt();
			if (place < 1 || place > 3) System.out.println("장소 에러");
			else {
				
				
				if (place == 1) {
					if (place2 == 1) System.out.printf("이미 마을에 있습니다.\n\n");
					else {
						System.out.println("마을로 이동합니다.");
						place2 = 1;
						
						while (true) {
							System.out.println();
							System.out.println("무엇을 하시겠습니까?");
							System.out.printf("1.체력 회복\n2.다른 곳으로 이동\n");
						
							int village = scan.nextInt();
							if (village == 1) {
								if (HP == 100) System.out.printf("이미 체력이 가득 찼습니다.\n\n");
								else {
									System.out.println("체력을 회복합니다. 현재 체력 : " + HP);
									HP = 100;
									System.out.println("");
									System.out.println("체력이 회복되었습니다.");
								}
							}
							else if (village == 2) break;
							else System.out.println("선택지 오류");
						}
					}
				}
				
				
				else if (place == 2) {
					if (place2 == 2) System.out.printf("이미 상점에 있습니다.\n\n");
					else {
						place2 = 2;
						System.out.println("상점으로 이동합니다.");
						
						while(true) {
							System.out.println("무엇을 하시겠습니까?");
							System.out.printf("1.무기 강화\n2.다른 곳으로 이동\n");
							int store = scan.nextInt();
							if (store == 1) {
								while(true) {
									System.out.println("1.강화 하기 (필요 골드 = " + 공격력2*50 + ")");
									System.out.println("2.뒤로 가기");
									int choice = scan.nextInt();
									if (choice == 1) {
										if(공격력2 * 50 > money) System.out.println("돈이 부족합니다.");
										else {
											money -= 공격력2*50;
											공격력 += 10;
											공격력2++;
											System.out.println("무기가 강화되었습니다.");
											System.out.println("공격력 : " + 공격력 + ", 강화수치 : " + 공격력2);
											System.out.println("남은 돈 : " + money);
											
										}
									}
									else if (choice == 2) break;
									else System.out.println("선택지 오류");
								}
							}
							else if (store == 2) break;
							else System.out.println("선택지 오류");
						}
					}
				}
				
				else if (place == 3) {
					if (place2 == 3) System.out.printf("이미 던전에 있습니다.\n\n");
					else {
						place2 = 3;
						System.out.println("던전으로 이동합니다.");
						
						while(true) {
							System.out.println("무엇을 하시겠습니까?");
							System.out.println("1.몬스터 잡기\n2.다른 곳으로 이동\n");
							int fight = scan.nextInt();
							if (fight == 1) {
								int enemyHP = 100;
								while(enemyHP > 0) {
									enemyHP = enemyHP - 공격력;
									HP -= 3;
									if (HP <= 0) {
										HP = 0;
										System.out.println("HP = 0");
										System.out.println("게임 오버!");
										break;
									}
									
									System.out.println("몬스터의 체력은 " + enemyHP + " 남았습니다.");
									System.out.println("플레이어의 체력은 " + HP + " 남았습니다.");
									System.out.println();
								}
								if (HP == 0) break;
								
								System.out.println("몬스터 처치! 50골드 획득");
								money += 50;
								System.out.println("현재 골드 : " + money);
							}
							else if (fight == 2) break;
							else System.out.println("선택지 오류");
						}
					}
				}
				
			}
		}

	}

}
