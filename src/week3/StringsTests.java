package week3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringsTests {

    @Test
    public void testStringsBadExample() {
        // never use == to compare Strings
        String a = "hello";
        String b = "goodbye";
        assertTrue(Strings.combineStrings(a, b) == "hello goodbye");
    }

    @Test
    public void testStringsGoodExample() {
        String a = "hello";
        String b = "goodbye";
        assertTrue(Strings.combineStrings(a, b).equals("hello goodbye"));
    }

    @Test
    public void testStringsBetterExample() {
        String a = "hello";
        String b = "goodbye";
        assertEquals(Strings.combineStrings(a, b), "hello goodbye");
    }


}
