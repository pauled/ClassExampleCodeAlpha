package weekY;

public class Edge<T>{
    protected T start;
    protected T end;

    public Edge(T start, T end){
        this.start=start;
        this.end=end;
    }
    public T getStart(){
        return this.start;
    }
    public T getEnd(){
        return this.end;
    }
}
