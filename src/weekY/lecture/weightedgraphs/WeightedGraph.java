package weekY.lecture.weightedgraphs;

import java.util.*;

public class WeightedGraph<N> {

    private final Map<N, List<WeightedEdge<N>>> adjacencyList = new HashMap<>();

    public WeightedGraph() {

    }

    public void addEdge(N start, N end, double weight) {
        this.addNode(start);
        this.addNode(end);

        this.adjacencyList.get(start).add(new WeightedEdge<>(end, weight));
    }

    public void addNode(N node) {
        if (!this.adjacencyList.containsKey(node)) {
            this.adjacencyList.put(node, new ArrayList<>());
        }
    }

    // Write a method in this class that will return the weight of a path
    // The weight of a path is the sum of the weights of the edges in the path
    // return 0.0 if the path is not valid
    public double pathWeight(List<N> path) {
        double totalWeight = 0.0;

        outer:
        for (int i = 0; i < path.size() - 1; i++) {
            N from = path.get(i);
            N to = path.get(i + 1);
            if (!this.adjacencyList.containsKey(from)) {
                return 0.0;
            }

            for (WeightedEdge<N> edge : this.adjacencyList.get(from)) {
                if (edge.getNode().equals(to)) {
                    totalWeight += edge.getWeight();
                    continue outer;
                }
            }
            return 0.0;
        }
        return totalWeight;
    }


    // Write a class to represent weighted graphs
    // These graphs will have weights added to each of their edges. Instead of
    // storing lists of edges that exist, we'll also store a weight for each edge
    // as a double


}
