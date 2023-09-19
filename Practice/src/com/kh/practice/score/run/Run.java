package com.kh.practice.score.run;

import java.io.DataInputStream;
import java.io.FileNotFoundException;

import com.kh.practice.score.view.ScoreMenu;

public class Run {
	public static void main(String[] args) {
		ScoreMenu sm = new ScoreMenu();
		sm.mainMenu();
	}
	
	public DataInputStream readScore() throws FileNotFoundException{
		return null;
	}
}
