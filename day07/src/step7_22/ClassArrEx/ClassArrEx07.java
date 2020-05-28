package step7_22.ClassArrEx;

class Book{
	String title;
	String author;
	int price;
	
	//�⺻ ������
	Book(){}
	
	//������ �����ε�
	Book(String title, int price){
		//������ ȣ��
		this(title, "���ڹ̻�", price);
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title + " : " + author + " (" + price + "��)");
	}
}

public class ClassArrEx07 {

	public static void main(String[] args) {
		Book b1 = new Book("�ڹ�", "��ö��", 10000);
		b1.showInfo();
		
		Book b2 = new Book("������", 9000);
		b2.showInfo();

	}
}
