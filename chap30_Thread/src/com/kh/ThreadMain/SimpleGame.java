package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {
	private static boolean isGameOver = false;
	
	public static void main(String[] args) {
		//SimpleGame s = new SimpleGame();
		//외부 클래스의 인스턴스를 생성
		SimpleGame s = new SimpleGame();
		// 게임 루프 스레드 시작, 내부에 있는 클래스를 받아서 시작
		Thread gameThread= new Thread(s.new Gm());
		//외부 클래스를 받아서 시작
		//Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		//게임 종료 조건: 플레이어가 Enter키를 누르면 게임 종료
		try {
			System.in.read(); //사용자가 키보드로 입력한 것을 바이트 단위로 읽음, 사용자가 엔터키를 누를때까지 프로그램 일시 중지
			
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
				//게임 루프 내용
				int randomValue = new Random().nextInt(10);
				System.out.println("임의의 숫자 : "+randomValue);
				
				//게임 푸프 지연시간
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//게임 종료 조건은 엔터키를 누르면 게임이 종료됩니다.
				System.out.println("게임을 종료하려면 Enter를 누르세요");
			}
		}
	}
	
	
	class GameLoops implements Runnable{
		@Override
		public void run() {
			while(!isGameOver) {
				//게임 루프 내용
				int randomValue = new Random().nextInt(10);//임의의 숫자 생성
				System.out.println("임의의 숫자 : "+ randomValue);
				
				//게임 루프 지연 시간
				try {
					Thread.sleep(1000);//1초 대기
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("게임 종료");
			}
		}
		
	}


}
