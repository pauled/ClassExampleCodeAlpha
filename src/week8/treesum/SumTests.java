package week8.treesum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import week8.BinaryTreeNode;


public class SumTests {

    @Test
    public void testTreeSum() {
        BinaryTreeNode<Thingamabob> testTree = new BinaryTreeNode<>(new Thingamabob(8.0, ""), null, null);
        testTree.setLeft(new BinaryTreeNode<>(new Thingamabob(-4.5, ""), null, null));
        testTree.setRight(new BinaryTreeNode<>(new Thingamabob(1000.111, ""), null, null));

        double result = TreeSum.treeSum(testTree);
        double expected = 1003.611;

        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testTreeSum2() {
        BinaryTreeNode<Thingamabob> testTree = new BinaryTreeNode<>(new Thingamabob(0.0, ""), null, null);
        testTree.setLeft(new BinaryTreeNode<>(new Thingamabob(99.5, ""), null, null));
        testTree.setRight(new BinaryTreeNode<>(new Thingamabob(100.0, ""), null, null));
        testTree.getLeft().setRight(new BinaryTreeNode<>(new Thingamabob(5.6, ""), null, null));
        testTree.getRight().setLeft(new BinaryTreeNode<>(new Thingamabob(-1.4, ""), null, null));
        testTree.getRight().getLeft().setLeft(new BinaryTreeNode<>(new Thingamabob(-1000.9, ""), null, null));

        double result = TreeSum.treeSum(testTree);
        double expected = -797.2;

        assertEquals(expected, result, 0.0001);
    }


    @Test
    public void testTreeSum3() {
        BinaryTreeNode<Thingamabob> testTree = new BinaryTreeNode<>(new Thingamabob(8.0, ""), null, null);

        double result = TreeSum.treeSum(testTree);
        double expected = 8.0;

        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testTreeSum4() {
        BinaryTreeNode<Thingamabob> testTree = new BinaryTreeNode<>(new Thingamabob(0.0, ""), null, null);

        double result = TreeSum.treeSum(testTree);
        double expected = 0.0;

        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testTreeSum5() {
        BinaryTreeNode<Thingamabob> testTree = null;

        double result = TreeSum.treeSum(testTree);
        double expected = 0.0;

        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testTreeSum6() {
        BinaryTreeNode<Thingamabob> testTree = new BinaryTreeNode<>(
                new Thingamabob(1.0, ""), new BinaryTreeNode<>(
                new Thingamabob(2.0, ""), new BinaryTreeNode<>(
                new Thingamabob(3.0, ""), new BinaryTreeNode<>(
                new Thingamabob(4.0, ""), null, null), null
        ), null
        ), null
        );

        double result = TreeSum.treeSum(testTree);
        double expected = 10.0;

        assertEquals(expected, result, 0.0001);
    }


}
