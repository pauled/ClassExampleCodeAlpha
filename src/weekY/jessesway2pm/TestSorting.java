package weekY.jessesway2pm;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TestSorting {

    private static final int NUMBER_OF_ELEMENTS = 1000;

    private ArrayList<Double> randomList(int n){
        ArrayList<Double> numbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            numbers.add((Math.random()-0.5)*200.0);
        }
        return numbers;
    }

    private void checkIfSorted(List<Double> numbers){
        for(int i=0; i < numbers.size() - 1; i++){
            assertTrue(numbers.get(i+1) >= numbers.get(i));
        }
    }

//    @Test
//    public void testInsertionSort() {
//        InsertionSort<Double> sorter = new InsertionSort<>(new DoubleIncreasing());
//
//        ArrayList<Double> numbers = randomList(NUMBER_OF_ELEMENTS);
////        System.out.println(numbers);
//        List<Double> sortedNumbers = sorter.sort(numbers);
////        System.out.println(sortedNumbers);
//
//        assertEquals(NUMBER_OF_ELEMENTS, sortedNumbers.size());
//
//        checkIfSorted(sortedNumbers);
//    }

    @Test
    public void testMergeSort() {
        MergeSort<Double> sorter = new MergeSort<>(new DoubleIncreasing());

        ArrayList<Double> numbers = randomList(NUMBER_OF_ELEMENTS);
//        System.out.println(numbers);
        List<Double> sortedNumbers = sorter.sort(numbers);
//        System.out.println(sortedNumbers);

        assertEquals(NUMBER_OF_ELEMENTS, sortedNumbers.size());

        checkIfSorted(sortedNumbers);
    }

    @Test
    public void testJavaSort() {
        MergeSort<Double> sorter = new MergeSort<>(new DoubleIncreasing());

        ArrayList<Double> numbers = randomList(NUMBER_OF_ELEMENTS);
//        System.out.println(numbers);

        Collections.sort(numbers);
//        System.out.println(sortedNumbers);

        assertEquals(NUMBER_OF_ELEMENTS, numbers.size());

        checkIfSorted(numbers);
    }
}
