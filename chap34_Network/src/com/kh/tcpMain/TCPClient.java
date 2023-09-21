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
		//서버주소와 포트번호로 소켓 생성
		//서버번호와 포트번호는 내가 연결하고자하고자 하는 포토와 동일해야함
		Socket socket = new Socket("localhost", 1234);
		System.out.println("[ Server Connect ]");
		
		//보낼때 코드
		OutputStream outStream = socket.getOutputStream();
		PrintStream printsteam = new PrintStream(outStream);
		printsteam.print("HHHHHHIIIII SSSSSSEEEERRRRRVVVVVVEEERRRR");
		
		printsteam.flush();
		
		//서버로부터 읽어옴
		InputStream InStream = socket.getInputStream();
		Scanner sc = new Scanner(InStream);
		System.out.println("[Client] Server : " +sc.nextLine());
		
		socket.close();
		System.out.println("Bye Server See you later!!");
		
	}
}
