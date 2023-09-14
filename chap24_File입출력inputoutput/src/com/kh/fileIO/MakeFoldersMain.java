package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {
/*
 	mkdirs
 	부모디렉터리가 존재하지 않는 경우에 중간 모든 디렉토리 생성
 * */	
	public static void main(String[] args) {
		String dirPath="C:\\Users\\user1\\Desktop\\parent\\child\\file";
		
		//file객체 생성
		File dir = new File(dirPath); 
		
		//mkdir 메서드를 사용하여 디렉토리 생성시도
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
	}
}
