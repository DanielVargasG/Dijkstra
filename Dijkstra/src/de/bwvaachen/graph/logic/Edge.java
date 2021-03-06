package de.bwvaachen.graph.logic;

public class Edge {

	private double weight;

	public Number getWeight() {
		if(weight==(int)weight)
			return new Integer((int)weight);
		return weight;
	}

	public void setWeight(double weight) {
		if ( weight < 0)
			throw new IllegalArgumentException();
		this.weight = weight;
	}

	public Edge() {
	}

	public Edge(Number weight) {
		setWeight(weight.doubleValue());
	}

	public Edge(Edge edge) {
		weight = edge.getWeight().doubleValue();
	}
}
