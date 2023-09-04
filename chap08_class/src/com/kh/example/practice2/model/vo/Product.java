package com.kh.example.practice2.model.vo;

/*
 * 1.������� ����
 com.kh.example.practice2.model.vo.
 Product
 pName :String
 price : int 
 brand : String
//2.������ this�� Ȱ���ؼ� ��������.
 +Product()
 3.��� �޼ҵ� �����
 +information : void
 * */
public class Product {
	//1. ������� ����
	String pName;
	int price;
	String brand;
	//2.������ this�� Ȱ���ؼ� ��������.
	public Product(String pName, int price, String brand) {
		this.pName=pName;
		this.price=price;
		this.brand=brand;
	}
	//3.��� �޼ҵ� �����
	public void information() {
		System.out.println("��ǰ�� : "+pName);
		System.out.println("���� : "+price);
		System.out.println("�귣�� : "+brand);
	}
}
