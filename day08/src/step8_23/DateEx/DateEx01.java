package step8_23.DateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {
	public static void main(String[] args) {
		
		//현재 컴퓨터 시스템의 날짜와 시간
		Date date = new Date();
		System.out.println(date);

		/*
		 * 날짜 및 시간 서식에 사용되는 영문자를 제외한 나머지 문자는 그대로 출력
		 * Date date = new Date();
		 * SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식");
		 * 
		 * 적용 방법
		 * sdf.format(date);
		 * 
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(sdf1.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
		System.out.println(sdf2.format(date));
		
		/*
		 * System.currentTimeMillis();
		 * 1970년 1월 1일 자정부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초 단위로 얻어옴
		 * 13자리 숫자를 얻어오기 때문에 int로 처리하면 에러, long으로 처리해야함
		 */
		
		//int time = System.currentTimeMillis(); //에러 발생
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(sdf2.format(time));
		
	}

}
