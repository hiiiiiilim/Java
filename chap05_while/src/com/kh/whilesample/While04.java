package com.kh.whilesample;

public class While04 {
	public static void main(String[] args) {
		//1~100������ ��
		int num = 1;
		int sum =0;
		while(num<=5) {
			sum = sum+num; //sum+=num;
			num++;
			//System.out.println("sum: "+sum+ " num: " +num);
			//sum�� �հ踦 �ֱ������� ���� ������ while�� �ȿ� �ۼ��ϱ�
		}
		System.out.println("���� ���: "+sum);
		
		/*
		 while�� ����Ǿ����ؼ� Ŭ������ ����� ���� �ƴ�
		 while���� ����� �� �����ִ� system.out.println(sum)d�� ��µ�
		 * */
	}
}
