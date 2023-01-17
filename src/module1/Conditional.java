package module1;

public class Conditional {
    public static String computeSize(double input){
        double large=60.0;
        double medium=30.0;

        if (input>=large){
            return "large";
        } else if (input>=medium){
            return "medium";
        } else {
            return "small";
        }
    }
    public static void main(String[] args) {
        System.out.println(computeSize(70.0));
        System.out.println(computeSize(50.0));
        System.out.println(computeSize(10.0));
    }
}
