package com.kh.practice.array;

public class practice10_t {
	public static void main(String[] args) {
		/*
		 �ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
		 3��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���
		 * */
		String jumin = "123456-1234567";
		String makestar="*";
		
		char[] juminStar = jumin.toCharArray();
		
		
		for(int i=8; i<juminStar.length; i++) {
			juminStar[i]='*';
		}
		
		System.out.print(juminStar);
		
		
				
	}
}
