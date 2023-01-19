package week5;

import org.junit.Test;
import week2.PlusMinus;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class TestWithHashMap {
    @Test
    public void testPlusMinus(){
        HashMap<Integer, String> testCases = new HashMap<>();
        testCases.put(95, "");
        testCases.put(78, "+");
        testCases.put(51, "-");
        testCases.put(100, "+");

        for(int grade : testCases.keySet()){
            String expectedOutput = testCases.get(grade);
            String computedOutput = PlusMinus.pm(grade);
            assertTrue(grade + " should return " + expectedOutput + " but got: " + computedOutput, expectedOutput.equals(computedOutput));
        }

    }
}
