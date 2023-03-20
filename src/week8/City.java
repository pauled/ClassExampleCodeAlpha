package week8;

public class City {

    private String name;
    private String region;
    private String country;
    private int population;
    private Location location;

    public City(String name, String region, String country, int population, Location location) {
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
