package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_case {
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		
		int taskNum = 1;
		
		Scanner sc = new Scanner(System.in);
		
		//���� ����� ����
		while(true) {
	/*		System.out.println("�� �� ��� : ");
			for(Map.Entry<Integer, String> entry : todoMap.entrySet()) {
				System.out.println(entry.getKey() + " : "+entry.getValue());
			}*/
		
		
		System.out.println("�� ���� �������ּ���.");
		System.out.println("�� �� �߰��� ���� 1�� �־��ּ���.");
		System.out.println("�� �� ���Ŵ� ���� 2�� �־��ּ���.");
		System.out.println("�� �� ����� ����� ���� 4�� �־��ּ���.");
		System.out.println("�����Ͻ÷��� ���� 3�� �־��ּ���.");
		
		String choice = sc.next();
		sc.nextLine();
		
		switch(choice) {
			case "1":  case "��":
				System.out.println("�߰��� ���� �ۼ����ּ���.");
				String todoItem = sc.nextLine();
				todoMap.put(taskNum++, todoItem);
				System.out.println("�� ���� �߰� �Ǿ����ϴ�.");
				for(int i=1;i<todoMap.size();i++) {
					
				}
				break;
			case "2": case "��":
 				System.out.println("������ ���� ��ȣ�� �Է��ϼ���.");
				int removeNum = sc.nextInt();
				if(todoMap.containsKey(removeNum)) {
					todoMap.remove(removeNum);
					System.out.println("������ ���� �Ǿ����ϴ�.");
				}else {
					System.out.println("��ȣ�� �߸� �Է� �ϼ̽��ϴ�.");
				}
				break;
			case "3": case "��":
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("�ݰ������. ������ ������~");
				sc.close();
				System.exit(0);
				break;
			case "4": case "��":
				System.out.println("�� �� ��� : ");
				for(Map.Entry<Integer, String> entry : todoMap.entrySet()) {
					System.out.println(entry.getKey() + " : "+entry.getValue());
				}
				break;
				
			default:
				System.out.println("�ùٸ� ������ �ƴմϴ�. �ٽ� �������ּ���.");
		
	}
}
	}
}
