package com.kh.finalSample;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class MyMusic {
	public void runFruit() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("�߶��", "����"));
		list.add(new Music("��", "�ų�"));
		list.add(new Music("����"));
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).toString());
			//System.out.println("����");
		}
	}
	
	public static void main(String[] args) {
		MyMusic mm = new MyMusic();
		mm.runFruit();
	}
}
