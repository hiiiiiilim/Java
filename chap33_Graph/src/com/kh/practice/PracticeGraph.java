package com.kh.practice;

public class PracticeGraph {
	public static void main(String[] args) {
		PracticeGraph ph = new PracticeGraph();
		
		ph.BFSPracticeMain();
	}
	
	public void BFSPracticeMain() {
		//그래프 생성
		BFSGraph bfs = new BFSGraph(6);
		//간선 추가
		bfs.addEgde(0, 1);
		bfs.addEgde(1, 1);
		bfs.addEgde(1, 2);
		bfs.addEgde(0, 3);
		bfs.addEgde(2, 4);
		bfs.addEgde(2, 5);
		System.out.println("BFS 탐색 결과 : ");
		
		bfs.BFS(0);
	}
}
