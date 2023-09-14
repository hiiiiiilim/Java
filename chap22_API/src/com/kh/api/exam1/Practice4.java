package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {
	public static void main(String[] args) {
		Practice4 p = new Practice4();
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice4();
		p.practice5();
	}
	
	public void practice1() {//년월일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String a = sdf.format(currentDate);
		System.out.println("년월일: "+a);	
	}
	public void practice2() {//시분초
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		String a = sdf.format(currentDate);
		System.out.println("시분초: "+a);
	}
	public void practice3() {//월일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		o
		String a = sdf.format(currentDate);
		System.out.println("월일: "+a);
	}
	public void practice4() {//년도 시간
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy HH:mm:ss");
		
		String a = sdf.format(currentDate);
		System.out.println("년도 시간: "+a);
	}
	public void practice5() {//년-월-일 요일 
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) ");
		String a = sdf.format(currentDate);
		System.out.println("년-월-일 요일 : "+a);
	}
}
