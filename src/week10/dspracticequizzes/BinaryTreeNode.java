package week10.dspracticequizzes;

public class BinaryTreeNode {
    private String word;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(String word, BinaryTreeNode left, BinaryTreeNode right){
        this.word = word;
        this.left = left;
        this.right = right;
    }

    public String spookyMessage(String word){
        String out = word;
        if (this.left != null){
            out = this.left.spookyMessage(out);
        }
        if (this.right != null){
            out = this.right.spookyMessage(out);
        }
        out += " " + this.word;
        return out;
    }

    public static void main(String[] args){
        BinaryTreeNode m1 = new BinaryTreeNode("Scary", null, null);
        BinaryTreeNode m2 = new BinaryTreeNode("Love", null, null);
        BinaryTreeNode m3 = new BinaryTreeNode("Skeletons", null, m1);
        BinaryTreeNode m4 = new BinaryTreeNode("Halloween", m3, m2);
        String message = m4.spookyMessage("Spooky");
        System.out.println(message);
    }
}
