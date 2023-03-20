package week8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static ArrayList<String> readFile(String filename) {
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static HashMap<String, ArrayList<City>> loadCountries(){
        HashMap<String, ArrayList<City>> countries = new HashMap<>();
        ArrayList<String> lines = readFile("data/cities.csv");
        lines.remove(0);
        for (String line : lines) {
            ArrayList<String> splits = new ArrayList<>(Arrays.asList(line.split(",")));

            String country = splits.get(0);
            String name = splits.get(1);
            String region = splits.get(2);
            int population = Integer.parseInt(splits.get(3));
            double latitude = Double.parseDouble(splits.get(4));
            double longitude = Double.parseDouble(splits.get(5));
            Location location = new Location(latitude, longitude);
            City city = new City(name, region, country, population, location);
            if(!countries.containsKey(country)){
                countries.put(country, new ArrayList<>());
            }
            countries.get(country).add(city);
        }
        return countries;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<City>> countries = loadCountries();
        int threshold = 5;
        for(String country : countries.keySet()){

        }

    }

}
