package week11.example2;

public class City {

    private final String name;
    private final String region;
    private final String country;
    private final int population;
    private final Location location;

    public City(String country, String region, String name, int population, Location location) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public Location getLocation() {
        return location;
    }

}
