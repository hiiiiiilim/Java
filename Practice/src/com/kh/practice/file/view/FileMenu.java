package com.kh.practice.file.view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		System.out.println("*****My Note*****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		
		int select = sc.nextInt();
		if(select==1) {
			fileSave();
		}else if(select == 2) {
			
		}else if(select == 3) {
			
		}else if(select == 9) {
			System.exit(0);
		}else {
			System.out.println("잘 못 입력하셨습니다. 다시입력해주세요");
			mainMenu();
		}
	}
	public void fileSave() {
		boolean isFalse=false;
		StringBuilder file = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		while(!isFalse) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String text = sc.next();
			
			list.add(text);
			
			if(text.equals("ex끝it")) {
				for(int i=0; i<list.size()-1; i++) {
					file.append(list.get(i)).append("\n");
				}
				while(!isFalse) {
					System.out.print("저장할 파일 명을 입력하세요.(myFile.txt) : ");
					String title = sc.next();
					if(fc.checkName(title)) {
						System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
						String yesOrNo = sc.next();
						if(yesOrNo.equals("y")) {
							fc.fileSave(title, file.toString());
							isFalse=true;
						}else {
							continue;
						}
					}
					fc.fileSave(title, file.toString());
					isFalse=true;
				}
				mainMenu();					
			}
		}
	}
}