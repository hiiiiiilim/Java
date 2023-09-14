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
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void practice2() {
		// �̹��� ���� jpg or png ������ ������ �� ����ȭ�鿡�ٰ� ������ ���� ���� �ȿ� ������ �̹��� ����!
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";	
		String folderPath = "C:\\Users\\user1\\Desktop\\pictureOfDing";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("���� ���� �Ϸ�");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		
		try {
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(folderPath+"\\������.jpg");
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead=fis.read(buffer))!=-1) {
				fos.write(buffer, 0,byteRead);
			}
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}