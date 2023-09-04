package weekY;

public class FlightPrice  implements Cost<Flight>{
    public double cost(Flight flight){
        return (double)flight.getPrice();
    }
}