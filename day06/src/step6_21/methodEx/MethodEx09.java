package step6_21.methodEx;

//계산기 프로그램

class Ex09{
	long add(long x, long y) {
		long result = x + y;
		return result;
	}
	long sub(long x, long y) {
		return x - y;
	}
	long mul(long x, long y) {
		return x * y;
	}
	double div(long x, long y) {
		return x / (double)y;
	}
	
	void showinfo(long x, long y) {
		System.out.printf("%d + %d = %d\n", x, y, add(x, y));
		System.out.printf("%d - %d = %d\n", x, y, sub(x, y));
		System.out.printf("%d * %d = %d\n", x, y, mul(x, y));
		if (y != 0) System.out.printf("%d / %d = %.1f\n", x, y, div(x, y));
		else System.out.println("오류 : 0으로 나눌수 없습니다.");
	}
}

public class MethodEx09 {

	public static void main(String[] args) {
		
		Ex09 e = new Ex09();
		
		long r1 = e.add(5L, 3L);
		long r2 = e.sub(5L, 3L);
		long r3 = e.mul(5L, 3L);
		double r4 = e.div(5L, 3L);
		
		e.showinfo(5L,3L);
	}
}
