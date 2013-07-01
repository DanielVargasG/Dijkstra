package de.bwvaachen.graph.logic.algorithm.dijkstra;

import javax.swing.JPanel;

import de.bwvaachen.graph.logic.Graph;
import de.bwvaachen.graph.logic.algorithm.AlgorithmVisualatorProvider;
import de.bwvaachen.graph.logic.algorithm.AlgorithmVisualtorProviderCollector;

public class DijkstraProvider extends AlgorithmVisualatorProvider {

	static DijkstraProvider provider=new DijkstraProvider();
	
	public JPanel createVisualation(Graph graph) {
		DijkstraVisualisation dijkstraVisualisation=null;
		try{
			dijkstraVisualisation=new DijkstraVisualisation(graph);
		}
		catch(Exception ex)
		{
			
		}
		return dijkstraVisualisation;
	}

	@Override
	public String getName() {
		return "Dijkstra";
	}

}
