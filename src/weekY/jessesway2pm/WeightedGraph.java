package weekY.jessesway2pm;

import java.util.*;

public class WeightedGraph<N> {

    private final Map<N, Map<N, Double>> adjacencyList = new HashMap<>();

    public void addEdge(N from, N to, double weight) {
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).put(to, weight);
    }

    private void addNode(N a) {
        if (!this.adjacencyList.containsKey(a)) {
            this.adjacencyList.put(a, new HashMap<>());
        }
    }


    public double costOfPath(List<N> path) {
        double totalCost = 0.0;
        for(int i=0; i<path.size()-1; i++){
            N from = path.get(i);
            N to = path.get(i+1);
            if(!this.adjacencyList.containsKey(from)){
                return 0.0;
            }
            Map<N, Double> destinations = this.adjacencyList.get(from);
            if(!destinations.containsKey(to)){
                return 0.0;
            }
            double flightCost = destinations.get(to);
            totalCost += flightCost;
        }
        return totalCost;
    }

    public double totalOutgoingWeight(N node){
        double totalWeight = 0.0;
        for(double weight : this.adjacencyList.getOrDefault(node, new HashMap<>()).values()){
            totalWeight += weight;
        }
        return totalWeight;
    }

}
