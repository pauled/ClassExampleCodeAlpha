package weekY.jessesway1pm;

import week6.Comparator;

public class DoubleIncreasing extends Comparator<Double> {

    @Override
    public boolean compare(Double a, Double b) {
        return a < b;
    }
}
