package com.graphs.model;

public class Edge {
	
	private int value;
	
	private Node node;
	
	public Edge() {
	}

	public Edge(int value, Node node) {
		this.value = value;
		this.node = node;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
	
	
	

}
