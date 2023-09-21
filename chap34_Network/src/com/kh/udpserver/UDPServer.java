package com.kh.udpserver;
/*
 * 네트워크 통신을 위한 중요한 클래스
 	UDP(User Datagrame Protocol)  사용해서 데이터를 송수신하는데 사용
 	DatagramSocket
 		UDP 통신을 위한 소켓클래스
 		TCP 소켓과 다르게 연결을 설정하거나 연결 유지를 관리하지않고
 		데이터패킷을 그냥 보내고 받는 파일
 	DatagramPacket
 		UDP 데이터 패킷을 나타내는 클래스
 		데이터의 실제 내용과 데이터를 보낼 대상 또는 데이터를 수신할 대상의 주소 정보를 포함
 		
 	Packet 이란? 컴퓨터 네트워크가 전달하는 데이터의 형식화된 블록
 				데이터를 주고 받을때 정해 놓은 규칙
 				Pack + Bucket 합성어 
 * */
//UDP 서버를 나타냄
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPServer {
	//start() UDP 서버를 시작하는 메소드를 나타냄. 예외를 던질 수 있으므로 예외처리가 필요함
	public void start() throws Exception {
		//8888번 포트를 사용하는 소캣을 생성, 소캣을 통해서 udp통신이 이루어짐
		DatagramSocket socket = new DatagramSocket(8888);
		//inPacket:클라이언트로부터 데이터를 수신할때 사용됨
		//outPacket: 클라이언트에게 데이터를 보낼때 사용
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		//while 루프를 사용해서 서버를 계속해서 실행
		//이 루프는 서버가 계속해서 클라이언트로부터 데이터를 수신하고 응답하는 역할을 함
		while(true) {
			//데이터를 수신하기 위한 패킷을 생성
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			//패킷을 통해 클라이언트로부터 데이터를 받음
			socket.receive(inPacket);
			
			//수신한 패킷에서 클라이언트의 ip와 port
			//inpacket을 통해서 클라이언트의 ip 주소와 포트번호를 받음
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			//서버의 현재 시간을 시분초형태로 반환
			//현재 서버 시간을 hh:mm:ss 형식의 문자열로 변환
			SimpleDateFormat simpleDate = new SimpleDateFormat("[hh:mm:ss]");
			String time = simpleDate.format(new Date());
			outMsg = time.getBytes(); //바이트 배열로 변환
			
			//패킷을 생성해서 클라이언트한테 전송
			outPacket = new DatagramPacket(outMsg, outMsg.length,address, port);
		}
	}
	//main 메서드:udpserver 클래스의 인스턴스를 생성하고 start()메서드를 호출하여 udp 서버 실행
	//예외가 발행하면 예외처리
	public static void main(String[] args) {
		try {
			new UDPServer().start(); //UDP 서버의 실행
			//new UDPServer.start(); 에러
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
