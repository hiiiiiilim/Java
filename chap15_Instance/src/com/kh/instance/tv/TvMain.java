package com.kh.instance.tv;

public class TvMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv; //tv�ν��Ͻ��� �����ϱ� ���ؼ� ���� tv�� ����
		tv = new Tv(); //tv�ν��Ͻ� ����/ ��ü�� �ּҸ� ���������� �����Ѵ�.
		//Tv tv = new Tv();
		
		tv.channel=7; //tv �ν��Ͻ� ��������� channel�� ���� 7�� ����
		tv.channalDown();//tv�ν��Ͻ� �޼��� ȣ��
		tv.power();
		System.out.println("Channl "+tv.channel);
	}

}
