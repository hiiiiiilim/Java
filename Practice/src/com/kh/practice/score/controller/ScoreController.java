package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.FileNotFoundException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {
	ScoreDAO sd = new ScoreDAO();
	
	//�Ű������� DAO�� ����
	public void saveScore(String name, int kor, int eng, int math ,int sum, double avg) {
		
	}
	
	public DataInputStream readScore() throws FileNotFoundException{
		return sd.readScore();
	}
}
