package Module1;

public class LinkedListNodeInt {
    private int value;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(int val, LinkedListNodeInt next){
        this.value=val;
        this.next=next;
    }

    public static void main(String[] args) {
        LinkedListNodeInt first=new LinkedListNodeInt(1,null);
        first=new LinkedListNodeInt(2,first);
    }
}
