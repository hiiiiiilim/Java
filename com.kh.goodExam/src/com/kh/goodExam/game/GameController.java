package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	//  like String ������ ���� �����ó�� ��밡��
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view; 
	}
	
	public void runGame() {
		//���� �޼��� �����ִ� �� ����ϰ�
		view.displayMessage();
		//��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		while(!flag) {
			//������ �����ϴ� ���� �Է�����
			view.displayGuessPromt();
			int guess = sc.nextInt();
			
			//��ǻ�Ͱ� ������ ���ڸ� �������� �ҷ��� ��
			if(model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				flag=true;
			}else {//��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ������ ��
				view.displayIncorrectGuess();
				view.displayAttempts(model.getAttempts());
			}
			
			System.out.println();
		}
		view.displayGameOver();
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m, v);
		
		c.runGame();
		
	}
	
}
