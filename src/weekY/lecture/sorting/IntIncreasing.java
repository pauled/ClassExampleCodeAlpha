package weekY.lecture.sorting;


public class IntIncreasing implements Comparator<Double> {


    @Override
    public boolean compare(Double a, Double b) {
        return a < b;
    }
}
