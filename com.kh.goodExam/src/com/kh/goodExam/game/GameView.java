package com.kh.goodExam.game;

public class GameView {
	//게임의 결과를 보여줌
	public void displayMessage() {
		final String StartMsg = "숫자 맞추기 게임을 시작합니다.";
		final String StartMsg2 = "1에서 100사이 숫자를 맞춰보세요!";
	}
	//숫자를 추측하는 값입력하고 맞췄는지 틀렸는지 적는거랑 시도횟수 게임 종료
	//1. 숫자 추측하는 값 입력하기
	public void displayGuessPromt() {
		final String guessMsg ="추측한 숫자를 입력하세요.";
	}
	
	public void displayCorrectGuess() {
		final String correctMsg = "숫자를 맞췄습니다.";
	}
	public void displayIncorrectGuess() {
		final String incorrectMsg = "틀렸습니다. 다시 시도하세요.";
	}
	
	public void displayAttempts(int attempts) {
		final String attempsMsg ="시도 횟수 : "+ attempts;
	}
	public void displayGameOver() {
		final String overMsg = "게임 종료";
	}
}
