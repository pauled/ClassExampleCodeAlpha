package week10.lecture;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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

    private void comparePopulationMaps(HashMap<String, Integer> expected, HashMap<String, Integer> actual){
        assertEquals(expected.size(), actual.size());

        for(String countryCode: expected.keySet()){
            assertTrue(actual.containsKey(countryCode));
            int actualPopulation = actual.get(countryCode);
            int expectedPopulation = expected.get(countryCode);
            assertEquals(expectedPopulation, actualPopulation);
        }
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

    @Test
    public void testCitiesPopulation0(){
        String filename = "data/test_city_0.csv";
        HashMap<String, Integer> actual = CountryReader.countryPopulations(filename);

        HashMap<String, Integer> expected = new HashMap<>();

        comparePopulationMaps(expected, actual);
    }

    @Test
    public void testCitiesPopulation1(){
        String filename = "data/test_city_1.csv";
        HashMap<String, Integer> actual = CountryReader.countryPopulations(filename);

        // ad,la massana,04,7211,42.55,1.5166667

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("ad", 7211);

        comparePopulationMaps(expected, actual);
    }

    @Test
    public void testCitiesPopulation2(){
        String filename = "data/test_city_2.csv";
        HashMap<String, Integer> actual = CountryReader.countryPopulations(filename);
//pt,margaride,17,10652,41.368292,-8.2
//pt,marinha grande,13,28915,39.747691,-8.932284
//pt,marinhais,18,5788,39.047297,-8.702358
//pt,marinhas,04,6052,41.559059,-8.782972

//ro,butimanu,43,2335,44.683333,25.9
//ro,butoiesti,26,3438,44.583333,23.366667
//ro,buturugeni,42,4078,44.365278,25.835278

//us,brighton,NY,35844,43.1475,-77.5508333
//us,buffalo,NY,279557,42.8863889,-78.8786111
//us,canandaigua,NY,11655,42.8741667,-77.2883333

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("pt", 51407);
        expected.put("ro", 9851);
        expected.put("us", 327056);

        comparePopulationMaps(expected, actual);
    }

}
