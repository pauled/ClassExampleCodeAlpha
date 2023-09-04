package weekY.jessesway1pm;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestGraph {

    private ArrayList<Flight> flights = null;

    private ArrayList<Flight> getFlights() {
        if(this.flights == null){
            this.flights = new ArrayList<>();
            this.flights.add(new Flight("BUF", "WDC", 199, 350, 3.5));
            this.flights.add(new Flight("TOR", "BUF", 329, 380, 3.0));
            this.flights.add(new Flight("BUF", "TOR", 495, 220, 2.5));
            this.flights.add(new Flight("JFK", "BUF", 129, 450, 7.5));
            this.flights.add(new Flight("WDC", "JFK", 147, 500, 3.2)); // 6.7
            this.flights.add(new Flight("WDC", "BUF", 592, 370, 3.5)); // 1.5
            this.flights.add(new Flight("JFK", "TOR", 400, 350, 1.5)); // 8.2
        }
        return this.flights;
    }

    private Graph<String> generateGraph(FlightData flightData){
        ArrayList<Flight> flights = getFlights();
        Graph<String> graph = new Graph<>();
        for (Flight flight : flights) {
            graph.addEdge(flight.getStart(), flight.getEnd(), flightData.getData(flight));
        }
        return graph;
    }

    private void checkGraph(Graph<String> graph, Map<List<String>, Double> testCases){
        double epsilon = 0.001;
        for (List<String> input : testCases.keySet()) {
            double expected = testCases.get(input);
            double actual = graph.costOfPath(input);
            assertEquals(input.toString(), expected, actual, epsilon);
        }
    }


    @Test
    public void testPathWeightCost() {
        Graph<String> priceGraph = generateGraph(new FlightPrice());

        Map<List<String>, Double> testCases = new HashMap<>(Map.ofEntries(
                Map.entry(Arrays.asList("BUF", "WDC", "JFK"), 346.0),
                Map.entry(Arrays.asList("BUF", "WDC", "JFK", "TOR"), 746.0)
        ));

        checkGraph(priceGraph, testCases);
    }

    @Test
    public void testPathWeightDistance() {
        Graph<String> distanceGraph = generateGraph(new FlightDistance());

        Map<List<String>, Double> testCases = new HashMap<>(Map.ofEntries(
                Map.entry(Arrays.asList("JFK", "BUF"), 450.0),
                Map.entry(Arrays.asList("JFK", "TOR", "BUF"), 730.0)
        ));

        checkGraph(distanceGraph, testCases);
    }

    @Test
    public void testPathWeightTime() {
        Graph<String> timeGraph = generateGraph(new FlightTime());

        Map<List<String>, Double> testCases = new HashMap<>(Map.ofEntries(
                Map.entry(Arrays.asList("BUF", "WDC", "BUF"), 7.0),
                Map.entry(Arrays.asList("BUF", "WDC", "JFK", "TOR"), 8.2)
        ));

        checkGraph(timeGraph, testCases);
    }

    @Test
    public void testTotalOutgoingPrice() {
        Graph<String> priceGraph = generateGraph(new FlightPrice());

        Map<String, Double> testCases = new HashMap<>(Map.ofEntries(
                Map.entry("BUF", 694.0),
                Map.entry("JFK", 529.0),
                Map.entry("TOR", 329.0)
        ));

        double epsilon = 0.001;
        for (String input : testCases.keySet()) {
            double expected = testCases.get(input);
            double actual = priceGraph.totalOutgoingWeight(input);
            assertEquals(expected, actual, epsilon);
        }
    }

}
