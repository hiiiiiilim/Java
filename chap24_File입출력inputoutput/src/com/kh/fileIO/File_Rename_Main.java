package com.kh.fileIO;

import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String newFile = "C:\\Users\\user1\\Desktop\\댕댕이.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		
		//파일 이름 변경하기
		if(currentFile.renameTo(renameFile)) {
			System.out.println("파일이름 변경 성공");
		}else {
			System.out.println("파일이름 변경 실패");
		}
		
	}

}
