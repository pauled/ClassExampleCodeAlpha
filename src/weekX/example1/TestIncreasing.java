package weekX.example1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TestIncreasing {

    @Test
    public void testIncreasing() {
        HashMap<ArrayList<Integer>, Boolean> testCases = new HashMap<>();
        testCases.put(new ArrayList<>(Arrays.asList(1, 2, 3)), true);
        testCases.put(new ArrayList<>(Arrays.asList(-1, 0, 1)), true);
        testCases.put(new ArrayList<>(Arrays.asList(-10000, -100, -55, -10, -1, 0, 1, 5, 34, 89, 100, 9999999)), true);
        testCases.put(new ArrayList<>(Arrays.asList(-10000, -100, -55, -10, 1, 0, 5, 34, 89, 100, 9999999)), false);
        testCases.put(new ArrayList<>(Arrays.asList(3, 2, 1)), false);
        testCases.put(new ArrayList<>(Arrays.asList(1, 2, 2, 3)), false);
        testCases.put(new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)), false);
        testCases.put(new ArrayList<>(Arrays.asList()), true);
        testCases.put(new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6)), false);
        testCases.put(new ArrayList<>(Arrays.asList(0, 0, 0, 1, 2, 3)), false);
        testCases.put(new ArrayList<>(Arrays.asList(1)), true);
        testCases.put(new ArrayList<>(Arrays.asList(-100, -1000)), false);
        testCases.put(new ArrayList<>(Arrays.asList(1000, 100)), false);
        testCases.put(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 0)), false);
        testCases.put(new ArrayList<>(Arrays.asList(1000000000, 1, 2, 3, 4, 5, 6, 7, 8)), false);
        testCases.put(null, false);

        for (ArrayList<Integer> input : testCases.keySet()) {
            boolean actual = IncreasingCheck.isIncreasing(input);
            boolean expected = testCases.get(input);
            assertEquals(expected, actual);
        }
    }

}
