package step8_29.GenericEx;

/*
 * Generic
 * 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
 * 클래스 정의시 데이터 타입을 정해줘야 하는데 타입을 확정하지 않고 인스턴스 생성시
 * 데이터 타입을 지정해주는 방법
 */

/*
 * Object타입 필드
 * 모든 자바 객체의 최상위 조상 클래스
 */

class MyVector<T> {
	private Object arr[] = null;
	private int count = 0;
	
	void add(T data) {
		if (count == 0) {
			arr = new Object[1];
		}
		else {
			Object[] temp = arr;
			arr = new Object[count + 1];
			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[count] = data;
		count += 1;
	}
	
	int size() {
		return count;
	}
	
	T get(int index) {
		return (T)arr[index];
	}
}

class User {
	String name;
	void print_name() {
		System.out.println(name);
	}
}

public class GenericEx01 {

	public static void main(String[] args) {
		
		MyVector<User> vec = new MyVector<>();
		User temp = new User();
		temp.name = "철수";
		vec.add(temp);
		temp = new User();
		temp.name = "민수";
		vec.add(temp);
		for (int i = 0; i < vec.size(); i++) {
			vec.get(i).print_name();
		}
	}
}
