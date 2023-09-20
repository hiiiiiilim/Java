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
	//매개변수들을 DataOutputStream을 통해 파일에 저장 ->filewrite를 통해저장
	public void saveScore(String name, int kor, int eng, int math ,int sum, double avg) throws IOException{
		FileWriter w = new FileWriter("성적.txt", true);
		w.write(name + " "+kor+" "+eng+" "+math+" "+sum+" "+Double.toString(avg));
		w.write("\n");
		w.close();
	}
	
	//파일을 DataInputStream을 통해 읽어옴 -> filereader 
	public String readScore() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("성적.txt"));
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
	    br.close();
		return str;
	}
}
