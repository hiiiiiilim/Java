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
			wirter.write("�ƴ� ��̾���.");
			System.out.println("���� ���� �������� �׽�Ʈ");
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
		String filePath = "���� �ۼ� ��/����� IO.txt";
		//FileWriter fWriter = new FileWriter(filePath, true);
		//true�� ���� ���� �̾��
		//false�� ���� �����
		
		//���࿡ ��¥�� ���� ��¥�� ������ ������
		//������ �����
		/*
		File f = new File("new.txt"); //��μ��� ����
		try {
			if(f.createNewFile()) {
				System.out.println("������ ��� ��������ϴ�.");
			}else {
				System.out.println("������ �̹������մϴ�.");
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
