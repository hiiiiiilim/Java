package com.kh.GraphMain;
/*
 * DFS 탐색을 시작하여 그 결과를 출력
 * 탐색 결과는 시작 노드에서 출발하여 깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력
 *  
 * */
public class GraphMain {

	public static void main(String[] args) {
		int ver = 5; //그래프 노드의 수를 5로 정의
		Graph graph = new Graph(ver);
		
		//addEdge 간선 추가하겠다.
		graph.addEgde(0, 1); //노드 0 에서 1로 방향이 있는 엣지를 추가
		graph.addEgde(0, 2); //노드 0에서 2로 방향이 있는 엣지를 추가
		graph.addEgde(1, 3); //노드 1에서 3으로 방향이있는 엣지를 추가
		graph.addEgde(2, 4); //노드 2에서 4로 방향이있는 엣지를 추가
		
		System.out.println("DFS 탐색 결과 : ");
		graph.DFS(0);//DFS 탐색을 시작할 노드의 번호를 전달
	}

}
