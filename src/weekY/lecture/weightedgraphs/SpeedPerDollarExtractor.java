package weekY.lecture.weightedgraphs;

public class SpeedPerDollarExtractor implements FlightDataExtractor{

    @Override
    public double getData(Flight flight) {
        double d = flight.getDistance();
        double p = flight.getPrice();
        double t = flight.getDuration();
        
        return (d/t)/p;
    }

}
