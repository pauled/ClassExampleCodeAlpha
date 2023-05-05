package week13.jessesway3pm;

public class FlightCost implements FlightData {

    @Override
    public double getData(Flight flight) {
        return flight.getCost();
    }

}
