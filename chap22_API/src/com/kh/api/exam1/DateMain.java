package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
 		java 1.1. ���ķδ� ������� ����
 		java.time ��Ű�� LocalDate LocalTime LocalDateTime �� ����ϴ� �� ����
 * */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : "+currentTime);
		
		LocalDateTime currentDateTime =LocalDateTime.now();
		System.out.println("���� ��¥�� �ð�: " + currentDateTime);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futurDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : "+futurDate);
		
		LocalDate todaymu = LocalDate.now();
		LocalDate pastDate = todaymu.minusDays(10);
		System.out.println("10���� : "+pastDate);
		LocalDate todaymu2 = LocalDate.now();
		LocalDate pastDate2 = todaymu2.minusWeeks(2);
		System.out.println("2�� ��.. : "+pastDate2);
		
		LocalDate futurDate2 = today.plusWeeks(2);
		System.out.println("2�� ��: " + futurDate2);
		LocalDate futurDate3 = today.plusMonths(2);
		System.out.println("2�� ��: " + futurDate3);
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3�ð� ������ �ð� : "+laterTime);
		
		//��¥ ��
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 8, 4);
		if(date1.isBefore(date2)) {
			System.out.println("��¥�� �����Դϴ�.");
		}else if(date1.isAfter(date2)) {
			System.out.println("��¥�� �����Դϴ�.");
		}else {
			System.out.println("��¥�� ����.");
		}

	}

}
