package week10.lecturetwopointoh;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class CityReader {

    public static ArrayList<String> readFile(String filename) {
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static ArrayList<City> readCities(String filename){
        // us,buffalo,NY,279557,42.8863889,-78.8786111
        ArrayList<City> cities = new ArrayList<>();
        for(String line: readFile(filename)){
            ArrayList<String> splits = new ArrayList<>(Arrays.asList(line.split(",")));
            String countryCode = splits.get(0);
            String cityName = splits.get(1);
            String region = splits.get(2);
            int population = Integer.parseInt(splits.get(3));
            double latitude = Double.parseDouble(splits.get(4));
            double longitude = Double.parseDouble(splits.get(5));

            City city = new City(countryCode, cityName, region, population, latitude, longitude);

            cities.add(city);
        }

        return cities;
    }

}
