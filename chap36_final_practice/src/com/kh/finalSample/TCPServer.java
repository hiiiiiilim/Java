package com.kh.finalSample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {//�����ϱ� ���� ��� �޼ҵ� ����
		int port =3354;
		System.out.println("Server Waiting");
		
		ServerSocket server;
		System.out.println("������ ��Ʈ"+port+"���� ���� ���Դϴ�.");
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
