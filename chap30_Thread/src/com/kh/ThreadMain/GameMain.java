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
		//외부 클래스의 인스턴스를 생성
		// 게임 루프 스레드 시작
		//Thread gameThread= new Thread(s.new Gm());
		//외부 스레드 불러오기
		GameLoop gl = new GameLoop();
		Thread gameThread = new Thread(gl);
		gameThread.start();
		
		//게임 종료 조건: 플레이어가 Enter키를 누르면 게임 종료
		try {
			System.in.read(); //사용자가 키보드로 입력한 것을 바이트 단위로 읽음, 사용자가 엔터키를 누를때까지 프로그램 일시 중지
			gl.setGameOver(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void practice2() {
		Thread gameThread= new Thread(new GameLoop());
		//외부 클래스를 받아서 시작
		//Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		//게임 종료 조건: 플레이어가 Enter키를 누르면 게임 종료
//		try {
//			System.in.read(); //사용자가 키보드로 입력한 것을 바이트 단위로 읽음, 사용자가 엔터키를 누를때까지 프로그램 일시 중지
//			
//			isGameOver = true;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
