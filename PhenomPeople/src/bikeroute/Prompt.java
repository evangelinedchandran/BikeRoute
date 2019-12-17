package bikeroute;

import java.util.LinkedList;

public class Prompt {

	LinkedList<String> input = new LinkedList<>();
	
	public void main(LinkedList<String> input) {
		this.input = input;
		//test scenario:
		input.add("AB5");
		input.add("BC4");
		input.add("CD8");
		input.add("DC8");
		input.add("DE6");
		input.add("AD5");
		input.add("CE2");
		input.add("EB3");
		input.add("AE7");
		Graph g = new Graph(input.size());
		g.constructGraph(input);
		System.out.println("1. " + g.calculateRouteDistance("ABC"));
		System.out.println("2. " + g.calculateRouteDistance("AEBCD"));
		System.out.println("3. " + g.calculateRouteDistance("AED"));
		System.out.println("4. " + g.calculateNumberOfTripsWithHopLimit('C', 'C', 3));
		System.out.println("5. " + g.calculateNumberOfTripsWithExactHops('A', 'C', 4));
		System.out.println("6. " + g.calculateShortestRouteLength('A', 'C'));
		System.out.println("7. " + g.calculateShortestRouteLength('B', 'B'));
		System.out.println("8. " + g.calculateNumberOfRoutesWithinDistance('C', 'C', 30));
	}
	
	
	
}
