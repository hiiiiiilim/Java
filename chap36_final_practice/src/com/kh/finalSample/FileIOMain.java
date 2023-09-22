package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
									//2번째인자의 값이 true 지정되면 해당 파일에 이어쓰기
			fw = new FileWriter("file.txt", true);
			fw.write("1000");
			fw.write("\n");
			fw.write("10000");
			fw.close();
			
			FileReader rd = new FileReader("file.txt");
			BufferedReader br = new BufferedReader(rd);
			
			
			String line; 
			/*변수에 readline 읽어오는 값을 저장해야 전체값을 볼 수 있다 아래 코드 처럼 
			 * 작성시 보여주는 값은 한줄 보여주고 다른 값으로 초기화 되기에 결과가 10000 밖에 안나온다.
			 * 그래서 변수를 사용해서 이전에 보여준 값들이 보여질 수 있도록 저장을 하는 부분이 필요한 것이다. 그것이 line변수이다.
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
