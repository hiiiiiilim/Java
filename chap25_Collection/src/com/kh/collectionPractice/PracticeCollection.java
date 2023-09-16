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
		pc.praticeList();//�ߺ��� ���
		System.out.println();
		pc.praticeSet();//�ߺ� �����
		pc.praticeMap();
	}
	
	public void praticeList() {
		List<String> ls = new ArrayList<>();
		//String add �غ��� for�� ��� �ߺ��� �� add
		ls.add("�ܽ���");
		ls.add("�����");
		ls.add("������");
		ls.add("�����");
		
		for(String a : ls) {
			System.out.println(a);
		}
		
	}
	public void praticeSet() {
		Set<String> pSet = new HashSet<>();
		//String add �غ��� for�� ��� �ߺ��� �� add
		pSet.add("�ܽ���");
		pSet.add("�����");
		pSet.add("������");
		pSet.add("�����");
		
		for(String a : pSet) {
			System.out.println(a);
		}
		
	}
	
	public void praticeMap() {
		//Ű�� ���� �̿��ؼ� map put�� ���� ���� �������� ����غ���
		Map<Integer, String> pMap = new HashMap<>();
		
		pMap.put(1, "������");
		pMap.put(2, "�����");
		pMap.put(3, "�������");
		
		for(Integer num : pMap.keySet()) {
			String name = pMap.get(num);
			System.out.println(num +" : "+name);
		}
	}
	
}
