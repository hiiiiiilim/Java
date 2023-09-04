package com.kh.classSample;

public class Car {
	//1. ���� �ʵ� �������
	String brand; //�귣��
	String model; //��
	int speed; //�ӵ�
	boolean engineOn; //���� ����
	
/*=========================================================
 * ������� �ؿ��� �޼���� ����
 * 
 * */
	
	//2. �����ڴ� �޼����� ����
	//car�� �귣��� �𵨰� ���ǵ�� ���� ���¸� ��Ÿ����.
	public Car(String brand, String model) { //���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
	}
	
	//���� ���� �޼���
	public void startEngine() {
		//���࿡ ������ true�� ���� �õ�, ������ false�� �̹� ������ �����ִ�.
		System.out.println("������ "+brand+"�Դϴ�.");
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");//��� �޼����ۼ�
		}else {//������ false �̹� ������ �����ִ�.
			System.out.println("�̹� ������ �����ֽ��ϴ�.");
		}
	}
	
	//���Ӹ޼���
	public void acclerate(int amount) {//�Ķ������ �̸��� ���� ǥ���ϰ� ���� �̸��� ���� ��
		if(engineOn) {//������ true�� ���� �ӵ��� �󸶴�.
			speed += amount;
			System.out.println("�ӵ�"+speed+" ���Դϴ�.");
		}else {//������ false�� ������ �����־� �ӵ��� �� �� ����.
			System.out.println("�ӵ��� �� �� ����.");
		}
		
	}
	
}
