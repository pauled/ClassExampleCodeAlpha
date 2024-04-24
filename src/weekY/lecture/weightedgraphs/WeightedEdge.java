package weekY.lecture.weightedgraphs;

public class WeightedEdge<N> {

    private final N node;
    private final double weight;

    public WeightedEdge(N node, double weight) {
        this.node = node;
        this.weight = weight;
    }

    public N getNode() {
        return node;
    }

    public double getWeight() {
        return weight;
    }
}
