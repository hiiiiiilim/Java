package com.kh.api.exam1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {
	public static void main(String[] args) {
		//Calendar Ŭ������ ����� ���糯¥�� �ð� ��������
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH);
		int day = calendar.get(calendar.DAY_OF_MONTH);
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		System.out.println("calendar Ŭ������ ����� ���� ��¥�� �ð�");
		System.out.println(year+"��");
		System.out.println(month+"��" );
		System.out.println(day+"��");
		System.out.println(hour+"��");
		System.out.println(minute+"��");
		
		//GregorianCalendarŬ������ Ȱ���� ���� ��¥�� �ð� ��������
		GregorianCalendar gCalendar = new GregorianCalendar();
		year=gCalendar.get(Calendar.YEAR);
		month = gCalendar.get(Calendar.MONTH)+1; //0���� ���� ���۵Ǿ� +1�� �ʿ���
		day = gCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"�� "+month+"�� "+day+"��");
		
	}
}
