package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	//  like String 변수를 만들어서 예약어처럼 사용가능
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view; 
	}
	
	public void runGame() {
		//최초 메세지 보여주는 것 출력하고
		view.displayMessage();
		//스캐너 입력해서 입력값 호출
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		while(!flag) {
			//ㅅ숫자 추측하는 값을 입력하자
			view.displayGuessPromt();
			int guess = sc.nextInt();
			
			//컴퓨터가 생각한 숫자를 맞췄을때 불러올 뷰
			if(model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				flag=true;
			}else {//컴퓨터가 생각한 숫자와 내가 입력한 숫자가 틀렸을때 뷰
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
