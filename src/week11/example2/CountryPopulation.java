package week11.example2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountryPopulation {

    /**
     * Returns the total population of all cities in the given country
     */
    public static int countryPopulation(String filename, String country){
        HashMap<String, ArrayList<City>> countries = loadCountries(filename);
        if(countries.containsKey(country)){
            int population = 0;
            for(City city : countries.get(country)){
                population += city.getPopulation();
            }
            return population;
        }else{
            return 0;
        }
    }

    public static HashMap<String, ArrayList<City>> loadCountries(String filename){
        HashMap<String, ArrayList<City>> countries = new HashMap<>();
        ArrayList<String> lines = readFile(filename);
        lines.remove(0); // remove the header
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
            if(!countries.containsKey(city.getCountry())){
                countries.put(city.getCountry(), new ArrayList<>());
            }
            countries.get(city.getCountry()).add(city);
        }
        return countries;
    }

    public static ArrayList<String> readFile(String filename) {
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

}
