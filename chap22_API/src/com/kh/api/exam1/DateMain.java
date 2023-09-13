package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타내는데 사용
 		java 1.1. 이후로는 권장되지 않음
 		java.time 패키지 LocalDate LocalTime LocalDateTime 을 사용하는 게 좋음
 * */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : "+currentTime);
		
		LocalDateTime currentDateTime =LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + currentDateTime);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futurDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : "+futurDate);
		
		LocalDate todaymu = LocalDate.now();
		LocalDate pastDate = todaymu.minusDays(10);
		System.out.println("10일전 : "+pastDate);
		LocalDate todaymu2 = LocalDate.now();
		LocalDate pastDate2 = todaymu2.minusWeeks(2);
		System.out.println("2주 전.. : "+pastDate2);
		
		LocalDate futurDate2 = today.plusWeeks(2);
		System.out.println("2주 뒤: " + futurDate2);
		LocalDate futurDate3 = today.plusMonths(2);
		System.out.println("2달 뒤: " + futurDate3);
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3시간 이후의 시간 : "+laterTime);
		
		//날짜 비교
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 8, 4);
		if(date1.isBefore(date2)) {
			System.out.println("날짜가 이전입니다.");
		}else if(date1.isAfter(date2)) {
			System.out.println("날짜가 이후입니다.");
		}else {
			System.out.println("날짜가 같다.");
		}

	}

}
