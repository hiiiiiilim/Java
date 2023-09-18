package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
 ����: �������� ������� ��
 * */
public class RandomMain {
	public static void main(String[] args) {
		// �ζǹ�ȣ ������
		RandomMain rm = new RandomMain();
		
		//rm.RandomExam();
		rm.Lotto();
		
	}
	
	public void Lotto() {
		Random rd = new Random();//���� ��ü ����
		//ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		//�ߺ��� ���ϱ� ���� set�� ����� �� ����
		//6 ���ڸ� �� ��
		while(lottoNum.size() < 6) {
			//1~45������ �����ؼ� ������ ����
			int ranNumber = rd.nextInt(45)+1;
			//�����ϴ��� ���� �ߺ�x 
			if(!lottoNum.contains(ranNumber)) {//!�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);				
			}
		}
		System.out.println("�ζ� ��ȣ : "+lottoNum);
		
	}
	
	public void RandomExam() {
		Random rd = new Random();//���� ��ü ����
		
		//1.���� ���� ������ ������ ������ �����߰ڴ�.
		int ranInt = rd.nextInt(100); //0~99���̿��� 1���� ���� ����
		System.out.println(ranInt);
		
		//2. �Ǽ� ���� ������ ������ ������ ������
		double ranD = rd.nextDouble();
		System.out.println(ranD);
		
		//3. �Ҹ��� �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}
	
	
}
