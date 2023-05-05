package week13.jessesway1pm;

import org.junit.Test;
import week6.InsertionSort;

import java.util.*;

import static org.junit.Assert.*;

public class TestSorting {

    private final int numberOfElements = 10000000;

    private ArrayList<Double> generateList(int n){
        ArrayList<Double> numbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            numbers.add((Math.random() - 0.5) * 200.0);
        }
        return numbers;
    }

    private void checkIfSorted(List<Double> numbers){
        for(int i = 0; i < numbers.size()-1; i++){
            assertTrue(numbers.get(i+1) >= numbers.get(i));
        }
    }


//    @Test
//    public void testInsertionSort() {
//        InsertionSort<Double> sorter = new InsertionSort<>(new DoubleIncreasing());
//
//        ArrayList<Double> numbers = generateList(this.numberOfElements);
////        System.out.println(numbers);
//        ArrayList<Double> sorted = sorter.sort(numbers);
////        System.out.println(sorted);
//
//        assertEquals(this.numberOfElements, sorted.size());
//        checkIfSorted(sorted);
//    }

    @Test
    public void testMergeSortSort() {
        MergeSort<Double> sorter = new MergeSort<>(new DoubleIncreasing());

        ArrayList<Double> numbers = generateList(this.numberOfElements);
//        System.out.println(numbers);
        List<Double> sorted = sorter.sort(numbers);
//        System.out.println(sorted);

        assertEquals(this.numberOfElements, sorted.size());
        checkIfSorted(sorted);
    }

    @Test
    public void testJavaSort() {
        ArrayList<Double> numbers = generateList(this.numberOfElements);
        Collections.sort(numbers);

        assertEquals(this.numberOfElements, numbers.size());
        checkIfSorted(numbers);
    }

}
