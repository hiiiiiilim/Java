package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//스텍에 값 추가
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
		
		//스텍 값 삭제
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //2
		
		
		//전체 값 제거 (초기화)
		stack.clear();
		
		//스텍에서 가장 마지막에 넣은 값(상단의 값)출력
		stack.peek();
		
		//스텍의 크기 출력
		stack.size();
		
		//stack empty 스텍이 비어있는지 확인 
		//비어 있다면 true 하나라도 들어있다면 false
		stack.empty();
		
		//스텍에 1이 있는지 존재한다면 true
		stack.contains(1);
	}

}
