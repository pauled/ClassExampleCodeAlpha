package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public static <T> ArrayList<T> insertionSort(ArrayList<T> input, Comparator<T> comparator) {

        ArrayList<T> output = new ArrayList<>();

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


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 1));
        ArrayList<Integer> output = insertionSort(list, new IntDecreasing());
        System.out.println(output);
    }

}
