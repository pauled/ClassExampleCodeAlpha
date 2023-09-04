package week8;

import week6.Comparator;
import week6.IntDecreasing;
import week6.IntIncreasing;

public class BST<A> {

    private BinaryTreeNode<A> root;
    private Comparator<A> comparator;

    public BST(Comparator<A> comparator) {
        this.comparator = comparator;
        this.root = null;
    }

    public BinaryTreeNode<A> getRoot() {
        return this.root;
    }

    public void insert(A value) {
        if (this.root == null) {
            this.root = new BinaryTreeNode<>(value, null, null);
        } else {
            this.insertHelper(this.root, value);
        }
    }

    private void insertHelper(BinaryTreeNode<A> node, A toInsert) {
        if (this.comparator.compare(toInsert, node.getValue())) {
            if (node.getLeft() == null) {
                node.setLeft(new BinaryTreeNode<>(toInsert, null, null));
            } else {
                insertHelper(node.getLeft(), toInsert);
            }
        } else {
            // ties go right
            if (node.getRight() == null) {
                node.setRight(new BinaryTreeNode<>(toInsert, null, null));
            } else {
                insertHelper(node.getRight(), toInsert);
            }
        }
    }

    public boolean find(A value) {
        if (this.root == null) {
            return false;
        } else {
            return findHelper(this.root, value);
        }
    }

    private boolean findHelper(BinaryTreeNode<A> node, A toFind) {
        if (this.comparator.compare(toFind, node.getValue())) {
            if (node.getLeft() == null) {
                return false;
            } else {
                return findHelper(node.getLeft(), toFind);
            }
        } else if (this.comparator.compare(node.getValue(), toFind)) {
            if (node.getRight() == null) {
                return false;
            } else {
                return findHelper(node.getRight(), toFind);
            }
        } else {
            return true;
        }
    }

    private static void example1() {
        BST<Integer> bst = new BST<>(new IntDecreasing());

        bst.insert(2);
        bst.insert(5);
        bst.insert(-10);
        bst.insert(4);
        bst.insert(20);
        bst.insert(0);
        bst.insert(2);

        System.out.println(bst.find(4));
        System.out.println(bst.find(2));
        System.out.println(bst.find(7));

        System.out.println(bst.root.inOrderTraversal(bst.root));
    }

    private static void example2() {
        BST<Integer> bst = new BST<>(new IntIncreasing());

        bst.insert(5);
        bst.insert(2);
        bst.insert(8);
        bst.insert(-3);
        bst.insert(4);
        bst.insert(7);
        bst.insert(14);

        System.out.println(bst.find(7));
        System.out.println(bst.find(8));
        System.out.println(bst.find(3));

        System.out.println(bst.root.inOrderTraversal(bst.root));
    }

    private static void example3() {
        BST<Integer> bst = new BST<>(new IntIncreasing());

        bst.insert(-3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(5);
        bst.insert(7);
        bst.insert(8);
        bst.insert(14);

        System.out.println(bst.find(7));
        System.out.println(bst.find(8));
        System.out.println(bst.find(3));

        System.out.println(bst.root.inOrderTraversal(bst.root));
    }

    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

}
