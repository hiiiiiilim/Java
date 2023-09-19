package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//���ؿ� �� �߰�
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		/*
		 * |       |
		 * |   3   |
		 * |   2   |
		 * |___1___|
		 * 
		 * */
		
		//���� �� ����
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //2
		
		
		//��ü �� ���� (�ʱ�ȭ)
		stack.clear();
		
		//���ؿ��� ���� �������� ���� ��(����� ��)���
		stack.peek();
		
		//������ ũ�� ���
		stack.size();
		
		//stack empty ������ ����ִ��� Ȯ�� 
		//��� �ִٸ� true �ϳ��� ����ִٸ� false
		stack.empty();
		
		//���ؿ� 1�� �ִ��� �����Ѵٸ� true
		stack.contains(1);
	}

}
