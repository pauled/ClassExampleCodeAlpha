package week13.jessesway1pm;

public class Flight {
    private final String start;
    private final String end;
    private final double price;
    private final int distance;
    private final double time;

    public Flight(String start, String end, double cost, int distance, double time) {
        this.start = start;
        this.end = end;
        this.price = cost;
        this.distance = distance;
        this.time = time;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public double getPrice() {
        return this.price;
    }

    public double getTime() {
        return this.time;
    }

    public int getDistance() {
        return this.distance;
    }
}
