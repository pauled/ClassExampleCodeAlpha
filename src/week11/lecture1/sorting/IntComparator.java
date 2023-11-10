package week11.lecture1.sorting;

public interface IntComparator extends Comparator<Integer> {

    @Override
    boolean compare(Integer a, Integer b);

}
