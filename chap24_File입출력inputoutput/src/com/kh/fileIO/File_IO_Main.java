package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class File_IO_Main {
	public static void main(String[] args) {
		try {
			FileWriter wirter = new FileWriter("abcde.txt");
			wirter.write("아니 재미없어.");
			System.out.println("파일 덮어 써지는지 테스트");
			wirter.close();
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferReader.readLine())!=null) {
				System.out.println(line);
			}
			bufferReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void a() {
		String filePath = "설명 작성 란/입출력 IO.txt";
		//FileWriter fWriter = new FileWriter(filePath, true);
		//true는 파일 끝에 이어쓰기
		//false는 파일 덮어쓰기
		
		//만약에 날짜가 오늘 날짜인 폴더가 없을대
		//폴더를 만들고
		/*
		File f = new File("new.txt"); //경로설정 가능
		try {
			if(f.createNewFile()) {
				System.out.println("파일이 없어서 만들었습니다.");
			}else {
				System.out.println("파일이 이미존재합니다.");
			}
			//FileWriter fw = new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		String fileName = f.getName();
		*/
		//FileReader fReader = new FileReader(f);
	}
}
