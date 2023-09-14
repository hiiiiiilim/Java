package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
		
		//p.practice1();
		p.practice2();
	}
	
	public void practice1() { //경로설정해서 파일 만들기
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\root\\FileName.txt");
			// 파일 쓰기
			w.write("세계 최고 귀여운 햄스터 딩딩이");
			//파일 닫기
			w.close();
			FileReader r = new FileReader("C:\\Users\\user1\\Desktop\\FileName.txt");
			BufferedReader br = new BufferedReader(r);
			
			String line ;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void practice2() {
		String fpath = "C:\\Users\\user1\\Desktop\\dingding";
		File folder = new File(fpath);
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더 생성 완료");
		}else {
			System.out.println("이미 존재하는 폴더입니다.");
		}
		
		try {
			FileWriter fw = new FileWriter(fpath+"\\babo.txt");
			fw.write("세계 최고 햄스터!!");
			fw.write("\n딩딩!!");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
