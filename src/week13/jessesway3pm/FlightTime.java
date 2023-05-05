package week13.jessesway3pm;

public class FlightTime implements FlightData {

    @Override
    public double getData(Flight flight) {
        return flight.getTime();
    }

}
