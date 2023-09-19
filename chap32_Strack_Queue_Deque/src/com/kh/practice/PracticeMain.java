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
		//stack에 값을 저장하고 삭제하고 초기화등 메서드 사용해보기
		
		Stack<Integer> stack = new Stack<>();
		
		//스텍 값넣기
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		
		//pop
		stack.pop();
		System.out.println(stack);
		
		//가장 마지막에 넣은 값 출력
		System.out.println(stack.peek());
		
		//스텍의 크기 출력
		System.out.println(stack.size());
		
		//스텍에 1이 들어있는지 확인
		System.out.println(stack.contains(1));
		
		//스텍 초기화
		stack.clear();
		
		//스텍이 비어있는지 확인
		System.out.println(stack.empty());
	}
	
	public void PracticeQueue() {
		//큐에 요소 추가 반환 삭제하고 while 사용해보기
		
		Queue<String> queue = new LinkedList<>();
		
		//큐에 요소 추가
		queue.offer("햄스터");
		queue.offer("최고야");
		queue.offer("귀여워");
		
		//큐의 front 요소 확인
		System.out.println(queue.peek());
		
		//큐의 크기 확인
		System.out.println(queue.size());
		queue.poll();
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		
	}
}
