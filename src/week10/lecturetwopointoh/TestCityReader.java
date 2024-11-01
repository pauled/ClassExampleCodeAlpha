package week10.lecturetwopointoh;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCityReader {

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

        assertEquals(expectedCity.getCountryCode(), actualCity.getCountryCode());
    }

}
