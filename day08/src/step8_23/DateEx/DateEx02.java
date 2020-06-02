package step8_23.DateEx;

import java.util.Calendar;
import java.util.Date;

class MyCalendar{
	static MyCalendar a = new MyCalendar();
	static public MyCalendar getInstance() {
		return a;
	}
}

public class DateEx02 {

	public static void main(String[] args) {
		
		/*
		 * Calendar = 추상 클래스
		 * 객체를 직접 생성 (생성자 자체 호출) 하지 못하고
		 * 추상 클래스 내에 있는 getInstance()메서드를 통해서만 객체를 리턴받을 수 있음
		 */
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		MyCalendar c = MyCalendar.getInstance();

	}
}
