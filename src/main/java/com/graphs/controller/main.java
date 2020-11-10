package com.graphs.controller;

import com.graphs.model.Node;

import java.util.Arrays;
import java.util.List;

import com.graphs.model.Edge;;

public class main {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		//Relacionando os nós aos seus numeros
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		Node node12 = new Node(12);
		Node node13 = new Node(13);
		Node node14 = new Node(14);
		Node node15 = new Node(15);
		Node node16 = new Node(16);
		Node node17 = new Node(17);
		Node node18 = new Node(18);
		Node node19 = new Node(19);
		Node node20 = new Node(20);

		//Setando os valores dos caminhos e relacionando com os nós 
		node1.setEdges(Arrays.asList(new Edge(861, node4), new Edge(211, node6), new Edge(586, node10), new Edge(753, node12),new Edge(382, node13), new Edge(896, node14)));
		node2.setEdges(Arrays.asList(new Edge(423, node3), new Edge(617, node4), new Edge(365, node5), new Edge(357, node10),
				new Edge(806, node13)));
		node3.setEdges(Arrays.asList(new Edge(423, node2), new Edge(554, node4), new Edge(359, node5), new Edge(306, node10)));
		node4.setEdges(Arrays.asList(new Edge(861, node1), new Edge(617, node2), new Edge(554, node3), new Edge(656, node10)));
		node5.setEdges(Arrays.asList(new Edge(365, node2), new Edge(359, node3)));
		node6.setEdges(Arrays.asList(new Edge(211, node1), new Edge(988, node7), new Edge(293, node9), new Edge(102, node10),
				new Edge(870, node12), new Edge(399, node13)));
		node7.setEdges(Arrays.asList(new Edge(988, node6), new Edge(228, node8), new Edge(43, node9), new Edge(573, node11),
				new Edge(663, node12)));
		node8.setEdges(Arrays.asList(new Edge(228, node7), new Edge(801, node9), new Edge(31, node11)));
		node9.setEdges(Arrays.asList(new Edge(293, node6), new Edge(43, node7), new Edge(801, node8), new Edge(724, node10),
				new Edge(927, node11), new Edge(936, node12), new Edge(696, node15)));
		node10.setEdges(Arrays.asList(new Edge(586, node1), new Edge(357, node2), new Edge(306, node3), new Edge(656, node4),
				new Edge(102, node6), new Edge(723, node9), new Edge(736, node12), new Edge(672, node13),
				new Edge(804, node14)));
		node11.setEdges(Arrays.asList(new Edge(573, node7), new Edge(31, node8), new Edge(927, node9), new Edge(736, node12),
				new Edge(672, node13), new Edge(804, node14)));
		node12.setEdges(Arrays.asList(new Edge(753, node1), new Edge(870, node6), new Edge(663, node7), new Edge(936, node9),
				new Edge(736, node10), new Edge(634, node11), new Edge(884, node13), new Edge(71, node14),
				new Edge(798, node15)));
		node13.setEdges(Arrays.asList(new Edge(382, node1), new Edge(806, node2), new Edge(399, node6), new Edge(672, node10),
				new Edge(844, node12), new Edge(21, node14), new Edge(299, node16)));
		node14.setEdges(Arrays.asList(new Edge(896, node1), new Edge(804, node10), new Edge(71, node12), new Edge(21, node13),
				new Edge(244, node15), new Edge(447, node16), new Edge(726, node17)));
		node15.setEdges(Arrays.asList(new Edge(696, node9), new Edge(927, node11), new Edge(798, node12),
				new Edge(244, node14), new Edge(387, node17)));
		node16.setEdges(Arrays.asList(new Edge(299, node13), new Edge(447, node14), new Edge(503, node17),
				new Edge(113, node18), new Edge(431, node19)));
		node17.setEdges(Arrays.asList(new Edge(713, node12), new Edge(726, node14), new Edge(387, node15),
				new Edge(503, node16), new Edge(916, node18), new Edge(490, node19)));
		node18.setEdges(Arrays.asList(new Edge(113, node16), new Edge(916, node17), new Edge(980, node19),
				new Edge(326, node20)));
		node19.setEdges(Arrays.asList(new Edge(431, node16), new Edge(490, node17), new Edge(980, node18),
				new Edge(455, node20)));
		node20.setEdges(Arrays.asList(new Edge(326, node18), new Edge(455, node19)));

		
		Node de = node1;
		Node para = node20;
		boolean chegou = false;
		int menorDist = 0;
		int somaMenorCaminho = 0;
		Node nodeAtual = new Node();
		List<Node> nodesPercorridos = null;
		List<Node> historico = null;

		//while (chegou) { 
			
			menorDist = pegaMenorDistancia(de, menorDist);
			nodeAtual = vaiParaNodeMenor(de, menorDist);
			nodesPercorridos.add(nodeAtual);
			
			historico = guardaVizinhos(nodeAtual);
			if(menorDist = pegaMenorDistancia(nodeAtual, menorDist) > );
		
			
			
		//}
	}

	// Pega o nó inicial e pega o caminho com menor distancia
	private static Node vaiParaNodeMenor(Node de, int menorDist) {
		Node nodeAtual = null;
		for (int i = 0; i < de.getEdges().size(); i++) {
			if (de.getEdges().get(i).getValue() <= menorDist) {
				nodeAtual = de.getEdges().get(i).getNode();
			}
		}
		return nodeAtual;
	} 
	
	// Escolhe o nó com o caminho de menor distancia
	private static int pegaMenorDistancia(Node de, int menorDist) {
		for (int i = 0; i < de.getEdges().size(); i++) {
			if (menorDist == 0) {
				menorDist = de.getEdges().get(i).getValue();
			}
			if (de.getEdges().get(i).getValue() <= menorDist) {
				menorDist = de.getEdges().get(i).getValue();
			}
		}
		return menorDist;
	}

	// Guarda os vizinho para retornar se o valor deles for menor que o caminho percorrido.
	public static List<Node> guardaVizinhos(Node node) {
		List<Node> nodes = null;
		for (int i = 0; i < node.getEdges().size(); i++) {
			nodes.add(node.getEdges().get(i).getNode());
		}
		return nodes;
	}

}
