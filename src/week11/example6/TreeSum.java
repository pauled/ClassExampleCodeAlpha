package week11.example6;

public class TreeSum {

    /**
     * Returns the sum of all the values in the binary tree
     */
    public static double sum(BinaryTreeNode<Double> tree) {
        if (tree.getLeft() == null && tree.getRight() == null) {
            return tree.getValue();
        } else {
            double sumOfLeft = sum(tree.getLeft());
            double sumOfRight = sum(tree.getRight());
            return sumOfLeft + tree.getValue() + sumOfRight;
        }
    }

    public static void main(String[] args) {

    }
}
