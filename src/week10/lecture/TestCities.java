package week10.lecture;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCities {

    private void compareCities(City expected, City actual){
        assertEquals(expected.getCountryCode(), actual.getCountryCode());
        assertEquals(expected.getCityName(), actual.getCityName());
        assertEquals(expected.getRegion(), actual.getRegion());
        assertEquals(expected.getPopulation(), actual.getPopulation());
        assertEquals(expected.getLatitude(), actual.getLatitude(), 0.001);
        assertEquals(expected.getLongitude(), actual.getLongitude(), 0.001);
    }

    @Test
    public void testCities0(){
        String filename = "data/test_city_0.csv";
        ArrayList<City> actual = CountryReader.readCities(filename);

        assertTrue(actual.isEmpty());
    }

    @Test
    public void testCities1(){
        String filename = "data/test_city_1.csv";
        ArrayList<City> actual = CountryReader.readCities(filename);

        // ad,la massana,04,7211,42.55,1.5166667
        assertEquals(1, actual.size());

        City actualCity = actual.get(0);
        City expectedCity = new City("ad","la massana","04",7211,42.55,1.5166667);

        compareCities(expectedCity, actualCity);

    }

}
