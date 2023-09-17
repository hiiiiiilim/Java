package com.kh.practice.file.view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	//FileController fc = new FileController();
	
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
			
		}else if(select == 3) {
			
		}else if(select == 9) {
			System.exit(0);
		}else {
			System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���");
			mainMenu();
		}
	}
	public void fileSave() {
		boolean isFalse=false;
		StringBuilder file = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		while(!isFalse) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String text = sc.next();
			
			list.add(text);
			
			if(text.equals("ex��it")) {
				for(int i=0; i<list.size(); i++) {
					file.append(list.get(i)).append("\n");
				}
				System.out.print("������ ���� ���� �Է��ϼ���.(myFile.txt) : ");
				String title = sc.next();
				
				try {
					FileWriter w = new FileWriter(title);
					w.write(file.toString());
					w.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				mainMenu();					
			}
		}
	}
}
