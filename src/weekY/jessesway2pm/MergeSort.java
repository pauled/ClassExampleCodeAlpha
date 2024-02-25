package weekY.jessesway2pm;

import week7.Comparator;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T> {

    private final Comparator<T> comparator;

    public MergeSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public List<T> sort(List<T> input){
        if(input.size() <= 1){
            return input;
        }else{
            int midIndex = input.size()/2;
            List<T> left = input.subList(0, midIndex);
            List<T> right = input.subList(midIndex, input.size());

            List<T> leftSorted = this.sort(left);
            List<T> rightSorted = this.sort(right);

            return merge(leftSorted, rightSorted);
        }
    }

    private List<T> merge(List<T> left, List<T> right){
        List<T> output = new ArrayList<>(left.size() + right.size());
        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex < left.size() && rightIndex < right.size()) {
            if (this.comparator.compare(left.get(leftIndex), right.get(rightIndex))) {
                // left goes first
                output.add(left.get(leftIndex));
                leftIndex++;
            } else {
                // right goes first (or a tie)
                output.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        while(leftIndex < left.size()){
            output.add(left.get(leftIndex));
            leftIndex++;
        }
        while(rightIndex < right.size()){
            output.add(right.get(rightIndex));
            rightIndex++;
        }

        return output;
    }
}
