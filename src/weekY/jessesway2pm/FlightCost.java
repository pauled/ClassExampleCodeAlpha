package weekY.jessesway2pm;

public class FlightCost implements FlightData {

    @Override
    public double getData(Flight flight) {
        return flight.getCost();
    }
}
