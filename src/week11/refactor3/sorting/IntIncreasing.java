package week11.refactor3.sorting;

public class IntIncreasing implements Comparator<Integer> {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a < b;
    }
}
