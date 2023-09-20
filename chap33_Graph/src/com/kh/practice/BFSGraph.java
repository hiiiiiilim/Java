package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	private int V;//그래프 노드의 수
	private LinkedList<Integer>[] adj;
	
	public BFSGraph(int v) {
		this.V = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	//addEgde: 그래프에 새로운 간선을 추가
	public void addEgde(int v, int w) {
		adj[v].add(w);
	}
	
	//BFS 탐색
	public void BFS(int start) {
		boolean[] visited = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		visited[start] = true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
		
	}
	
	
}
