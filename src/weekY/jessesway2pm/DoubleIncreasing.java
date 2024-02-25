package weekY.jessesway2pm;

import week7.Comparator;

public class DoubleIncreasing extends Comparator<Double> {

    @Override
    public boolean compare(Double d1, Double d2){
        return d1 < d2;
    }

}
