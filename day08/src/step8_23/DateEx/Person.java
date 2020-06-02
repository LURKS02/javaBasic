package step8_23.DateEx;

import java.util.Date;

/*
 * Value Object : 한 건의 데이터와 데이터를 처리할 메소드가 정의된 클래스
 * bean : 최소 작업 단위. 처리할 데이터를 기억할 기억 장소
 * 		   멤버 변수, 필드와 기억장소에 데이터를 입출력할 수 있는 getters & setters 메소드로만 구성된 클래스
 */

public class Person {
	/*
	 * 멤버변수 정의
	 * 멤버변수를 선언할 때 =를 이용해 초기화
	 * 초기화시키지 않을 경우
	 * 숫자는 0, boolean은 false, 객체는 null로 자동 초기화
	 * 
	 * 멤버변수의 종류는 정적(static)멤버변수와 인스턴스 멤버변수가 있음
	 * 정적 멤버변수는 현재 클래스로 생성한 모든 객체에서 공유해 사용
	 * 인스턴스 멤버변수는 현재 클래스로 생성한 모든 객체에서 독립된 기억 공간을 지님
	 * 정적 멤버변수는 객체를 생성하지 않고 접근 가능
	 */
	
	//접근 권한 지정자 [static] 자료형 변수명 [= 초기화]
	public static int count; //정적 멤버변수
	private int no;
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate;
	
	/*
	 * 생성자
	 * 생성자 메소드 정의
	 * 생성자 이름은 반드시 클래스 이름과 동일해야함
	 * 생성자는 객체가 생성되는 순간 자동으로 실행 (멤버 변수의 초기화)
	 * 생성자를 정의하지 않으면 기본 생성자가 자동으로 만들어짐
	 * 생성자를 정의하면 기본 생성자는 만들어지지 않음
	 * 생성자는 return 타입을 가지지 않고, return도 사용하지 않는다.
	 */
	
	public Person() {
		//현재 클래스의 다른 생성자를 호출
		this("무명씨", true, "없음");
	}
	
	public Person(String name, boolean gender, String memo) {
		
		/*
		 * super()와 this()는 반드시 생성자의 첫 문장에 사용 (동시X)
		 * super() : 부모 클래스의 생성자
		 * this() : 현재 클래스의 다른 생성자
		 * super : 부모 클래스
		 * this : 현재 클래스
		 */
		
		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}
	
	//getters & setters 메소드 정의
	//private 권한이 설정된 멤버에 저장된 값을 사용
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Date getWriteDate() {
		return writeDate;
	}
	
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
}

