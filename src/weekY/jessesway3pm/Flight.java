package weekY.jessesway3pm;

public class Flight {

    private final String from;
    private final String to;
    private final double cost;
    private final double distance;
    private final double time;

    public Flight(String from, String to, double cost, double distance, double time) {
        this.from = from;
        this.to = to;
        this.cost = cost;
        this.distance = distance;
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getCost() {
        return cost;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }
}
