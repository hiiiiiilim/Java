package com.kh.tcpMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		//�����ּҿ� ��Ʈ��ȣ�� ���� ����
		//������ȣ�� ��Ʈ��ȣ�� ���� �����ϰ����ϰ��� �ϴ� ����� �����ؾ���
		Socket socket = new Socket("localhost", 1234);
		System.out.println("[ Server Connect ]");
		
		//������ �ڵ�
		OutputStream outStream = socket.getOutputStream();
		PrintStream printsteam = new PrintStream(outStream);
		printsteam.print("HHHHHHIIIII SSSSSSEEEERRRRRVVVVVVEEERRRR");
		
		printsteam.flush();
		
		//�����κ��� �о��
		InputStream InStream = socket.getInputStream();
		Scanner sc = new Scanner(InStream);
		System.out.println("[Client] Server : " +sc.nextLine());
		
		socket.close();
		System.out.println("Bye Server See you later!!");
		
	}
}
