package com.kh.practiceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<String> {

	public static void main(String[] args) {
		// List�� ArrayList ���� comparator ����
		
		List<String> name = new ArrayList<>();
		name.add("ȫ�浿");
		name.add("��̿�a");
		name.add("��ö��ab");
		name.add("�̿���");
		name.add("�踶����");
		
		Collections.sort(name, new Student());
		
		
		for(String s : name) {
			System.out.println(s);
		}
	}

	@Override
	public int compare(String num1 , String num2) {
		//���̰� ������ 0 ��ȯ
		if(num1.length() == num2.length()) {
			return 0;
		}else if(num1.length()>num2.length()) { //��� ��� ��ȯ
			return 1;
		}else {
			return -1;
		}
	}

}
