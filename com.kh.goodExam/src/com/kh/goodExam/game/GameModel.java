package com.kh.goodExam.game;
//랜덤 숫자 맞추기 게임모델
public class GameModel {
	private int secretNumber; //숨겨진 번호
	private int attempts; // 몇 번 시도했는가
	
	public GameModel() {
		//1~100 사이 무작위 숫자 생성하기
		secretNumber = (int)(Math.random()*100)+1;
		attempts = 0;//최초시도는 0
	}
	
	//1~100사이 중 컴퓨터가 랜덤으로 추출한 숫자 1개를 넣음
	public int getSecretNumber() {
		return secretNumber;
	}
	public int getAttempts() {
		return attempts;
	}
	
	//시도횟수를 증가하는 
	public void incrementApttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess(int guess) {
		incrementApttempts();//guess가 값을 입력했기 때문에 증가메소드를 추가
		return guess == secretNumber; //랜덤 값이랑 게스랑 같은지
	}
}
