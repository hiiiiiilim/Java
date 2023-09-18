package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {
	private static boolean isGameOver = false;
	
	public static void main(String[] args) {
		//SimpleGame s = new SimpleGame();
		//�ܺ� Ŭ������ �ν��Ͻ��� ����
		SimpleGame s = new SimpleGame();
		// ���� ���� ������ ����, ���ο� �ִ� Ŭ������ �޾Ƽ� ����
		Thread gameThread= new Thread(s.new Gm());
		//�ܺ� Ŭ������ �޾Ƽ� ����
		//Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		//���� ���� ����: �÷��̾ EnterŰ�� ������ ���� ����
		try {
			System.in.read(); //����ڰ� Ű����� �Է��� ���� ����Ʈ ������ ����, ����ڰ� ����Ű�� ���������� ���α׷� �Ͻ� ����
			
			isGameOver = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class Gm implements Runnable{
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);
				System.out.println("������ ���� : "+randomValue);
				
				//���� Ǫ�� �����ð�
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//���� ���� ������ ����Ű�� ������ ������ ����˴ϴ�.
				System.out.println("������ �����Ϸ��� Enter�� ��������");
			}
		}
	}
	
	
	class GameLoops implements Runnable{
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);//������ ���� ����
				System.out.println("������ ���� : "+ randomValue);
				
				//���� ���� ���� �ð�
				try {
					Thread.sleep(1000);//1�� ���
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("���� ����");
			}
		}
		
	}


}
