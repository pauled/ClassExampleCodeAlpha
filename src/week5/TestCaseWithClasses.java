package week5;

import org.junit.Test;
import week2.FirstRecursion;
import week2.PlusMinus;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class TestCaseWithClasses {


    @Test
    public void testAddition(){
        ArrayList<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(2,2,4));
        testCases.add(new TestCase(-5,2,-3));
        testCases.add(new TestCase(10,-10,0));
        
        for(TestCase testCase : testCases){
            int expectedOutput = testCase.getExpectedOutput();
            int computedOutput = FirstRecursion.add(testCase.getInput1(), testCase.getInput2());
            assertTrue( testCase.getInput1() +" + " + testCase.getInput2()+ " = " +expectedOutput + " but add returned: " + computedOutput, expectedOutput == computedOutput);
        }

    }
}
