package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class GameLoop implements Runnable {
	private static boolean isGameOver = false;	
	@Override
	public void run() {
		while(!isGameOver) {
			//���� ���� ����
			int randomValue = new Random().nextInt(10);//������ ���� ����
			System.out.println("������ ���� : "+ randomValue);
			
			//���� ���� ���� �ð�
			try {
				try {
					System.in.read();
					isGameOver = true;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(1000);//1�� ���
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("���� �����Ϸ��� Enter�� ��������");
		}
	}
	

	public void setGameOver(boolean isGameOver) {
		this.isGameOver = isGameOver;
	}
}
