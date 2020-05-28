package step7_22.ClassArrEx;

class Book{
	String title;
	String author;
	int price;
	
	//기본 생성자
	Book(){}
	
	//생성자 오버로딩
	Book(String title, int price){
		//생성자 호출
		this(title, "작자미상", price);
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title + " : " + author + " (" + price + "원)");
	}
}

public class ClassArrEx07 {

	public static void main(String[] args) {
		Book b1 = new Book("자바", "김철수", 10000);
		b1.showInfo();
		
		Book b2 = new Book("춘향전", 9000);
		b2.showInfo();

	}
}
