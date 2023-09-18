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
		System.out.println("1. ��Ʈ ���� �����");
		System.out.println("2. ��Ʈ ����");
		System.out.println("3. ��Ʈ ��� �����ϱ�");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		
		int select = sc.nextInt();
		if(select==1) {
			fileSave();
		}else if(select == 2) {
			fileOpen();
		}else if(select == 3) {
			fileEdit();
		}else if(select == 9) {
			System.exit(0);
		}else {
			System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���");
			mainMenu();
		}
	}//end of mainMenu
	
	public void fileSave() {
		boolean isFalse=false;
		StringBuilder file = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		while(!isFalse) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String text = sc.nextLine();
			
			list.add(text);
			
			if(text.equals("ex��it")) {
				for(int i=0; i<list.size()-1; i++) {
					file.append(list.get(i));
				}
				while(!isFalse) {
					System.out.print("������ ���� ���� �Է��ϼ���.(myFile.txt) : ");
					String title = sc.next();
					if(fc.checkName(title)) {
						System.out.println("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n)");
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
	}//end of fileSave
	
	public void fileOpen() {
		System.out.print("�� ���� ��:");
		String fileName = sc.next();
		if(fc.checkName(fileName)) {
			String result = fc.fileOpen(fileName).toString();
			System.out.println(result);
			mainMenu();
		}else {
			System.out.println("���� �����Դϴ�.");
			mainMenu();
		}
	
	}//end of fileOpen
	
	public void fileEdit() {
		System.out.println("������ ���� ��: ");
		String fileName=sc.next();
		if(fc.checkName(fileName)) {
			boolean isFalse=false;
			StringBuilder file = new StringBuilder();
			ArrayList<String> list = new ArrayList<>();
			while(!isFalse) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				String text = sc.nextLine();
				
				list.add(text);
				
				if(text.equals("ex��it")) {
					for(int i=0; i<list.size()-1; i++) {
						file.append(list.get(i)).append("\n");
					}
					fc.fileEdit(fileName, file);
					isFalse=true;
					mainMenu();
				}
			}
		}
	}//end of fileEdit
}

