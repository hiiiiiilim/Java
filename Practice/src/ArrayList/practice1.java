package ArrayList;

import java.util.ArrayList;

public class practice1 {
	/*
	 ArrayList �̿��ؼ� ���ֳ����ĳ���
	���� 3ȸ 1,3,5 ->��, ����, �׸� ����
	���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
	���� for�� �̿��ؼ� ���� ����ϱ�
	�� �� ��� �� �� ��
	 * */
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("��");
		a.add("��");
		a.add("��");
		a.add("��");
		a.add("��");
		a.add("��");
		a.add("��");
		
		System.out.println(a);
		
		//���� 3ȸ
		a.set(1, "��");
		a.set(3, "����");
		a.set(5, "�׸�");
		System.out.println(a);
		
		a.add(2,"���ο�");
		a.add(6,"�����Ķ�");
		System.out.println(a);
		
		for(String b:a) {
			System.out.println(b);
		}
		//����
		a.remove(1);
		a.remove(1);
		a.remove(1);
		a.remove(1);
		a.remove(2);
		a.remove(2);
		System.out.println(a);
	}
	
	
}
