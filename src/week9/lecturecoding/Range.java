package week9.lecturecoding;

import week5.LinkedListNode;

public class Range {

    /**
     * Generates a linked list containing all the values from 1 to n
     *
     * @param n the ending number of the list
     * @return A list containing the values 1 to n. If n is < 1, returns null
     */
    public static LinkedListNode<Integer> range(int n) {
        if (n < 1) {
            return null;
        } else if (n == 1) {
            return new LinkedListNode<>(1, null);
        } else {
            return new LinkedListNode<>(n, range(n - 1));
        }
    }


}




