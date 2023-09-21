package com.kh.finalSample;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class MyMusic {
	public void runFruit() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("¹ß¶óµå", "½½ÇÄ"));
		list.add(new Music("´í½º", "½Å³²"));
		list.add(new Music("À½¾Ç"));
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).toString());
			//System.out.println("À½¾Ç");
		}
	}
	
	public static void main(String[] args) {
		MyMusic mm = new MyMusic();
		mm.runFruit();
	}
}
