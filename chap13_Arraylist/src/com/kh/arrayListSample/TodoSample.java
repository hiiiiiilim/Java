package com.kh.arrayListSample;

import java.util.ArrayList;

public class TodoSample {
	public static void main(String[] args) {
		ArrayList<String> todo = new ArrayList<>();
		
		//할일 만들기
		todo.add("자바의 정석 객체 파트 1회독");
		todo.add("딩딩이 집청소하기");
		todo.add("인강 듣기");
		
		System.out.println("Todo list : " + todo);
		//할일 수정하기 2개
		todo.set(0, "멋들어지게 놀기");
		todo.set(2, "팩하기");
		System.out.println("RETodo list : " + todo);
		
		//지우기
		todo.remove(2);
		System.out.println("delTodo list : " + todo);
		
		//중복된할일 제거
		//전부지우기
		todo.clear();
		System.out.println("clearTodo list : " + todo);
		
		
	}
}
