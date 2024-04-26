package weekY.lecture.sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TestSorting {

    private ArrayList<Double> generateList(int n) {
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(Math.round(10000.0 * Math.random())/100.0);
        }
        return numbers;
    }

    @Test
    public void sortingTests() {
        List<Double> unsorted = generateList(500);
        List<Double> expected = new ArrayList<>(unsorted);

        Collections.sort(expected);

        List<Double> actualInsertionSort = new InsertionSort<>(new IntIncreasing()).sort(unsorted);
        List<Double> actualMergeSort = new MergeSort<>(new IntIncreasing()).sort(unsorted);

        assertEquals(actualInsertionSort.size(), actualMergeSort.size());

        for (int i = 0; i < actualInsertionSort.size(); i++) {
            assertEquals(actualInsertionSort.get(i), actualMergeSort.get(i), 0.0001);
        }

        System.out.println(actualMergeSort);

    }

}
