package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_mkdirs pm = new Practice_mkdirs();
		
		pm.Practice1();
		
	}
	
	public void Practice1() {
		String dirPath="C:\\Users\\user1\\Desktop\\이름1\\이름2";
		//폴더 연속으로 2개 만들기
		File dir = new File(dirPath);
		
		//mkdir 메서드를 사용하여 디렉토리 생성시도
		boolean success = dir.mkdirs();
		
		//폴더 연속으로 3개 만들기
		String dirPath2="C:\\Users\\user1\\Java_Workspace\\chap25_";
		File dir2 = new File(dirPath2);
		
		//mkdir 메서드를 사용하여 디렉토리 생성시도
		boolean success2 = dir2.mkdirs();
		
		//폴더 연속으로 5개 만들기
		String dirPath3="C:\\Users\\user1\\Documents\\myplace\\Music\\korean\\KPOP\\Group";
		File dir3 = new File(dirPath3);
		
		//mkdir 메서드를 사용하여 디렉토리 생성시도
		boolean success3 = dir3.mkdirs();
		
		dirPath = "C:\\Users\\user1\\Desktop\\sdsa";
		dir = new File(dirPath);
		success=dir.mkdirs();
	}

}
