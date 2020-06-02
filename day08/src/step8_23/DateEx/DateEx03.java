package step8_23.DateEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx03 {

	public static void main(String[] args) {
		
		/*
		 * Date Ŭ���� Ȱ��
		 * Date Ŭ���� ��ü���� �� / �� / �� / �� / �� / �ʸ� ��������
		 * get���� �����ϴ� �޼��� ���
		 * �����Ϸ��� set���� �����ϴ� �޼��� ���
		 * 
		 * Date Ŭ������ 1900�� �������� ��¥ ó��
		 * ���� �������� 1900�� ���ϰ�, �������� 1900�� ������
		 * ���� �������� 1�� ���ؾ��ϰ�, ���� ���� 1�� ������
		 */
		
		Date date = new Date();
		System.out.println("�� : " + (date.getYear() + 1900));
		System.out.println("�� : " + (date.getMonth() + 1));
		System.out.println("�� : " + date.getDate());
		
		System.out.println("���� : " + date.getDay());
		//�Ͽ��� - 0, ������ - 1 ... ����� - 6
		
		System.out.println("�� : " + date.getHours());
		System.out.println("�� : " + date.getMinutes());
		System.out.println("�� : " + date.getSeconds());
		
		/*
		 * Calendar Ŭ������ ��ü�� ����� ����� �� ����
		 * Ŭ���� ���ο� �ڽ��� Ŭ������ ���� ��ü�� ���ϸ�
		 * ���ο� �������ִ� Ŭ���� ��ü�� ������ �޼ҵ尡 ���� ������
		 */
		
		//Calendar calendar = new Calendar();
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		/*
		 * Calendar Ŭ���� ��ü�� ���� ������ ���ϹǷ�
		 * SimpleDateFormat Ŭ���� ��ü�� �̿��� ������ �����Ϸ���
		 * �޼ҵ�� ������ ���� �� ������Ѿ� ��
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println("�� : " + calendar.get(Calendar.YEAR));
		System.out.println("�� : " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("�� : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� : " + calendar.get(Calendar.DATE));
		
		//�Ͽ��� - 1, ������ - 2 ...
		System.out.println("���� : " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("�� : " + calendar.get(Calendar.HOUR)); //12�ð�
		System.out.println("�� : " + calendar.get(Calendar.HOUR_OF_DAY)); //24�ð�
		System.out.println("�� : " + calendar.get(Calendar.MINUTE));
		System.out.println("�� : " + calendar.get(Calendar.SECOND));
		System.out.println("1/1000�� : " + calendar.get(Calendar.MILLISECOND));

	}

}
