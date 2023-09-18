package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

import com.kh.ThreadMain.SimpleGame.Gm;

public class GameMain {
	private static boolean isGameOver = false;
	
	public static void main(String[] args) {
		GameMain gm = new GameMain();
		//gm.practice1();
		gm.practice2();
	}
	
	public void practice1() {
		//SimpleGame s = new SimpleGame();
		//�ܺ� Ŭ������ �ν��Ͻ��� ����
		// ���� ���� ������ ����
		//Thread gameThread= new Thread(s.new Gm());
		//�ܺ� ������ �ҷ�����
		GameLoop gl = new GameLoop();
		Thread gameThread = new Thread(gl);
		gameThread.start();
		
		//���� ���� ����: �÷��̾ EnterŰ�� ������ ���� ����
		try {
			System.in.read(); //����ڰ� Ű����� �Է��� ���� ����Ʈ ������ ����, ����ڰ� ����Ű�� ���������� ���α׷� �Ͻ� ����
			gl.setGameOver(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void practice2() {
		Thread gameThread= new Thread(new GameLoop());
		//�ܺ� Ŭ������ �޾Ƽ� ����
		//Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		//���� ���� ����: �÷��̾ EnterŰ�� ������ ���� ����
//		try {
//			System.in.read(); //����ڰ� Ű����� �Է��� ���� ����Ʈ ������ ����, ����ڰ� ����Ű�� ���������� ���α׷� �Ͻ� ����
//			
//			isGameOver = true;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
