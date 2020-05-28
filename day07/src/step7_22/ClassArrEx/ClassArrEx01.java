package step7_22.ClassArrEx;

class Product {
	String name;
	int price;
}

public class ClassArrEx01 {

	public static void main(String[] args) {
		
		Product pr = new Product();
		pr.name = "引切";
		pr.price = 1000;
		
		//壕伸
		Product[] arr = new Product[3];
		arr[0] = new Product();
		arr[1] = new Product();
		arr[2] = new Product();
		
		arr[0].price = 10;
		arr[1].price = 20;
		arr[2].price = 30;
		
		arr[0].name = "引切1";
		arr[1].name = "引切2";
		arr[2].name = "引切3";
		System.out.println(arr[1].name);

		Product temp = arr[1];
		System.out.println(temp.name);
		
	}

}
