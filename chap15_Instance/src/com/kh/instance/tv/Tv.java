package com.kh.instance.tv;
//tv����
public class Tv {
	//tv ����
	//tv�� �Ӽ�(�ʵ�)
	String color; //����
	boolean power;//��������
	int channel; //ä��
	
	//tv���(�޼���)
	public void power() {
		power = !power; //���� ����
	}
	
	public void channalUp() {
		++channel;
	}
	public void channalDown() {
		--channel;
	}
	
}
