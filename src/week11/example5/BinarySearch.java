package week11.example5;

import java.util.ArrayList;

public class BinarySearch {

    /**
     * Assumes the input ArrayList is sorted. Returns true if the value to find is in the
     * data structure, false otherwise
     */
    public static boolean binarySearch(ArrayList<Integer> sortedNumbers, int toFind) {
        int midpoint = sortedNumbers.size() / 2;
        int midValue = sortedNumbers.get(midpoint);
        if (midpoint == toFind) {
            return true;
        } else if (toFind < midValue) {
            sortedNumbers.removeAll(sortedNumbers.subList(midpoint, sortedNumbers.size() - 1));
            binarySearch(sortedNumbers, toFind);
        } else {
            sortedNumbers.removeAll(sortedNumbers.subList(0, midpoint + 1));
            binarySearch(sortedNumbers, toFind);
        }
        return false;
    }

}
