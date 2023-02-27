package week4;

public class LinkedListOfDoubles2 {

    private LinkedListNode2<Double> numbers = null;
    public LinkedListOfDoubles2(){}

    public void addDouble(double d){
        if(this.numbers == null){
            this.numbers = new LinkedListNode2<>(d, null);
        }else {
            this.numbers = new LinkedListNode2<>(d, this.numbers);
        }
    }

    public double min(){
        if(this.numbers == null){
            return -1.0;
        }else {
            return minHelper(this.numbers, Integer.MAX_VALUE);
        }
    }

    private double minHelper(LinkedListNode2<Double> node, double min){
        if(node == null){
            return min;
        }else{
            if(node.value < min){
                return minHelper(node.next, node.value);
            }else{
                return minHelper(node.next, min);
            }
        }
    }

}
