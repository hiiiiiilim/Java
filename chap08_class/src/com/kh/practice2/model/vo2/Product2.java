package com.kh.practice2.model.vo2;

public class Product2 {
	private String pName;
	private int price;
	private String brand; //���ٸ� �Ұ���, �����ڿ��� �ʱ�ȭ�� �ϰ����ϸ� �ʱ�ȭ�� ��
	
	public Product2(String pName, int price, String brand) {
		this.pName=pName;
		this.price=price;
		this.brand=brand;
	}
	public void information() {
		System.out.println("��ǰ�� : "+pName);
		System.out.println("���� : "+price);
		System.out.println("�귣�� : "+brand);
	}
	
}
