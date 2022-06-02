package Module1;

public class LinkedListNode<T> {
    private T value;
    private LinkedListNode next;

    public LinkedListNode(T val, LinkedListNode next){
        this.value=val;
        this.next=next;
    }
    public T getValue(){
        return this.value;
    }
    public LinkedListNode<T> getNext(){
        return this.next;
    }
    public int size(){
        if (this.next==null){
            return 1;
        } else {
            return 1+this.next.size();
        }
    }
    public String toString(){
        String out=this.value.toString();
        if (this.next==null){
            return out;
        } else {
            return out+" "+this.next.toString();
        }
    }
    public LinkedListNode<T> getElement(T value){
        if (this.value.equals(value)){
            return this;
        } else if (this.next==null){
            return null;
        } else {
            return this.next.getElement(value);
        }
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> first=new LinkedListNode<>(1,null);
        first=new LinkedListNode<>(2,first);
    }
}
