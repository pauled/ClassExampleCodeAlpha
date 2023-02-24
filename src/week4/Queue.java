package week4;

import week4.LinkedListNode;

public class Queue<A> {
    private LinkedListNode<A> front;
    private LinkedListNode<A> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(A value) {
        if (this.back == null) {
            this.back = new LinkedListNode<>(value, null);
            this.front = this.back;
        } else {
            this.back.setNext(new LinkedListNode<>(value, null));
            this.back = this.back.getNext();
        }
    }

    public A dequeue() {
        if (this.front == null) {
            return null;
        }else {
            A toReturn = this.front.getValue();
            this.front = this.front.getNext();
            if (this.front == null) {
                this.back = null;
            }
            return toReturn;
        }
    }

    public String toString() {
        if(this.front == null){
            return "";
        }else {
            return this.front.toString();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        int x = queue.dequeue();
        System.out.println(x);
        System.out.println(queue);
    }
}
