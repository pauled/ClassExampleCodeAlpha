package week3.lab.oldexamples;

public class Example1 {

    public static double method(double number){
        double result = number + 2.5;
        while(result < 10.0){
            result += result;
        }
        if(result > 12.0){
            double increase = 20.0;
            result += increase;
        }
        return result;
    }

    public static void main(String[] args) {
        double number = 5.0;
        double result = method(number);
        System.out.println(result);
    }

}
