package week13;

public class Flight<T> extends Edge<T>{
    private double price;
    private int distance;
    private double time;

    public Flight(T start, T end, double cost, int distance, double time){
        super(start,end);
        this.price =cost;
        this.distance=distance;
        this.time=time;
    }
    public double getPrice(){
        return this.price;
    }
    public double getTime(){
        return this.time;
    }
    public int getDistance(){
        return this.distance;
    }
}
