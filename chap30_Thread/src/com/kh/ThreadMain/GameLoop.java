package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class GameLoop implements Runnable {
	private static boolean isGameOver = false;	
	@Override
	public void run() {
		while(!isGameOver) {
			//게임 루프 내용
			int randomValue = new Random().nextInt(10);//임의의 숫자 생성
			System.out.println("임의의 숫자 : "+ randomValue);
			
			//게임 루프 지연 시간
			try {
				try {
					System.in.read();
					isGameOver = true;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(1000);//1초 대기
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("게임 종료하려면 Enter를 누르세요");
		}
	}
	

	public void setGameOver(boolean isGameOver) {
		this.isGameOver = isGameOver;
	}
}
