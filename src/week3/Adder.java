package week3;

public class Adder {

    public static int addFive(int x) {
        return x + 5;
    }

    public static int addFive_noNegatives(int x) {
        return Math.abs(x) + 5;
    }

    public static int addFive_badOnZero(int x) {
        if(x > 0){
            return Math.abs(x) + 5;
        }else if(x < 0){
            return -Math.abs(x) + 5;
        }else{
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(addFive(2));
        System.out.println(addFive(5));
        System.out.println(addFive(1));
    }

}
