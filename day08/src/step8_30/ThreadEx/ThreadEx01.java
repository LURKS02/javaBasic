package step8_30.ThreadEx;

//메인 프로세스에서 독립된 스레드로 만들어져 실행되는 병렬 처리

class BGMplay extends Thread {
	boolean play = true;
	@Override
	public void run() {
		while(play) {
			System.out.println("배경음악 연주");
			
			//sleep() : 주어진 시간동안 일시정지 상태
			try {Thread.sleep(500);} //0.5초
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		
		BGMplay bgmplay = new BGMplay();
		
		//Thread 실행을 시작하려면 start()메소드를 호출해야 함
		bgmplay.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("게임중");
			if (i == 8) {
				System.out.println("브레이크 : 게임 종료");
				bgmplay.play = false;
				break;
			}
		}
		try {Thread.sleep(500);}
		catch (InterruptedException e) {e.printStackTrace();}

	}

}
