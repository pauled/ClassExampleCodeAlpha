package week1;

public class PlusMinus {
    public static String letter(int score){
        int tens=score/10;
        if (tens>=9){
            return "A";
        } else if(tens>=8){
            return "B";
        } else if(tens>=7){
            return "C";
        } else if(tens>=6){
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(letter(98));
        System.out.println(letter(75));
        System.out.println(letter(30));
    }
}
