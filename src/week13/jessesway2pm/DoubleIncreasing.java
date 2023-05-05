package week13.jessesway2pm;

import week6.Comparator;

public class DoubleIncreasing extends Comparator<Double> {

    @Override
    public boolean compare(Double d1, Double d2){
        return d1 < d2;
    }

}
