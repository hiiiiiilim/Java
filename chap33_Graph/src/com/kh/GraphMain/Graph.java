package com.kh.GraphMain;

import java.util.LinkedList;
/*
 * Graph class ��������Ʈ�� ����ؼ� ���� ������ ����
 * 
 * */
public class Graph {
	private int V; //�׷����� ��� ��
	private LinkedList<Integer>[] adjList; //��������Ʈ �迭
	/*adjList : �迭�� ��������Ʈ�� �����ϴ� �迭
	 * 			�� ��帶�� ����� ������ �����ϱ� ���� LinkedList��ü �迭�� �ʱ�ȭ*/
	
	/*�׷��� ������
		�׷��� ũ��(��� �� )�� �޾ƿͼ� �׷����� �ʱ�ȭ
	 adjList �迭�� �� ���Ҹ� �� LinkedList�� �ʱ�ȭ
	*/
	public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for(int i=0; i<ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	//addEgde: ��带 �׷����� �߰�, �׷����� ���ο� ������ �߰�
	public void addEgde(int source, int des) {
		//source���� des�� ���� ������ �߰��ϸ� adjList �迭���� souce�� �ش��ϴ� LinkedList�� des �߰�
		adjList[source].add(des);
	}
	
	//�׷��� Ž��(���� �켱 Ž��)
	//���� �켱Ž���� �����ϰ�, ���� ��带 �Ű������� ����
	public void DFS(int startNode) {
		//�湮 ���θ� �����ϱ� ���� visited �迭 �ʱ�ȭ
		boolean[] vistied = new boolean[V];
		DFSUtill(startNode, vistied);
	}
	//���� ���� �켱 Ž�� ����
	private void DFSUtill(int currentNode, boolean[] visited) {
		//�����带 �湮�Ѱ����� ǥ���ϰ� 
		visited[currentNode]=true;
		System.out.print(currentNode+" "); //����ȣ ���
		//������� ����� ������带 Ȯ���ϰ�, �湮���� ���� ������带 �����(������ �ڸ��� ���ƿ��ų� �ǵ��ƿ���)���� �湮
		for(int neighbor : adjList[currentNode]) {
			if(!visited[neighbor]) {
				DFSUtill(neighbor, visited);
			}
		}
	}
	
}
