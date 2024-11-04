package week10.dspracticequizzes;

import java.util.HashMap;


public class Grocery {

    private HashMap<String, Double> stock;

    public Grocery(HashMap<String, Double> stock){
        this.stock =stock;
    }

    public double sumItems(LinkedListNode<String> list){
        double sum = 0;
        if (this.stock.containsKey(list.getValue())) {
            sum += stock.get(list.getValue());
        }
        if (list.getNext() != null){
            sum += this.sumItems(list.getNext());
        }
        return sum;
    }

    public static void main (String[] args){
        HashMap<String, Double> groceryStock = new HashMap<String, Double>();
        groceryStock.put("garlic", 0.79);
        groceryStock.put("eggs", 3.00);
        groceryStock.put("potatoes", 4.00);
        groceryStock.put("ramen", 5.00);
        Grocery store = new Grocery(groceryStock);
        LinkedListNode<String> item1 = new LinkedListNode<String>("potatoes", null);
        LinkedListNode<String> item2 = new LinkedListNode<String>("ramen", item1);
        LinkedListNode<String> item3 = new LinkedListNode<String>("garlic", item2);
        double total = store.sumItems(item3);
        System.out.println("Your total is " + total);
    }
}
