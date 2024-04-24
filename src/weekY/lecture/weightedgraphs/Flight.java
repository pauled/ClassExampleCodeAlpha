package weekY.lecture.weightedgraphs;

public class Flight {

    private final String from;
    private final String to;
    private final double price;
    private final double distance;
    private final double duration;

    public Flight(String from, String to, double price, double distance, double duration) {
        this.from = from;
        this.to = to;
        this.price = price;
        this.distance = distance;
        this.duration = duration;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getPrice() {
        return price;
    }

    public double getDistance() {
        return distance;
    }

    public double getDuration() {
        return duration;
    }
}
