package com.kh.tcpMain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(1311);
			System.out.println("Server Waiting");
			
			//만약에 클라이언트와 연결하고 싶다면 클라이언트와 연결하는 코드작성
			while(true) {
				//클라이언트와 연결 대기하는 코드
				Socket client = serverSocket.accept();
				System.out.println("connect Client");
				
				//읽어 올때 
				InputStream inStream = client.getInputStream();
				Scanner sc = new Scanner(inStream);
				System.out.println("Server | Client : " + sc.nextLine());
				
				OutputStream outStream = client.getOutputStream();
				PrintStream printStream = new PrintStream(outStream);
				printStream.print("Hi Client");
				System.out.println("Server | Client ");
				printStream.flush();//버퍼의 데이터를 한번에 쏟아냄
				
				client.close();//클라이언트와 연결만 해제
				System.out.println("Server "+ client.getInetAddress().getHostAddress());
				
				//만약 서버는 무한대로 실행이 되어야하나 실행 제한을 주고 싶을때
				int count =0;
				if(count > 7) {
					serverSocket.close(); //서버를 죽이는 것
					System.out.println("Server Close");
				}
				count +=1;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
