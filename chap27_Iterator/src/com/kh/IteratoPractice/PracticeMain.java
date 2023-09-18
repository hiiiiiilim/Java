package com.kh.IteratoPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	}
	
	public void practice1() {
		//ArrayList 생성 및 요소 추가
		ArrayList<String> singer = new ArrayList<>();
		singer.add("리쌍");
		singer.add("다이나믹 듀오");
		singer.add("아이들");
		
		Iterator<String> iter = singer.iterator();
		
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		iter=singer.iterator();
		//요소 삭제
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("아이들")){
				iter.remove();
			}
		}
		
		//ArrayList 출력
		System.out.println("삭제 후 출력");
		for(String list : singer) {
			System.out.println(list);
		}
		
	}
	
	

}
