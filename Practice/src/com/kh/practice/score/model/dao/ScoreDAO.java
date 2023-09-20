package com.kh.practice.score.model.dao;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreDAO {
	//�Ű��������� DataOutputStream�� ���� ���Ͽ� ���� ->filewrite�� ��������
	public void saveScore(String name, int kor, int eng, int math ,int sum, double avg) throws IOException{
		FileWriter w = new FileWriter("����.txt", true);
		w.write(name + " "+kor+" "+eng+" "+math+" "+sum+" "+Double.toString(avg));
		w.write("\n");
		w.close();
	}
	
	//������ DataInputStream�� ���� �о�� -> filereader 
	public String readScore() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("����.txt"));
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
	    br.close();
		return str;
	}
}
