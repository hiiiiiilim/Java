package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
									//2��°������ ���� true �����Ǹ� �ش� ���Ͽ� �̾��
			fw = new FileWriter("file.txt", true);
			fw.write("1000");
			fw.write("\n");
			fw.write("10000");
			fw.close();
			
			FileReader rd = new FileReader("file.txt");
			BufferedReader br = new BufferedReader(rd);
			
			
			String line; 
			/*������ readline �о���� ���� �����ؾ� ��ü���� �� �� �ִ� �Ʒ� �ڵ� ó�� 
			 * �ۼ��� �����ִ� ���� ���� �����ְ� �ٸ� ������ �ʱ�ȭ �Ǳ⿡ ����� 10000 �ۿ� �ȳ��´�.
			 * �׷��� ������ ����ؼ� ������ ������ ������ ������ �� �ֵ��� ������ �ϴ� �κ��� �ʿ��� ���̴�. �װ��� line�����̴�.
			while(br.readLine()!=null) {
				System.out.println(br.readLine());
			}*/
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
