package step8_30.ThreadEx;

//���� ���μ������� ������ ������� ������� ����Ǵ� ���� ó��

class BGMplay extends Thread {
	boolean play = true;
	@Override
	public void run() {
		while(play) {
			System.out.println("������� ����");
			
			//sleep() : �־��� �ð����� �Ͻ����� ����
			try {Thread.sleep(500);} //0.5��
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		
		BGMplay bgmplay = new BGMplay();
		
		//Thread ������ �����Ϸ��� start()�޼ҵ带 ȣ���ؾ� ��
		bgmplay.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("������");
			if (i == 8) {
				System.out.println("�극��ũ : ���� ����");
				bgmplay.play = false;
				break;
			}
		}
		try {Thread.sleep(500);}
		catch (InterruptedException e) {e.printStackTrace();}

	}

}
