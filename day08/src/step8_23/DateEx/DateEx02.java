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
		 * Calendar = �߻� Ŭ����
		 * ��ü�� ���� ���� (������ ��ü ȣ��) ���� ���ϰ�
		 * �߻� Ŭ���� ���� �ִ� getInstance()�޼��带 ���ؼ��� ��ü�� ���Ϲ��� �� ����
		 */
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		MyCalendar c = MyCalendar.getInstance();

	}
}
