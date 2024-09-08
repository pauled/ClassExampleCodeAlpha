package week3.lab;

import java.util.HashMap;

public class Practice2 {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apple", 3);
        items.put("Banana", 6);
        items.put("Orange", 5);

        for (String fruit : items.keySet()) {
            int quantity = items.get(fruit);

            if (quantity > 5) {
                System.out.println(fruit + " has more than 5 items");
            } else {
                System.out.println(fruit + " has 5 or fewer items");
            }
        }
        int quantity = 10;
        System.out.println("This is a new variable: " + quantity);
    }
}
