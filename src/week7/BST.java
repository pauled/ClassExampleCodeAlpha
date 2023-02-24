package week7;

import week6.Comparator;
import week6.IntDecreasing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
        if (node.getValue().equals(toFind)) {
            return true;
        } else {
            if (this.comparator.compare(toFind, node.getValue())) {
                if (node.getLeft() == null) {
                    return false;
                } else {
                    return findHelper(node.getLeft(), toFind);
                }
            } else {
                if (node.getRight() == null) {
                    return false;
                } else {
                    return findHelper(node.getRight(), toFind);
                }
            }

        }
    }

    public static void main(String[] args) {
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

}
