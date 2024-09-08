package week3.lab;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {

    public static boolean isEven(int i){
        return i % 2 == 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 2, 3));
        int sum = 0;
        int print = 999;
        int i = 0;

        while (i < numbers.size()) {
            int theNumber = numbers.get(i);
            sum += theNumber;
            boolean result = isEven(theNumber);
            if (result) {
                print = theNumber;
                System.out.println(print + " is even");
            } else {
                print = theNumber;
                System.out.println(print + " is odd");
            }
            i++;
        }

        System.out.println("Total sum: " + sum);
        System.out.println("just a number: " + print);
    }
}
