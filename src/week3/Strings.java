package week3;

public class Strings {

    public static String combineStrings(String a, String b) {
        return a + " " + b;
    }

    // Returns the longer of the two input Strings. If the inputs
    // are the same length, return the empty String
    public static String longerString(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else if (b.length() > a.length()) {
            return b;
        } else {
            return "";
        }
    }

}
