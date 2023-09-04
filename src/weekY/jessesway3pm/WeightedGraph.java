package weekY.jessesway3pm;

import java.util.*;

public class WeightedGraph<T> {

    private final Map<T, Map<T, Double>> adjacencyList = new HashMap<>();

    public void addEdge(T from, T to, double weight) {
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).put(to, weight);
    }

    private void addNode(T a) {
        if (!this.adjacencyList.containsKey(a)) {
            this.adjacencyList.put(a, new HashMap<>());
        }
    }

    public double costOfPath(List<T> path) {
        double totalCost = 0.0;
        for (int i = 0; i < path.size() - 1; i++) {
            T from = path.get(i);
            T to = path.get(i + 1);
            if(!this.adjacencyList.containsKey(from)){
                return 0.0;
            }
            Map<T, Double> destinations = this.adjacencyList.get(from);
            if(!destinations.containsKey(to)){
                return 0.0;
            }
            totalCost += destinations.get(to);
        }
        return totalCost;
    }


    public double totalCost(T node){
        double total = 0.0;
        for(double cost : this.adjacencyList.getOrDefault(node, new HashMap<>()).values()){
            total += cost;
        }
        return total;
    }
}
