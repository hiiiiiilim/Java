package com.kh.operator;

public class Ternary {
	public static void main(String[] args) {
		//6. ���� ������
		/* ���� = ���� ? ���� : ����
		 * ������ ���ϰ� ������ �� �� �ϳ��� ��ȯ
		 * ���� ? ��1(true) : ��2(false) ���·� ���
		 * �� 1�� ������ ���� �� ���
		 * �� 2�� ������ ������ �� ���
		 */
		//ex) ���̰� 20 �̻��� �����ΰ� �̼������ΰ�
		int age = 20;
		String satus = (age >= 20) ? "����" : "�̼�����" ;
		System.out.println(satus);
		
		int score = 85 ;
		String result = (score>=60) ? "�հ�" : "���հ�"	;
		System.out.println(result);
		
		int number = -5;
		String sign = (number > 0) ? "true" : "false";
		System.out.println("sign : "+sign);
		
		int temperature = 25;
		String weater = (temperature > 21) ? "������ ����" : "�߿� ����";
		System.out.println("���� ����: " + weater);
		
		//���� 7�� ���� ¦������ Ȧ������ ���
		int num = 7;
		String x = (num%2==0) ? "¦��" : "Ȧ��";
		System.out.println(num+"�� "+x+" �Դϴ�.");
		
		int number2 = -5;
		String sign2 = (number2>0) ? "���" : (number2 < 0) ? "����" : "0";
		System.out.println(sign2);
		
		
 	}
}
