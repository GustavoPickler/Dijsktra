package com.graphs.model;

import java.util.List;

public class Node {
	
	private int number;
	private List<Edge> edges;
	
	
	public Node() {
	}
	
	public Node(int number) {
		this.number = number;
	}

	public Node(int number, List<Edge> edges) {
		this.number = number;
		this.edges = edges;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
	

}
