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
			System.out.println("잘못된 인덱스 입니다.");
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
			System.out.println("할일 추가 :add, 삭제:remove, 할일보기:list, 종료:exit 입력하세요.");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할일을 입력하세요.");
				String task = sc.nextLine();
				todoList.addTask(count,task);
				count++;
			}else if(choice.equalsIgnoreCase("remove")){
				System.out.println("삭제할 일 번호 입력하기");
				try {
					Integer index = Integer.parseInt(sc.nextLine()) ;
					todoList.removetask(index);
				}catch(Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			}else if(choice.equalsIgnoreCase("list")) {
				todoList.displayTask();
			}else if(choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		}
		
	}

