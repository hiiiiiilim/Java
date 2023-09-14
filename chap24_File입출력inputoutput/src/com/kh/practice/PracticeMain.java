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
	
	public void practice1() { //��μ����ؼ� ���� �����
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\root\\FileName.txt");
			// ���� ����
			w.write("���� �ְ� �Ϳ��� �ܽ��� ������");
			//���� �ݱ�
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
			System.out.println("���� ���� �Ϸ�");
		}else {
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		}
		
		try {
			FileWriter fw = new FileWriter(fpath+"\\babo.txt");
			fw.write("���� �ְ� �ܽ���!!");
			fw.write("\n����!!");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
