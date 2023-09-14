package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy p = new PracticeCopy();
		//p.practice1();
		p.practice2();
	}
	public void practice1() {
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\dingdingbabo.jpg";
		
		try {
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile);
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead=fis.read(buffer))!=-1) {
				fos.write(buffer, 0,byteRead);
			}
			System.out.println("파일이 복사되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void practice2() {
		// 이미지 파일 jpg or png 파일을 저장한 후 바탕화면에다가 폴더를 만들어서 폴더 안에 복사한 이미지 저장!
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";	
		String folderPath = "C:\\Users\\user1\\Desktop\\pictureOfDing";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더 생성 완료");
		}else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		
		try {
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(folderPath+"\\딩딩이.jpg");
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead=fis.read(buffer))!=-1) {
				fos.write(buffer, 0,byteRead);
			}
			System.out.println("파일이 복사되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}