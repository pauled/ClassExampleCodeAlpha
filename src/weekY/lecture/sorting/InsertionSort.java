package weekY.lecture.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort<T> {

    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> comparator){
        this.comparator = comparator;
    }

    public List<T> sort(List<T> input) {

        List<T> output = new ArrayList<>();

        for (T valueToInsert : input) {
            int location = 0;
            for (T valueToCompare : output) {
                if (comparator.compare(valueToCompare, valueToInsert)) {
                    location++;
                }
            }
            output.add(location, valueToInsert);
        }

        return output;
    }


}
