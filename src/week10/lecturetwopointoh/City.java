package week10.lecturetwopointoh;

public class City {
    // us,buffalo,NY,279557,42.8863889,-78.8786111

    private String countryCode;
    private String cityName;
    private String region;
    private int population;
    private double latitude;
    private double longitude;

    public City(String countryCode, String cityName, String region, int population, double latitude, double longitude) {
        this.countryCode = countryCode;
        this.cityName = cityName;
        this.region = region;
        this.population = population;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
