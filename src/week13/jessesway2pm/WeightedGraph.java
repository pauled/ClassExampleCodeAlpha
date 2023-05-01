package week13.jessesway2pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeightedGraph<N> {

    private final Map<N, Map<N, Double>> adjacencyList = new HashMap<>();

    public void addEdge(N from, N to, double weight) {
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).put(to, weight);
    }

    private void addNode(N a) {
        if (!this.adjacencyList.containsKey(a)) {
            this.adjacencyList.put(a, new HashMap<>());
        }
    }


    private double costOfPath(ArrayList<N> path) {
        double totalCost = 0.0;
        for(int i=0; i<path.size()-1; i++){
            N from = path.get(i);
            N to = path.get(i+1);
            if(!this.adjacencyList.containsKey(from)){
                return 0.0;
            }
            Map<N, Double> destinations = this.adjacencyList.get(from);
            if(!destinations.containsKey(to)){
                return 0.0;
            }
            double flightCost = destinations.get(to);
            totalCost += flightCost;
        }
        return totalCost;
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

        WeightedGraph<String> timeGraph = new WeightedGraph<>();
        for(Flight flight: flights){
            timeGraph.addEdge(flight.getFrom(), flight.getTo(), flight.getTime());
        }

        WeightedGraph<String> distanceGraph = new WeightedGraph<>();
        for(Flight flight: flights){
            distanceGraph.addEdge(flight.getFrom(), flight.getTo(), flight.getDistance());
        }

        WeightedGraph<String> priceGraph = new WeightedGraph<>();
        for(Flight flight: flights){
            priceGraph.addEdge(flight.getFrom(), flight.getTo(), flight.getCost());
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
