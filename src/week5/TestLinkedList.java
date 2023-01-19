package week5;

import org.junit.Test;
import week4.LinkedListNode;

import static org.junit.Assert.assertTrue;

public class TestLinkedList {

    public LinkedListNode<Integer> firstNSquares(int n){
        if(n==0){
            return null;
        }else{
            return firstNSquaresHelper(n, null);
        }
    }

    private LinkedListNode<Integer> firstNSquaresHelper(int n, LinkedListNode<Integer> list){
        if(n==1){
            return new LinkedListNode<>(1, list);
        }else{
            return firstNSquaresHelper(n-1,new LinkedListNode<>(n*n, list));
        }
    }

    public <T> void compareLinkedLists(LinkedListNode<T> l1, LinkedListNode<T> l2) {
        if(!(l1 == null && l2 == null)){
            assertTrue("l1 was null, but l2 was not", l1 != null);
            assertTrue("l2 was null, but l1 was not", l2 != null);
            assertTrue("node values are not equal", l1.getValue().equals(l2.getValue()));
            compareLinkedLists(l1.getNext(), l2.getNext());
        }
    }

    @Test
    public void testLinkedLists() {
        LinkedListNode<Integer> expected = new LinkedListNode<>(9, null);
        expected = new LinkedListNode<>(4, expected);
        expected = new LinkedListNode<>(1, expected);

        LinkedListNode<Integer> computed = firstNSquares(3);
        compareLinkedLists(expected, computed);
    }
}
