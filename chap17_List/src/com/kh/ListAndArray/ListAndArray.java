package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1();
		//ListArray2 la = new ListArray2(); XXXXXXXXXXXXXXXX�޼ҵ带 ��ü�� ������ �� ����
		ListAndArray la = new ListAndArray();
		la.ListArray2();
	}
	
	public static void ListArray1() {
		// array ���� ->�ڹٿ��� �⺻���� ���� �Ǿ� �ִ� ��
		int[] intArray = new int[2]; //ũ�Ⱑ 5�� �����迭 ����
		intArray[0]=1;
		intArray[1]=2;
		
		//Array�� ����ҷ��� for���ʿ�
		System.out.println("Array ���: ");
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		
		//�������� ���ԵǾ��־� ���Ͱ��� ������ ��
		System.out.println();
		
		//List����
								//�� �迭����Ʈ ����
		List<Integer> intList = new ArrayList<>(); //integer ��ü�� �����ϴ� Arraylist ����	
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List ���
		System.out.println("List ��� : ");
		//System.out.println("List ��� : "+intList);
		for(int num : intList) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		String[] StringArray = new String[2];
		StringArray[0]="��";
		StringArray[1]="��";
		
		for(int i=0; i<StringArray.length; i++) {
			System.out.print(StringArray[i]+" ");
		}
		
		System.out.println();
		
		List<String> StringList = new ArrayList<>();
		StringList.add("��");
		StringList.add("��");
		StringList.add("��");
		
		for(String num : StringList) {
			System.out.print(num + " ");
		}
	}
	
	public void ListArray2() {//�޼ҵ�(�Լ��� ����)
		List<String> StringList2 = new ArrayList<>();
		StringList2.add("�ٳ���");
		StringList2.add("���");
		StringList2.add("������");
		
		for(String num : StringList2) {
			System.out.print(num + " ");
		}
	}

}
