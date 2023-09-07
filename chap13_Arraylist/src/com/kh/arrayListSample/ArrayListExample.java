package com.kh.arrayListSample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// �� ArratList ����
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits : "+fruits);
		
		//��� �߰�
		fruits.add("���");
		System.out.println("��� �߰� : "+fruits);
		fruits.add("�ٳ���");
		System.out.println("�ٳ��� �߰� : "+fruits);
		fruits.add("����");
		System.out.println("���� �߰� : "+fruits);
		
		//ArrayList�� ���� �˾ƺ���, ��� ���� Ȯ��
		int size = fruits.size();
		System.out.println("���� ����� ũ��: "+size);
		
		//�ε����� ����Ͽ� ��ҿ� ��������, index��� get
		String firstFruits = fruits.get(0);
		System.out.println(firstFruits);
		firstFruits = fruits.get(2);
		System.out.println(firstFruits);
		
		//��� ����
		fruits.set(2, "ü��");
		System.out.println("����üũ "+fruits);
		
		//�������
		fruits.remove(1);
		System.out.println("�ٳ��� ���� Ȯ�� "+fruits);
		
		//ArrayList��ȸ�ؼ� ������
		System.out.println("��� ���� ���");
		//for (�ʱ⹮;���ǽ�;������)
		//for (����ǵ�����Ÿ�� �츮�����Һ�����:����� ����ִ� ������)
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		//ArrayList����
		fruits.clear();
		System.out.println("��� ������ ���� : "+fruits);

}

}
