package com.kh.Iaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	public void IntExam() {
		try {
			//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
			InetAddress address = InetAddress.getByName("www.google.com");
			//ip �ּ����
			System.out.println("Host Name : "+address.getHostName());
			System.out.println("IP Address : "+ address.getHostAddress());
			
			//����(���� ����ϴ�) ȣ��Ʈ�� InetAddress��ü ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : "+localHost.getHostName());
			System.out.println("Local Ip Address : "+localHost.getHostAddress());
			
			
			InetAddress address2 = InetAddress.getByName("www.naver.com");
			//ip �ּ����
			System.out.println("Host Name : "+address2.getHostName());
			System.out.println("IP Address : "+ address2.getHostAddress());
			
			InetAddress address3 = InetAddress.getByName("www.daum.net");
			//ip �ּ����
			System.out.println("Host Name : "+address3.getHostName());
			System.out.println("IP Address : "+ address3.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void InetSample() {
		//ȣ��Ʈ�̸��� �����ͼ� ��ü����
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//ip�ּҸ� byte �迭�� ���
			//InetAddress ��ü���� IP �ּҸ� ����Ʈ �迭�� ����
			//IP �ּҸ� ����Ʈ �迭�� ������ ������Ʈ�� ���� ip �ּҸ� �ٷ� �� ����
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes�� ����");
			for(byte ip : ipAddress) {
				System.out.print(ip+".");
			}
			System.out.println();
			
			//������ �� ������ ��� ȣ��Ʈ�� ip�ּҸ� �迭�� ���
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ���� :");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			
			//ȣ��Ʈ �̸� ���
			String hostName = address.getHostName();
			System.out.println("Host Name : "+ hostName);
			
			//����ȣ��Ʈ�� ������ �ּҾ��
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address " + localHost.getHostAddress());
			
			//��Ƽ ĳ��Ʈ �ּ� ���� Ȯ�� 
			boolean  isMultiCast = address.isMulticastAddress();
			System.out.println("��Ƽ ĳ��Ʈ �ּ� �Դϱ�? "+ isMultiCast);
			
			//ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP �ּ� �̸� : "+ name.getHostAddress());
			
			//ȣ��Ʈ�� ������ �̸���������(��ü������ �̸�)
			//ȣ��Ʈ�� ����ȭ�� (FQDN) �������� �̸��� ����
			//FQDN : Full Qaulified Domain Name
			String hostFullName = name.getCanonicalHostName();
			System.out.println("Ǯ���� : "+hostFullName);
			
			//LookPask �ּ� ���� Ȯ�� ->�������� ���𰡸� ���� ���
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("�����ΰ���? : "+isLookPack);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		InetAddressMain inetMain = new InetAddressMain();
		
		inetMain.InetSample();

	}

}
