package com.kh.classCricle;

public class Circle {
	//�������
	//private static final double PI = 3.14; //��°���, �޸��� ��ġ�� �޶����� �� ��
	final double PI = 3.14; //���
	private int radius = 1;//����
	
	//������
	public Circle() {
		//�⺻ ������
		
	}
	
	//�������� ���� ���
	public void inRadius() {
		//������ ����, ������ų ���� ������ �� �ִ�.
		radius++;
	}
	
	//���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
	public void AreaCircle() {	
		double area = PI*radius*radius;
		System.out.println("���� ���� : "+area );
	}
	public void SizeOfCircle() {
		System.out.println("���� ũ�� (������) : " + radius);
	}
}
