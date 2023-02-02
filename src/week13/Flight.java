package week13;

public class Flight<T>{
    private T start;
    private T end;
    private double cost;
    private int distance;
    private double time;

    public Flight(T start, T end, double cost, int distance, double time){
        this.start=start;
        this.end=end;
        this.cost=cost;
        this.distance=distance;
        this.time=time;
    }
    public double getCost(){
        return this.cost;
    }
    public T getStart(){
        return this.start;
    }
    public T getEnd(){
        return this.end;
    }
}
