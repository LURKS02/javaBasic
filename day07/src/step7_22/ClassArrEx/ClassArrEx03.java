package step7_22.ClassArrEx;

class Client{
	String name;
	int score;
	
	//���ڸ� �����ϴ� ����
	void set_data(String s, int n) {
		this.name = s;
		this.score = n;
	}
	void print_data() {
		System.out.println(this.name + " : " + this.score);
	}
}

public class ClassArrEx03 {

	public static void main(String[] args) {
		
		Client[] st = new Client[3];
		for (int i = 0; i < st.length; i++) st[i] = new Client();
		
		st[0].set_data("��ö��",100);
		st[1].set_data("�̸���",20);
		st[2].set_data("�ڿ���",70);
		
		for (int i = 0; 9 < st.length; i++) st[i].print_data();
	}
}
