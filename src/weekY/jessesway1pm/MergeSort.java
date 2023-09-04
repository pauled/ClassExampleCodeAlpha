package weekY.jessesway1pm;

import week6.Comparator;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T> {

    private Comparator<T> comparator;

    public MergeSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public List<T> sort(List<T> things){
        if(things.size() <= 1){
            return things;
        }else{
            int midIndex = things.size()/2;
            List<T> left = things.subList(0, midIndex);
            List<T> right = things.subList(midIndex, things.size());

            List<T> leftSorted = this.sort(left);
            List<T> rightSorted = this.sort(right);

            return this.merge(leftSorted, rightSorted);
        }
    }

    private List<T> merge(List<T> left, List<T> right){
        int leftIndex = 0;
        int rightIndex = 0;
        List<T> output = new ArrayList<>(left.size() + right.size());

        while(((leftIndex < left.size()) && (rightIndex < right.size()))) {
            if (this.comparator.compare(left.get(leftIndex), right.get(rightIndex))) {
                // left comes first
                output.add(left.get(leftIndex));
                leftIndex++;
            } else {
                // right comes first (or a tie)
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
