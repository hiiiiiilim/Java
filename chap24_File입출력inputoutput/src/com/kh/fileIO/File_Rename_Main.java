package com.kh.fileIO;

import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String newFile = "C:\\Users\\user1\\Desktop\\�����.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		
		//���� �̸� �����ϱ�
		if(currentFile.renameTo(renameFile)) {
			System.out.println("�����̸� ���� ����");
		}else {
			System.out.println("�����̸� ���� ����");
		}
		
	}

}
