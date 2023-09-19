package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.PracticeStack();
		pm.PracticeQueue();
	}
	
	public void PracticeStack() {
		//stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ�� �޼��� ����غ���
		
		Stack<Integer> stack = new Stack<>();
		
		//���� ���ֱ�
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		
		//pop
		stack.pop();
		System.out.println(stack);
		
		//���� �������� ���� �� ���
		System.out.println(stack.peek());
		
		//������ ũ�� ���
		System.out.println(stack.size());
		
		//���ؿ� 1�� ����ִ��� Ȯ��
		System.out.println(stack.contains(1));
		
		//���� �ʱ�ȭ
		stack.clear();
		
		//������ ����ִ��� Ȯ��
		System.out.println(stack.empty());
	}
	
	public void PracticeQueue() {
		//ť�� ��� �߰� ��ȯ �����ϰ� while ����غ���
		
		Queue<String> queue = new LinkedList<>();
		
		//ť�� ��� �߰�
		queue.offer("�ܽ���");
		queue.offer("�ְ��");
		queue.offer("�Ϳ���");
		
		//ť�� front ��� Ȯ��
		System.out.println(queue.peek());
		
		//ť�� ũ�� Ȯ��
		System.out.println(queue.size());
		queue.poll();
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		
	}
}
