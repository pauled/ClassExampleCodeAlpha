package weekY.lecture.weightedgraphs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestWeightedGraph {

    private WeightedGraph<String> generateGraph(List<Flight> flights, FlightDataExtractor dataExtractor){
        WeightedGraph<String> graph = new WeightedGraph<>();

        for(Flight flight : flights){
            graph.addEdge(flight.getFrom(), flight.getTo(), dataExtractor.getData(flight));
        }

        return graph;
    }

    @Test
    public void testTheGraph(){
        WeightedGraph<String> graph = new WeightedGraph<>();
        graph.addEdge("BUF", "WDC", 199.0);
        graph.addEdge("TOR", "BUF", 329.0);
        graph.addEdge("BUF", "TOR", 495.0);

        double actual = graph.pathWeight(Arrays.asList("TOR", "BUF", "WDC"));
        double expected = 528.0;

        assertEquals(expected, actual, 0.001);

        assertEquals(0.0, graph.pathWeight(Arrays.asList("TOR", "BUF", "WfgdfgDC")), 0.001);

//       "BUF", "WDC", 199, 350, 3.5));
//       "TOR", "BUF", 329, 380, 3.0));
//       "BUF", "TOR", 495, 220, 2.5));
//       "JFK", "BUF", 129, 450, 7.5));
//       "WDC", "JFK", 147, 500, 3.2));
//       "WDC", "BUF", 592, 370, 3.5));
//       "JFK", "TOR", 400, 350, 1.5));
        
    }



    @Test
    public void fullFlightsTest(){

        List<Flight> flights = new ArrayList<>(Arrays.asList(
                new Flight("BUF", "WDC", 199, 350, 3.5),
                new Flight("TOR", "BUF", 329, 380, 3.0),
                new Flight("BUF", "TOR", 495, 220, 2.5),
                new Flight("JFK", "BUF", 129, 450, 7.5),
                new Flight("WDC", "JFK", 147, 500, 3.2),
                new Flight("WDC", "BUF", 592, 370, 3.5),
                new Flight("JFK", "TOR", 400, 350, 1.5)
        ));

        WeightedGraph<String> costGraph = generateGraph(flights, new CostExtractor());

        WeightedGraph<String> distanceGraph = generateGraph(flights, Flight::getDistance);

        WeightedGraph<String> durationGraph = generateGraph(flights, Flight::getDuration);

        WeightedGraph<String> speedPerDollarGraph = generateGraph(flights, new SpeedPerDollarExtractor());




    }
    
}
