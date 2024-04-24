package weekY.lecture.weightedgraphs;

public class CostExtractor implements FlightDataExtractor{

    @Override
    public double getData(Flight flight) {
        return flight.getPrice();
    }

}
