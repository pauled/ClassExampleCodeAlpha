package week11.lecture1.sorting;

public class IntDecreasing implements IntComparator {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a > b;
    }

}
