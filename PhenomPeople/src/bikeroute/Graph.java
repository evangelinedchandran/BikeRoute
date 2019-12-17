package bikeroute;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	int vertices;
	LinkedList<Edge>[] adjacencylist;

	Graph(int vertices) {
		this.vertices = vertices;
		adjacencylist = new LinkedList[vertices];
		// initialize adjacency lists for all the vertices
		for (int i = 0; i < vertices; i++) {
			adjacencylist[i] = new LinkedList<>();
		}
	}
	
	static class Edge {
		int source;
		int destination;
		int weight;

		public Edge(int source, int destination, int weight) {
			this.source = source;
			this.destination = destination;
			this.weight = weight;
		}
	}

	public void addEdge(char source, char destination, int weight) {
		Edge edge = new Edge(source, destination, weight);
		adjacencylist[source].addFirst(edge); // for directed graph
	}
	
	public void constructGraph(LinkedList<String> input) {
		Graph map = new Graph(input.size());
		Iterator<String> it = input.iterator();
		while (it.hasNext()) {
			String s = it.next();
			map.addEdge(s.charAt(0), s.charAt(1), s.charAt(2));
		}
	}

	public void printGraph() {
		for (int i = 0; i < vertices; i++) {
			LinkedList<Edge> list = adjacencylist[i];
			for (int j = 0; j < list.size(); j++) {
				System.out.println("vertex-" + i + " is connected to " 
						+ list.get(j).destination + " with weight "
						+ list.get(j).weight);
			}
		}
	}
	
	public String calculateRouteDistance(String input) {
		int distance = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < adjacencylist.length; j++) {
				LinkedList<Edge> list = adjacencylist[i];
				if (list.getFirst().source == input.charAt(i)) {
					if (list.getFirst().destination == input.charAt(i + 1)) {
						distance += list.getFirst().weight;
					}
				}
				else {
					return "NO ROUTE EXISTS";
				}
			}
		}
		return Integer.toString(distance);
	}

	public int calculateMaxHops(String input) {
		for (int i = 0; i < input.length(); i++) {

		}
		return 0;
	}

	public int calculateHops(String input) {
		for (int i = 0; i < input.length(); i++) {

		}
		return 0;
	}

	public int calculateNumberOfTripsWithHopLimit(char source, char dest, int limit) {
		int count = 0;
		while (count <= limit) {
			
			count++;
		}
		return 0;
	}

	public int calculateNumberOfTripsWithExactHops(char source, char dest, int limit) {
		int count = 0;
		while (count != limit) {
			
			count++;
		}
		return 0;
	}
	
	public int calculateShortestRouteLength(char source, char dest) {
		
		return 0;
	}
	
	public int calculateNumberOfRoutesWithinDistance(char source, char dest, int limit) {
		int distance = 0;
		while (distance <= limit) {
			
		}
		return 0;
	}
}