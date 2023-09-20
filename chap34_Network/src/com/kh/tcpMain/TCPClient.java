package com.kh.tcpMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		try {
			//서버주소와 포트번호로 소켓 생성
			//서버번호와 포트번호는 내가 연결하고자하고자 하는 포토와 동일해야함
			Socket socket = new Socket("localhost", 8080);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//서버되는지 테스트 메세지
			out.println("안녕 서버?");
			
			//서버로 부터 메세지 전달되는지 확인 테스트
			String response = in.readLine();
			System.out.println("서버 응답 : " +response);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
