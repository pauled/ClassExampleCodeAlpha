package week11.lecture2.sorting;

import week11.lecture1.sorting.Comparator;

public class IntIncreasing extends Comparator<Integer> {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a < b;
    }
}
