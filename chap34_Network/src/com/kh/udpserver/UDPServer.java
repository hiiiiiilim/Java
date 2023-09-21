package com.kh.udpserver;
/*
 * ��Ʈ��ũ ����� ���� �߿��� Ŭ����
 	UDP(User Datagrame Protocol)  ����ؼ� �����͸� �ۼ����ϴµ� ���
 	DatagramSocket
 		UDP ����� ���� ����Ŭ����
 		TCP ���ϰ� �ٸ��� ������ �����ϰų� ���� ������ ���������ʰ�
 		��������Ŷ�� �׳� ������ �޴� ����
 	DatagramPacket
 		UDP ������ ��Ŷ�� ��Ÿ���� Ŭ����
 		�������� ���� ����� �����͸� ���� ��� �Ǵ� �����͸� ������ ����� �ּ� ������ ����
 		
 	Packet �̶�? ��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ���
 				�����͸� �ְ� ������ ���� ���� ��Ģ
 				Pack + Bucket �ռ��� 
 * */
//UDP ������ ��Ÿ��
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPServer {
	//start() UDP ������ �����ϴ� �޼ҵ带 ��Ÿ��. ���ܸ� ���� �� �����Ƿ� ����ó���� �ʿ���
	public void start() throws Exception {
		//8888�� ��Ʈ�� ����ϴ� ��Ĺ�� ����, ��Ĺ�� ���ؼ� udp����� �̷����
		DatagramSocket socket = new DatagramSocket(8888);
		//inPacket:Ŭ���̾�Ʈ�κ��� �����͸� �����Ҷ� ����
		//outPacket: Ŭ���̾�Ʈ���� �����͸� ������ ���
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		//while ������ ����ؼ� ������ ����ؼ� ����
		//�� ������ ������ ����ؼ� Ŭ���̾�Ʈ�κ��� �����͸� �����ϰ� �����ϴ� ������ ��
		while(true) {
			//�����͸� �����ϱ� ���� ��Ŷ�� ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			//��Ŷ�� ���� Ŭ���̾�Ʈ�κ��� �����͸� ����
			socket.receive(inPacket);
			
			//������ ��Ŷ���� Ŭ���̾�Ʈ�� ip�� port
			//inpacket�� ���ؼ� Ŭ���̾�Ʈ�� ip �ּҿ� ��Ʈ��ȣ�� ����
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			//������ ���� �ð��� �ú������·� ��ȯ
			//���� ���� �ð��� hh:mm:ss ������ ���ڿ��� ��ȯ
			SimpleDateFormat simpleDate = new SimpleDateFormat("[hh:mm:ss]");
			String time = simpleDate.format(new Date());
			outMsg = time.getBytes(); //����Ʈ �迭�� ��ȯ
			
			//��Ŷ�� �����ؼ� Ŭ���̾�Ʈ���� ����
			outPacket = new DatagramPacket(outMsg, outMsg.length,address, port);
		}
	}
	//main �޼���:udpserver Ŭ������ �ν��Ͻ��� �����ϰ� start()�޼��带 ȣ���Ͽ� udp ���� ����
	//���ܰ� �����ϸ� ����ó��
	public static void main(String[] args) {
		try {
			new UDPServer().start(); //UDP ������ ����
			//new UDPServer.start(); ����
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
