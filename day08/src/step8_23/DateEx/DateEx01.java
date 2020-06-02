package step8_23.DateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {
	public static void main(String[] args) {
		
		//���� ��ǻ�� �ý����� ��¥�� �ð�
		Date date = new Date();
		System.out.println(date);

		/*
		 * ��¥ �� �ð� ���Ŀ� ���Ǵ� �����ڸ� ������ ������ ���ڴ� �״�� ���
		 * Date date = new Date();
		 * SimpleDateFormat sdf = new SimpleDateFormat("��¥ �� �ð� ����");
		 * 
		 * ���� ���
		 * sdf.format(date);
		 * 
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		System.out.println(sdf1.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
		System.out.println(sdf2.format(date));
		
		/*
		 * System.currentTimeMillis();
		 * 1970�� 1�� 1�� �������� �� �޼ҵ尡 ����Ǵ� �������� ������ �ð��� �и��� ������ ����
		 * 13�ڸ� ���ڸ� ������ ������ int�� ó���ϸ� ����, long���� ó���ؾ���
		 */
		
		//int time = System.currentTimeMillis(); //���� �߻�
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(sdf2.format(time));
		
	}

}
