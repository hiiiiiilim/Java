package com.kh.switchsample;

public class SwitchSample {
	public static void main(String[] args) {
		//switch��
		/*
		 Ư�������� ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		 switch���� �Ϸ��� case���� �ش� ���� ���Ͽ� ��ġ�ϴ� ��쿡 �ش��ϴ� �ڵ� ���� ����
		 �� case���� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		
		 switch(���� �Ǵ� ǥ����){
		 	case ��1 :
		 		//��1�� �ش��ϴ� �ڵ�
		 		break; //�ش����� ������ �ߴ��ϴ� ������ ��
		 	case ��2 :
		 		//��2�� �ش��ϴ� �ڵ�
		 		break;
		 	default:
		 		//�� ��� ���̽��� ��ġ���� ������ ����Ǵ� �ڵ�
		 }
		 * */
		int day = 30;
		switch(day) {
			case 1: //case�� 30�ƴϿ��� ������ ���
				System.out.println("������");
				break;
			case 2:
				System.out.println("ȭ����");
				break;
			case 30:
				System.out.println("������");
				break;
			case 4:
				System.out.println("�����");
				break;
			default:
				System.out.println("�ָ�");
		}
		
		
		int choice = 3;
		switch (choice) {
			case 1: //1���� �����ϸ� �Ƹ޸�ī��
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2: //2���� �����ϸ� ī�� ��
				System.out.println("ī�� �� �ֹ��ϼ̽��ϴ�.");
				break;
			case 3: //3���� �����ϸ� ���ν����
				System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
				break;
			case 4:
				System.out.println("��� ����Ƽ �ֹ��ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}
	}
}
