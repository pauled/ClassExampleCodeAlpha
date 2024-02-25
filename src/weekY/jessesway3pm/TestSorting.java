package weekY.jessesway3pm;

import org.junit.Test;
import week7.InsertionSort;

import java.util.*;

import static org.junit.Assert.*;

public class TestSorting {

    private static final int N = 1000;

    public ArrayList<Double> randomList(int numberOfElements) {
        ArrayList<Double> numbers = new ArrayList<>(numberOfElements);
        for (int i = 0; i < numberOfElements; i++) {
            numbers.add((Math.random() - 0.5) * 200.0);
        }
        return numbers;
    }

    private void checkIfSorted(List<Double> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            assertTrue(numbers.get(i+1) >= numbers.get(i));
        }
    }

    @Test
    public void testInsertionSort() {
        InsertionSort<Double> sorter = new InsertionSort<>(new DoubleIncreasing());
        ArrayList<Double> numbers = randomList(N);
//        System.out.println(numbers);
        List<Double> sortedNumbers = sorter.sort(numbers);
//        System.out.println(sortedNumbers);

        assertEquals(N, sortedNumbers.size());

        checkIfSorted(sortedNumbers);
    }

    @Test
    public void testMergeSort() {
        MergeSort<Double> sorter = new MergeSort<>(new DoubleIncreasing());
        ArrayList<Double> numbers = randomList(N);
//        System.out.println(numbers);
        List<Double> sortedNumbers = sorter.sort(numbers);
//        System.out.println(sortedNumbers);

        assertEquals(N, sortedNumbers.size());

        checkIfSorted(sortedNumbers);
    }

    @Test
    public void testJavaSort() {
        ArrayList<Double> numbers = randomList(N);
//        System.out.println(numbers);
        Collections.sort(numbers);
//        System.out.println(sortedNumbers);

        assertEquals(N, numbers.size());

        checkIfSorted(numbers);
    }

}
