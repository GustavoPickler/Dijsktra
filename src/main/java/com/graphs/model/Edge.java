package com.graphs.model;

//Classe caminhos
public class Edge {

	private int value; // Cria os métodos set and get para dar valor para o nó

	private Node node; // Cria um atributo da classe Node, com getters e setters

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
