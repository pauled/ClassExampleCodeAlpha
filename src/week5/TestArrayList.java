package week5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestArrayList {

    public void compareArrayLists(ArrayList<Integer> expected, ArrayList<Integer> computed){
        assertEquals(expected.size(),computed.size());
        for(int i=0; i<expected.size(); i++){
            assertEquals("Values are different at index: " + i,expected.get(i),computed.get(i));
        }
    }

    @Test
    public void testArrayList(){
        int n = 3;
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> computedOutput = DataStructureMethods.oneToN(n);

        compareArrayLists(expectedOutput, computedOutput);
    }

    @Test
    public void testArrayList2(){
        int n = 6;
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> computedOutput = DataStructureMethods.oneToN(n);

        compareArrayLists(expectedOutput, computedOutput);
    }

}
