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
		//ArrayList ���� �� ��� �߰�
		ArrayList<String> singer = new ArrayList<>();
		singer.add("����");
		singer.add("���̳��� ���");
		singer.add("���̵�");
		
		Iterator<String> iter = singer.iterator();
		
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		iter=singer.iterator();
		//��� ����
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("���̵�")){
				iter.remove();
			}
		}
		
		//ArrayList ���
		System.out.println("���� �� ���");
		for(String list : singer) {
			System.out.println(list);
		}
		
	}
	
	

}
