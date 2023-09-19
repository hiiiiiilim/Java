package com.kh.GraphMain;
/*
 * DFS Ž���� �����Ͽ� �� ����� ���
 * Ž�� ����� ���� ��忡�� ����Ͽ� ���� �켱���� Ž�� �� ��带 �湮�� ������� ���
 *  
 * */
public class GraphMain {

	public static void main(String[] args) {
		int ver = 5; //�׷��� ����� ���� 5�� ����
		Graph graph = new Graph(ver);
		
		//addEdge ���� �߰��ϰڴ�.
		graph.addEgde(0, 1); //��� 0 ���� 1�� ������ �ִ� ������ �߰�
		graph.addEgde(0, 2); //��� 0���� 2�� ������ �ִ� ������ �߰�
		graph.addEgde(1, 3); //��� 1���� 3���� �������ִ� ������ �߰�
		graph.addEgde(2, 4); //��� 2���� 4�� �������ִ� ������ �߰�
		
		System.out.println("DFS Ž�� ��� : ");
		graph.DFS(0);//DFS Ž���� ������ ����� ��ȣ�� ����
	}

}
