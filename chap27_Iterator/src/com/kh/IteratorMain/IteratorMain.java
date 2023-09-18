package com.kh.IteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

/*
	Iterator
		�÷���(������ �׷�)�� �ݺ�(iterate)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
		�پ��� �÷��� ����(ArrayList, HashSet�� )�� ����� �� ����
		�÷����� ��Ҹ� �а� �����ϴµ� ���
		�÷����� ũ�⳪ ���� ������ ������� ��ҿ� ������ �� ����.
* */
public class IteratorMain {

	public static void main(String[] args) {
		// ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("�߶��");
		music.add("��");
		music.add("Ʈ��Ʈ");
		
		//iterator ����
		Iterator<String> iter = music.iterator();
		
		//Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String msc = iter.next();
			System.out.println(msc);
		}

		iter = music.iterator();	//�ٽ� �ʱ�ȭ
		while (iter.hasNext()) {
			String msc = iter.next();
			//���࿡ Ʈ��Ʈ�� ������ �����ϱ� ����
			if(msc.equals("Ʈ��Ʈ")) {
				iter.remove();//���� ��Ҹ� ����
			}
			System.out.println(msc);
		}
		
		//���� �� ArrayList���
		System.out.println("���� �� ���");
		for(String a : music) {
			System.out.println(a);
		}
	}

}
