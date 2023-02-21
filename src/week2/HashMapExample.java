package week2;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> bills = new HashMap<>();

        bills.put("Allen", 17);
        bills.put("Diggs", 14);
        System.out.print("What is Allen's number? ");
        System.out.println(bills.get("Allen"));
        System.out.println(bills);
        for (String key : bills.keySet()) {
            System.out.println(key);
        }
        for (Integer value : bills.values()) {
            System.out.println(value);
        }
        for (String key : bills.keySet()) {
            int value = bills.get(key);
            System.out.print(key + "'s number is: ");
            System.out.println(value);
        }
    }
}
