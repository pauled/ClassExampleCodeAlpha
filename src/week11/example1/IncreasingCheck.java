package week11.example1;

import java.util.ArrayList;

public class IncreasingCheck {

    /**
     * Checks if the input ArrayList contains ints in strictly increasing order
     */
    public static boolean isIncreasing(ArrayList<Integer> numbers) {
        for (int i = 1; i < numbers.size() - 1; i++) {
            int first = numbers.get(i - 1);
            int second = numbers.get(i);
            if (first > second) {
                return false;
            }
        }
        return true;
    }

}
