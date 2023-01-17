package module1;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> bills=new HashMap<>();

        bills.put("Allen",17);
        bills.put("Diggs",14);
        System.out.println("what is Allen's number? "+bills.get("Allen"));
        System.out.println(bills);
        for (String keys : bills.keySet()){
            System.out.println(keys);
        }
        for (Integer values: bills.values()){
            System.out.println(values);
        }
        for (String keys : bills.keySet()){
            int value=bills.get(keys);
            System.out.println(keys+"'s number is: "+value);
        }
    }
}
