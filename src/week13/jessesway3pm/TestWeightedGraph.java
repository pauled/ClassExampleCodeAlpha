package week13.jessesway3pm;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestWeightedGraph {

    private List<Flight> flights = null;

    private List<Flight> getFlights() {
        if (this.flights == null) {
            this.flights = new ArrayList<>();
            this.flights.add(new Flight("BUF", "WDC", 199, 350, 3.5));
            this.flights.add(new Flight("TOR", "BUF", 329, 380, 3.0));
            this.flights.add(new Flight("BUF", "TOR", 495, 220, 2.5));
            this.flights.add(new Flight("JFK", "BUF", 129, 450, 7.5));
            this.flights.add(new Flight("WDC", "JFK", 147, 500, 3.2));
            this.flights.add(new Flight("WDC", "BUF", 592, 370, 3.5));
            this.flights.add(new Flight("JFK", "TOR", 400, 350, 1.5));
        }
        return this.flights;
    }

    private WeightedGraph<String> generateGraph(FlightData flightData) {
        WeightedGraph<String> graph = new WeightedGraph<>();
        for (Flight flight : getFlights()) {
            graph.addEdge(flight.getFrom(), flight.getTo(), flightData.getData(flight));
        }
        return graph;
    }

    private void runTestCases(Map<List<String>, Double> testCases, FlightData flightData) {
        double epsilon = 0.001;
        WeightedGraph<String> graph = generateGraph(flightData);
        for (List<String> input : testCases.keySet()) {
            double expected = testCases.get(input);
            double actual = graph.costOfPath(input);
            assertEquals(expected, actual, epsilon);
        }
    }

    @Test
    public void testFlightCost() {
        Map<List<String>, Double> testCases = new HashMap<>(Map.ofEntries(
                Map.entry(Arrays.asList("BUF", "WDC", "JFK"), 346.0),
                Map.entry(Arrays.asList("BUF", "WDC", "JFK", "TOR"), 746.0)
        ));

        runTestCases(testCases, new FlightCost());
    }

    @Test
    public void testFlightDistance() {
        Map<List<String>, Double> testCases = new HashMap<>(Map.ofEntries(
                Map.entry(Arrays.asList("BUF", "WDC", "JFK"), 850.0),
                Map.entry(Arrays.asList("BUF", "WDC"), 350.0)
        ));

        runTestCases(testCases, new FlightDistance());
    }

    @Test
    public void testFlightTime() {
        Map<List<String>, Double> testCases = new HashMap<>(Map.ofEntries(
                Map.entry(Arrays.asList("BUF", "WDC", "JFK"), 6.7),
                Map.entry(Arrays.asList("BUF", "WDC"), 3.5)
        ));

        runTestCases(testCases, new FlightTime());
    }

    @Test
    public void testTotalOutgoingCost() {
        Map<String, Double> testCases = new HashMap<>(Map.ofEntries(
                Map.entry("BUF", 694.0),
                Map.entry("WDC", 739.0)
        ));

        double epsilon = 0.001;
        WeightedGraph<String> graph = generateGraph(new FlightCost());
        for (String input : testCases.keySet()) {
            double expected = testCases.get(input);
            double actual = graph.totalCost(input);
            assertEquals(expected, actual, epsilon);
        }
    }

}
