package week10.dspracticequizzes;

public class SecretVideo {

    public LinkedListNode<String> search;

    public SecretVideo(LinkedListNode<String> search) {
        this.search = search;
    }

    public String createMessage(LinkedListNode<String> node) {
        String message = "";
        if (node.getNext() != null) {
            message += this.createMessage(node.getNext());
        } else {
            return message;
        }
        return message + node.getValue();
    }

    public static void main(String[] args) {
        LinkedListNode<String> word1 = new LinkedListNode<>(" Final", null);
        LinkedListNode<String> word2 = new LinkedListNode<>("Search", null);
        LinkedListNode<String> word3 = new LinkedListNode<>("CSE116", null);
        LinkedListNode<String> word4 = new LinkedListNode<>(" Lecture", null);
        word4.setNext(word1);
        word1.setNext(word3);
        word3.setNext(word2);
        SecretVideo youtube = new SecretVideo(word4);
        String decode = youtube.createMessage(word4);
        System.out.println(decode);
    }
}
