package com.kh.goodExam.game;

public class GameView {
	//������ ����� ������
	public void displayMessage() {
		final String StartMsg = "���� ���߱� ������ �����մϴ�.";
		final String StartMsg2 = "1���� 100���� ���ڸ� ���纸����!";
	}
	//���ڸ� �����ϴ� ���Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� ���� ����
	//1. ���� �����ϴ� �� �Է��ϱ�
	public void displayGuessPromt() {
		final String guessMsg ="������ ���ڸ� �Է��ϼ���.";
	}
	
	public void displayCorrectGuess() {
		final String correctMsg = "���ڸ� ������ϴ�.";
	}
	public void displayIncorrectGuess() {
		final String incorrectMsg = "Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.";
	}
	
	public void displayAttempts(int attempts) {
		final String attempsMsg ="�õ� Ƚ�� : "+ attempts;
	}
	public void displayGameOver() {
		final String overMsg = "���� ����";
	}
}
