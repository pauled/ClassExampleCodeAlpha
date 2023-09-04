package week5;

public class LinkedListOfDoubles {

    private LinkedListNode<Double> numbers = null;
    public LinkedListOfDoubles(){}

    public void addDouble(double d){
        if(this.numbers == null){
            this.numbers = new LinkedListNode<>(d, null);
        }else {
            this.numbers = new LinkedListNode<>(d,this.numbers);
        }
    }

    public double min(){
        if(this.numbers == null){
            return -1.0;
        }else {
            return minHelper(this.numbers, Integer.MAX_VALUE);
        }
    }

    private double minHelper(LinkedListNode<Double> node, double min){
        if(node == null){
            return min;
        }else{
            if(node.getValue() < min){
                return minHelper(node.getNext(), node.getValue());
            }else{
                return minHelper(node.getNext(), min);
            }
        }
    }

}
