package week1;

public class VariablesFunctions {
    public static double multiplyByTwo(double input) {
        double x = input * 2;
        return x;
    }

    public static void why(int val) {
        System.out.println("I return nothing");
    }

    public static void main(String[] args) {
        System.out.println("I can print!");
        int num = 4;
        double num2 = 2.4;
        String str1 = "A string";
        int num3 = 6 / 4;
        boolean bool = true;
        System.out.println("I am num3: " + num3);
        num2 = multiplyByTwo(num2);
        System.out.println("new num2: " + num2);
        why(2);
    }

}
