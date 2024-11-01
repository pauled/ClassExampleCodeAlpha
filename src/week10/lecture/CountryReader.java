package week10.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class CountryReader {

    public static ArrayList<String> readFile(String filename) {
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    /**
     * Reads a file of cities and return all the data in an ArrayList of City objects
     *
     * @param filename the filename
     * @return the cities
     */
    public static ArrayList<City> readCities(String filename){
        ArrayList<City> cities = new ArrayList<>();

        for(String line : readFile(filename)){
            // ad,la massana,04,7211,42.55,1.5166667
            ArrayList<String> splits = new ArrayList<>(Arrays.asList(line.split(",")));
            String countryCode = splits.get(0);
            String cityName = splits.get(1);
            String region = splits.get(2);
            int poplation = Integer.parseInt(splits.get(3));
            double latitude = Double.parseDouble(splits.get(4));
            double longitude = Double.parseDouble(splits.get(5));

            City city = new City(countryCode, cityName, region, poplation, latitude, longitude);

            cities.add(city);
        }

        return cities;
    }


}
