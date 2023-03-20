package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {

    private HashMap<N, ArrayList<Flight>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(Flight<N> flight) {
        N from=flight.getStart();
        N to=flight.getEnd();
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(flight);
    }

    private void addNode(N a) {
        if (!this.adjacencyList.containsKey(a)) {
            this.adjacencyList.put(a, new ArrayList<>());
        }
    }

    public boolean areConnected(N from, N to){
        return this.adjacencyList.containsKey(from) && this.adjacencyList.get(from).contains(to);
    }

    public boolean validPath(ArrayList<N> path) {
        for (int i=0; i < path.size()-1; i++) {
            N from = path.get(i);
            N to = path.get(i+1);
            if (!this.areConnected(from, to)) {
                return false;
            }
        }
        return true;
    }
    //cost of path
    ////flight has to have cost

    public N mostIncomingConnections(){
        HashMap<N, Integer> incoming = new HashMap<>();
        for(ArrayList<Flight> flights : this.adjacencyList.values()){
            for(Flight<N> to: flights){
                if(!incoming.containsKey(to.getEnd())){
                    incoming.put(to.getEnd(), 1);
                }else {
                    incoming.put(to.getEnd(), incoming.get(to) +1 );
                }
            }
        }
        int max = -1;
        N bestNode = null;
        for(N node: incoming.keySet()){
            int count = incoming.get(node);
            if(count > max){
                max = count;
                bestNode = node;
            }
        }
        return bestNode;
    }

    @Override
    public String toString() {
        return this.adjacencyList.toString();
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        ArrayList<Flight<String>> flights=new ArrayList<>();
        flights.add(new Flight<>("BUF", "WDC",199,350,3.5));
        flights.add(new Flight<>("TOR", "BUF",329,380,3.0));
        flights.add(new Flight<>("BUF", "TOR",495,220,2.5));
        flights.add(new Flight<>("JFK", "BUF",129,450,7.5));
        flights.add(new Flight<>("WDC", "JFK",147,500,3.2));
        flights.add(new Flight<>("WDC", "BUF",592,370,3.5));
        for (int x =0;x<flights.size();x++){
            graph.addEdge(flights.get(x));
        }
        System.out.println(graph);

        ArrayList<String> path = new ArrayList<>(Arrays.asList("BUF", "WDC", "JFK"));
        System.out.println(graph.validPath(path));

        ArrayList<String> path2 = new ArrayList<>(Arrays.asList("BUF", "WDC", "JFK", "TOR"));
        System.out.println(graph.validPath(path2));

        ArrayList<String> path3 = new ArrayList<>(Arrays.asList("BUFFALO", "WDC", "JFK", "TOR"));
        System.out.println(graph.validPath(path3));

        System.out.println(graph.mostIncomingConnections());
    }

}
