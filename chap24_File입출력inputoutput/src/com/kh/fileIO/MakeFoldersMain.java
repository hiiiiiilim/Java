package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {
/*
 	mkdirs
 	�θ���͸��� �������� �ʴ� ��쿡 �߰� ��� ���丮 ����
 * */	
	public static void main(String[] args) {
		String dirPath="C:\\Users\\user1\\Desktop\\parent\\child\\file";
		
		//file��ü ����
		File dir = new File(dirPath); 
		
		//mkdir �޼��带 ����Ͽ� ���丮 �����õ�
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
	}
}
