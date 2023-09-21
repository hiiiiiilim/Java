package com.kh.finalSample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {//실행하기 위한 출력 메소드 지정
		int port =3354;
		System.out.println("Server Waiting");
		
		ServerSocket server;
		System.out.println("서버가 포트"+port+"에서 실행 중입니다.");
		try {
			server = new ServerSocket(port);
			while(true) {
				Socket client = server.accept();
				System.out.println("connect Client"+client.getInetAddress());
				
				System.out.println("Client exist");
			}	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
