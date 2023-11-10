package week11.lecture1.sorting;

public class IntDecreasing extends Comparator<Integer> {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a > b;
    }
}
