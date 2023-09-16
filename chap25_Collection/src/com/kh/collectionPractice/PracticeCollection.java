package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {
	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.praticeList();//중복이 출력
		System.out.println();
		pc.praticeSet();//중복 미출력
		pc.praticeMap();
	}
	
	public void praticeList() {
		List<String> ls = new ArrayList<>();
		//String add 해보고 for문 출력 중복된 값 add
		ls.add("햄스터");
		ls.add("고양이");
		ls.add("강아지");
		ls.add("고양이");
		
		for(String a : ls) {
			System.out.println(a);
		}
		
	}
	public void praticeSet() {
		Set<String> pSet = new HashSet<>();
		//String add 해보고 for문 출력 중복된 값 add
		pSet.add("햄스터");
		pSet.add("고양이");
		pSet.add("강아지");
		pSet.add("고양이");
		
		for(String a : pSet) {
			System.out.println(a);
		}
		
	}
	
	public void praticeMap() {
		//키와 값을 이용해서 map put한 다음 향상된 포문으로 출력해보기
		Map<Integer, String> pMap = new HashMap<>();
		
		pMap.put(1, "딩딩이");
		pMap.put(2, "당당이");
		pMap.put(3, "딩구라미");
		
		for(Integer num : pMap.keySet()) {
			String name = pMap.get(num);
			System.out.println(num +" : "+name);
		}
	}
	
}
