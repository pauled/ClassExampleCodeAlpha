package week13.jessesway1pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<T> {

    private HashMap<T, ArrayList<Edge<T>>> adjacencyList = new HashMap<>();


    public void addEdge(T from, T to, double weight) {
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(new Edge<>(to, weight));
    }

    private void addNode(T a) {
        if (!this.adjacencyList.containsKey(a)) {
            this.adjacencyList.put(a, new ArrayList<>());
        }
    }

    private double costOfPath(ArrayList<T> path) {
        double cost = 0.0;
        for (int i = 0; i < path.size() - 1; i++) {
            T from = path.get(i);
            T to = path.get(i+1);
            if(!this.adjacencyList.containsKey(from)){
                return 0.0;
            }
            ArrayList<Edge<T>> destinations = this.adjacencyList.get(from);
            boolean foundFlag = false;
            for(Edge<T> edge : destinations){
                if(edge.getDestination().equals(to)){
                    cost += edge.getWeight();
                    foundFlag = true;
                    break;
                }
            }
            if(!foundFlag) {
                return 0.0;
            }
        }
        return cost;
    }

    public static void main(String[] args) {

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("BUF", "WDC", 199, 350, 3.5));
        flights.add(new Flight("TOR", "BUF", 329, 380, 3.0));
        flights.add(new Flight("BUF", "TOR", 495, 220, 2.5));
        flights.add(new Flight("JFK", "BUF", 129, 450, 7.5));
        flights.add(new Flight("WDC", "JFK", 147, 500, 3.2));
        flights.add(new Flight("WDC", "BUF", 592, 370, 3.5));
        flights.add(new Flight("JFK", "TOR", 400, 350, 1.5));


        Graph<String> timeGraph = new Graph<>();
        for (Flight flight : flights) {
            timeGraph.addEdge(flight.getStart(), flight.getEnd(), flight.getTime());
        }

        Graph<String> priceGraph = new Graph<>();
        for (Flight flight : flights) {
            priceGraph.addEdge(flight.getStart(), flight.getEnd(), flight.getPrice());
        }

        Graph<String> distanceGraph = new Graph<>();
        for (Flight flight : flights) {
            distanceGraph.addEdge(flight.getStart(), flight.getEnd(), flight.getDistance());
        }


        ArrayList<String> path = new ArrayList<>(Arrays.asList("BUF", "WDC", "JFK"));
        ArrayList<String> path2 = new ArrayList<>(Arrays.asList("BUF", "WDC", "JFK", "TOR"));

        double distPath = priceGraph.costOfPath(path);
        System.out.println(distPath); // expect 199 + 147 = 346
        double distPath2 = priceGraph.costOfPath(path2);
        System.out.println(distPath2); // expect 346 + 400 = 746


//        System.out.println(graph.mostIncomingConnections());
    }

}
