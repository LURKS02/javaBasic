package step8_24.ExtendsEx;

class Test1 {
	
}

class Test2 {
	int a;
	int b;
	public String toString() {
		a = 10;
		b = 20;
		return "" + a + b;
	}
}

public class ExtendsEx02 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		System.out.println(t1);
		Test2 t2 = new Test2();
		System.out.println(t2); 	//toString()은 주소 대신 return값 출력

	}

}
