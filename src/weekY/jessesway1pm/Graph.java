package weekY.jessesway1pm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph<T> {

    private final HashMap<T, ArrayList<Edge<T>>> adjacencyList = new HashMap<>();


    public void addEdge(T from, T to, double weight) {
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(new Edge<>(to, weight));
    }

    private void addNode(T a) {
        if (!this.adjacencyList.containsKey(a)) {
            this.adjacencyList.put(a, new ArrayList<>());
        }
    }

    public double costOfPath(List<T> path) {
        double cost = 0.0;
        for (int i = 0; i < path.size() - 1; i++) {
            T from = path.get(i);
            T to = path.get(i+1);
            if(!this.adjacencyList.containsKey(from)){
                return 0.0;
            }
            ArrayList<Edge<T>> destinations = this.adjacencyList.get(from);
            boolean foundFlag = false;
            for(Edge<T> edge : destinations){
                if(edge.getDestination().equals(to)){
                    cost += edge.getWeight();
                    foundFlag = true;
                    break;
                }
            }
            if(!foundFlag) {
                return 0.0;
            }
        }
        return cost;
    }


    public double totalOutgoingWeight(T node){
        double total = 0.0;
        ArrayList<Edge<T>> destinations = this.adjacencyList.getOrDefault(node, new ArrayList<>());
        for(Edge<T> edge : destinations){
            total += edge.getWeight();
        }

        return total;
    }

}
