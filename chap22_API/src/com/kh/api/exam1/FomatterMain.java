package com.kh.api.exam1;

public class FomatterMain {
/*
 * Formatter 
 	���ڿ��� ����ȭ �ϴµ� ���Ǵ� Ŭ����
 	�ؽ�Ʈ ����� ���ϴ� ���Ŀ� �°� �������ϰ� ���� �� �����ϰ� ���
 * */
	public static void main(String[] args) {
		String name = "Kim";
		int age = 30;
		double salary = 50000.50;
		
		//Formatter�� ����Ͽ� ���ڿ�������ȭ
		//.2 �Ҽ������� �ڸ����� �����ϴµ� ���
		String formatString = String.format("�̸�: %s, ����:%d, ����:%.5f", name, age, salary);
		
		//����ȭ�� ���ڿ������
		System.out.println(formatString);

	}

}
