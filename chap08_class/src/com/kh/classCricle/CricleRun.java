package com.kh.classCricle;

public class CricleRun {
	public static void main(String[] args) {
		//�⺻������ ����
		
		Circle circle = new Circle();
		//�ʱ� ���� �ѷ��� ���̸� ����ϰ� ����غ���
		System.out.println("�ʱ��� ���� ������ �˰�ʹ�~");
		circle.AreaCircle();
		circle.SizeOfCircle();
		
		//�������� 1�� ������Ų��.
		circle.inRadius();
		
		//���� �ѷ��� ���̰� ������ 1�� ������ ���� ��� ���
		System.out.println("�������� 1�� ������Ų �� ���� ����");
		circle.AreaCircle();
		circle.SizeOfCircle();
	}
	
	
}

