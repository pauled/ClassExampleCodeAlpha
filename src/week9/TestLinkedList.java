package week9;

import org.junit.Test;
import week5.LinkedListNode;

import static org.junit.Assert.*;

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
            LinkedListNode<Integer> temp=new LinkedListNode<>(n*n, list);
            return firstNSquaresHelper(n-1,temp);
        }
    }

    public <T> void compareLinkedLists(LinkedListNode<T> l1, LinkedListNode<T> l2) {
        if(!(l1 == null && l2 == null)){
            assertTrue("l1 was null, but l2 was not", l1 != null);
            assertTrue("l2 was null, but l1 was not", l2 != null);
            assertEquals("node values are not equal",l1.getValue(),l2.getValue());
            compareLinkedLists(l1.getNext(), l2.getNext());
        }
    }

    private void compareLinkedListsOfStringsIgnoreCase(LinkedListNode<String> expected, LinkedListNode<String> actual){
        if(expected == null){
            assertNull(actual);
        }else{
            assertNotNull(actual);
            assertTrue(expected.getValue().equalsIgnoreCase(actual.getValue()));
            compareLinkedListsOfStringsIgnoreCase(expected.getNext(), actual.getNext());
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

    @Test
    public void testLinkedListOfStringsIgnoringCase() {
        LinkedListNode<String> actual = null;
        // empty list
        actual = new LinkedListNode<>("Red", null);
        // "Red"
        actual.append("GREEN");
        // "Red" -> "GREEN"
        actual.append("BLue");
        // "Red" -> "GREEN" -> "BLue"
        actual.append("cyan");
        // "Red" -> "GREEN" -> "BLue" -> "cyan"

        assertEquals(4, actual.size());
        assertEquals("Red GREEN BLue cyan", actual.toString());

        LinkedListNode<String> expected = new LinkedListNode<>("cyan", null);
        // "cyan"
        expected = new LinkedListNode<>("blue", expected);
        // "blue" -> "cyan"
        expected = new LinkedListNode<>("green", expected);
        // "green" -> "blue" -> "cyan"
        expected = new LinkedListNode<>("red", expected);
        // "red" -> "green" -> "blue" -> "cyan"

        compareLinkedListsOfStringsIgnoreCase(expected, actual);
    }
}
