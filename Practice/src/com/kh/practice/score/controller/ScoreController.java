package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {
	ScoreDAO sd = new ScoreDAO();
	
	//�Ű������� DAO�� ����
	public void saveScore(String name, int kor, int eng, int math ,int sum, double avg) {
		try {
			sd.saveScore(name, kor, eng, math, sum, avg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String readScore() throws IOException{
		return sd.readScore();
	}
}
