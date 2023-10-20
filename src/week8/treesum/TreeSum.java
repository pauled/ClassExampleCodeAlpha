package week8.treesum;

import week8.BinaryTreeNode;

public class TreeSum {

    /**
     * Returns the sum of all the values in the tree
     *
     * @param tree the root node of the tree
     * @return the sum of all values in the given tree
     */
    public static double treeSum(BinaryTreeNode<Thingamabob> tree) {
        if (tree == null) {
            return 0.0;
        } else {
            double leftResult = treeSum(tree.getLeft());
            double rightResult = treeSum(tree.getRight());
            double nodeValue = tree.getValue().getTheNumber();
            return leftResult + rightResult + nodeValue;

        }
    }

}
