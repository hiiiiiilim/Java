package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_mkdirs pm = new Practice_mkdirs();
		
		pm.Practice1();
		
	}
	
	public void Practice1() {
		String dirPath="C:\\Users\\user1\\Desktop\\�̸�1\\�̸�2";
		//���� �������� 2�� �����
		File dir = new File(dirPath);
		
		//mkdir �޼��带 ����Ͽ� ���丮 �����õ�
		boolean success = dir.mkdirs();
		
		//���� �������� 3�� �����
		String dirPath2="C:\\Users\\user1\\Java_Workspace\\chap25_";
		File dir2 = new File(dirPath2);
		
		//mkdir �޼��带 ����Ͽ� ���丮 �����õ�
		boolean success2 = dir2.mkdirs();
		
		//���� �������� 5�� �����
		String dirPath3="C:\\Users\\user1\\Documents\\myplace\\Music\\korean\\KPOP\\Group";
		File dir3 = new File(dirPath3);
		
		//mkdir �޼��带 ����Ͽ� ���丮 �����õ�
		boolean success3 = dir3.mkdirs();
		
		dirPath = "C:\\Users\\user1\\Desktop\\sdsa";
		dir = new File(dirPath);
		success=dir.mkdirs();
	}

}
