package weekY.lecture.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MergeSort<T> {

    private final Comparator<T> comparator;

    public MergeSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public List<T> sort(List<T> input) {
        if (input.size() <= 1) {
            return input;
        } else {
            int midPoint = input.size() / 2;

            List<T> left = input.subList(0, midPoint);
            List<T> right = input.subList(midPoint, input.size());

            List<T> leftSorted = this.sort(left);
            List<T> rightSorted = this.sort(right);

            return merge(leftSorted, rightSorted);
        }
    }

    private List<T> merge(List<T> left, List<T> right) {
        List<T> output = new ArrayList<>();

        int leftPointer = 0;
        int rightPointer = 0;

        while (leftPointer < left.size() && rightPointer < right.size()) {
            if (this.comparator.compare(left.get(leftPointer), right.get(rightPointer))) {
                output.add(left.get(leftPointer));
                leftPointer++;
            } else {
                output.add(right.get(rightPointer));
                rightPointer++;
            }
        }

        while (leftPointer < left.size()) {
            output.add(left.get(leftPointer));
            leftPointer++;
        }

        while (rightPointer < right.size()) {
            output.add(right.get(rightPointer));
            rightPointer++;
        }

        return output;
    }

}
