package week10.lecturetwopointoh;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TestCityReader {

    private void compareCountyMaps(HashMap<String, Integer> expected, HashMap<String, Integer> actual) {
        assertEquals(expected.size(), actual.size());

        for(String expectedKey: expected.keySet()){
            assertTrue(actual.containsKey(expectedKey));
            assertEquals(expected.get(expectedKey), actual.get(expectedKey));
        }
    }


    private void compareCities(City expected, City actual){
        assertEquals(expected.getCountryCode(), actual.getCountryCode());
        assertEquals(expected.getCityName(), actual.getCityName());
        assertEquals(expected.getRegion(), actual.getRegion());
        assertEquals(expected.getPopulation(), actual.getPopulation());
        assertEquals(expected.getLatitude(), actual.getLatitude(), 0.001);
        assertEquals(expected.getLongitude(), actual.getLongitude(), 0.001);
    }

    @Test
    public void testCityReader0(){
        String filename = "data/city_test_0.csv";
        ArrayList<City> actual = CityReader.readCities(filename);

        assertTrue(actual.isEmpty());
    }

    @Test
    public void testCityReader1(){
        String filename = "data/city_test_1.csv";
        ArrayList<City> actual = CityReader.readCities(filename);
//ad,la massana,04,7211,42.55,1.5166667

        assertEquals(1, actual.size());
        City actualCity = actual.get(0);
        City expectedCity = new City("ad","la massana","04",7211,42.55,1.5166667);

        compareCities(expectedCity, actualCity);
    }

    @Test
    public void testCountryPopulation0(){
        String filename = "data/city_test_0.csv";
        HashMap<String, Integer> actual = CityReader.countryPopulations(filename);

        HashMap<String, Integer> expected = new HashMap<>();

        compareCountyMaps(expected, actual);
    }

    @Test
    public void testCountryPopulation1(){
        String filename = "data/city_test_1.csv";
        HashMap<String, Integer> actual = CityReader.countryPopulations(filename);
//ad,la massana,04,7211,42.55,1.5166667

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("ad", 7211);

        compareCountyMaps(expected, actual);
    }

    @Test
    public void testCountryPopulation2(){
        String filename = "data/city_test_2.csv";
        HashMap<String, Integer> actual = CityReader.countryPopulations(filename);

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("us", 33082);
        expected.put("br", 142024);
        expected.put("be", 203979);

//        us	33082
//        br	142024
//        be	203979

        compareCountyMaps(expected, actual);
    }




}
