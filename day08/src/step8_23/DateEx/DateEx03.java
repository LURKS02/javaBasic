package step8_23.DateEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx03 {

	public static void main(String[] args) {
		
		/*
		 * Date 클래스 활용
		 * Date 클래스 객체에서 년 / 월 / 일 / 시 / 분 / 초를 얻어오려면
		 * get으로 시작하는 메서드 사용
		 * 수정하려면 set으로 시작하는 메서드 사용
		 * 
		 * Date 클래스는 1900년 기준으로 날짜 처리
		 * 년을 얻어오려면 1900을 더하고, 넣을때는 1900을 빼야함
		 * 월을 얻어오려면 1을 더해야하고, 넣을 때는 1을 빼야함
		 */
		
		Date date = new Date();
		System.out.println("년 : " + (date.getYear() + 1900));
		System.out.println("월 : " + (date.getMonth() + 1));
		System.out.println("일 : " + date.getDate());
		
		System.out.println("요일 : " + date.getDay());
		//일요일 - 0, 월요일 - 1 ... 토요일 - 6
		
		System.out.println("시 : " + date.getHours());
		System.out.println("분 : " + date.getMinutes());
		System.out.println("초 : " + date.getSeconds());
		
		/*
		 * Calendar 클래스는 객체를 만들어 사용할 수 없음
		 * 클래스 내부에 자신의 클래스로 만든 객체를 지니며
		 * 내부에 가지고있는 클래스 객체를 얻어오는 메소드가 따로 존재함
		 */
		
		//Calendar calendar = new Calendar();
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		/*
		 * Calendar 클래스 객체는 많은 정보를 지니므로
		 * SimpleDateFormat 클래스 객체를 이용해 서식을 지정하려면
		 * 메소드로 정보를 얻어온 후 적용시켜야 함
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println("년 : " + calendar.get(Calendar.YEAR));
		System.out.println("월 : " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("일 : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("일 : " + calendar.get(Calendar.DATE));
		
		//일요일 - 1, 월요일 - 2 ...
		System.out.println("요일 : " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("시 : " + calendar.get(Calendar.HOUR)); //12시간
		System.out.println("시 : " + calendar.get(Calendar.HOUR_OF_DAY)); //24시간
		System.out.println("분 : " + calendar.get(Calendar.MINUTE));
		System.out.println("초 : " + calendar.get(Calendar.SECOND));
		System.out.println("1/1000초 : " + calendar.get(Calendar.MILLISECOND));

	}

}
