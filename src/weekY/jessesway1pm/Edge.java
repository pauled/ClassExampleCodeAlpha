package weekY.jessesway1pm;

public class Edge<T> {

    private final T destination;
    private final double weight;

    public Edge(T to, double weight) {
        this.destination = to;
        this.weight = weight;
    }

    public T getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }
}
