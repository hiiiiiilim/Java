package com.kh.arrayListSample;

import java.util.ArrayList;

public class TodoSample {
	public static void main(String[] args) {
		ArrayList<String> todo = new ArrayList<>();
		
		//���� �����
		todo.add("�ڹ��� ���� ��ü ��Ʈ 1ȸ��");
		todo.add("������ ��û���ϱ�");
		todo.add("�ΰ� ���");
		
		System.out.println("Todo list : " + todo);
		//���� �����ϱ� 2��
		todo.set(0, "�ڵ������ ���");
		todo.set(2, "���ϱ�");
		System.out.println("RETodo list : " + todo);
		
		//�����
		todo.remove(2);
		System.out.println("delTodo list : " + todo);
		
		//�ߺ������� ����
		//���������
		todo.clear();
		System.out.println("clearTodo list : " + todo);
		
		
	}
}
