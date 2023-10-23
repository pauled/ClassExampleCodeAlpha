package week9.lecturecoding;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class SimpleMathTests {

    @Test
    public void testFactorialCommon() {
        HashMap<Integer, Integer> testCases = new HashMap<>();

        testCases.put(8, 40320);
        testCases.put(9, 362880);
        testCases.put(1, 1);
        testCases.put(2, 2);
        testCases.put(3, 6);
        testCases.put(4, 24);
        testCases.put(5, 120);
        testCases.put(6, 720);
        testCases.put(7, 5040);

        for (int input : testCases.keySet()) {
            int expectedOutput = testCases.getOrDefault(input, -1);
            int actual = SimpleMath.factorial(input);
            assertEquals(expectedOutput, actual);
        }
    }

    @Test
    public void testFactorialUncommon() {
        HashMap<Integer, Integer> testCases = new HashMap<>();
        testCases.put(10, 3628800);
        testCases.put(11, 39916800);
        testCases.put(12, 479001600);

        for (int input : testCases.keySet()) {
            int expectedOutput = testCases.getOrDefault(input, -1);
            int actual = SimpleMath.factorial(input);
            assertEquals(expectedOutput, actual);
        }
    }

    @Test
    public void testFactorialEdgeCases() {
        HashMap<Integer, Integer> testCases = new HashMap<>();
        testCases.put(0, 1);
        testCases.put(-1, -1);
        testCases.put(-2, -1);
        testCases.put(-12, -1);
        testCases.put(-13, -1);
        testCases.put(-2000, -1);
        testCases.put(-10000000, -1);
        testCases.put(Integer.MIN_VALUE, -1);

        for (int input : testCases.keySet()) {
            int expectedOutput = testCases.getOrDefault(input, -1);
            int actual = SimpleMath.factorial(input);
            assertEquals(expectedOutput, actual);
        }
    }

    @Test
    public void testMultiply() {
        ArrayList<MultiplyTestCase> testCases = new ArrayList<>(Arrays.asList(
                new MultiplyTestCase(1, 1, 1),
                new MultiplyTestCase(10, 5, 50),
                new MultiplyTestCase(100, 100, 10000),
                new MultiplyTestCase(-5, -6, 30),
                new MultiplyTestCase(-4, 50, -200),
                new MultiplyTestCase(12, -4, -48),
                new MultiplyTestCase(0, 20, 0),
                new MultiplyTestCase(10, 0, 0),
                new MultiplyTestCase(0, 0, 0),
                new MultiplyTestCase(-5500, 0, 0),
                new MultiplyTestCase(0, -1111, 0)
        ));

        for (MultiplyTestCase testCase : testCases) {
            int inputOne = testCase.getInputOne();
            int inputTwo = testCase.getInputTwo();
            int expectedOutput = testCase.getExpectedOutput();

            int actual = SimpleMath.multiplyInt(inputOne, inputTwo);
            assertEquals(expectedOutput, actual);
        }
    }


}
