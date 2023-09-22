package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoListHashmap {
	private Map<Integer, String> todo;

	public TodoListHashmap() {
		todo = new HashMap(); 
	}
	
	public void addTask(int i,String task) {
		todo.put(i, task);
	}
	
	public void removetask(Integer index) {
		if(index >=0 && index<todo.size()) {
			todo.remove(index);
		}else {
			System.out.println("�߸��� �ε��� �Դϴ�.");
		}
	}
	public void displayTask() {
		System.out.println("my TodoList");
		for(Map.Entry<Integer, String> entry : todo.entrySet()) {
			int num = entry.getKey();
			String todo = entry.getValue();
			System.out.println(num+". "+todo);                                                                                                                                                                                                                                                                                                   
		}
	}
		
	public static void main(String[] args) {
		TodoListHashmap todoList = new TodoListHashmap();
		Scanner sc = new Scanner(System.in);
		int count =1;
		
		while(true) {
			System.out.println("���� �߰� :add, ����:remove, ���Ϻ���:list, ����:exit �Է��ϼ���.");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("������ �Է��ϼ���.");
				String task = sc.nextLine();
				todoList.addTask(count,task);
				count++;
			}else if(choice.equalsIgnoreCase("remove")){
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					Integer index = Integer.parseInt(sc.nextLine()) ;
					todoList.removetask(index);
				}catch(Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			}else if(choice.equalsIgnoreCase("list")) {
				todoList.displayTask();
			}else if(choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		}
		
	}

