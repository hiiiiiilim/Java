package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMain {
	/*
	 SimpleDateFormate
	 ��¥�� �ð��� ���ϴ� �������� �������ϰų�
	 ���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ����
	 
	 yyyy-MM-dd HH:mm:SS 
	 y: ����
	 M:��
	 d:��
	 H:24�ð� ������ �ð�
	 m:��
	 s:��
	 * */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS"); //MM �� mm��
		
		String forDate = sdf.format(currentDate);
		
		//��� ���
		System.out.println("������ �� ��¥ �� �ð� : "+ forDate);
	}
}
