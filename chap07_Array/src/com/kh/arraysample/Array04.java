package com.kh.arraysample;

public class Array04 {
	public static void main(String[] args) {
		//Array ����
		//����
		/*
		String[] fruitArray= {"���", "����", "Ű��", "�޷�", "��"};
		������� �ٳ���
		���⿡�� ����
		Ű������ ����
		�޷п��� ��
		�ֿ��� ������
		*/
		String[] fruitArray= {"���", "����", "Ű��", "�޷�", "��"};
		String[] fruitArray2= {"�ٳ���", "����", "����", "��", "������"};
		System.out.println(fruitArray[0] + "���� �ٳ���");
		System.out.println(fruitArray[1] + "���� ����");
		System.out.println(fruitArray[2] + "���� ����");
		System.out.println(fruitArray[3] + "���� ��");
		System.out.println(fruitArray[4] + "���� ������");
		
		for(int i=0; i<fruitArray.length; i++) {
			System.out.println(fruitArray[i] +"���� "+fruitArray2[i]);
		}
		
		
	}
}
