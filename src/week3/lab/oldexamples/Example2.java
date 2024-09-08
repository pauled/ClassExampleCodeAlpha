package week3.lab.oldexamples;

public class Example2 {

    public static int method1(int number) {
        int result = method2(number);
        result -= 2;
        return result;
    }

    public static int method2(int number) {
        int result = method3(number);
        result /= 2;
        return result;
    }

    public static int method3(int number) {
        int result = number * 3;
        return result;
    }

    public static void main(String[] args) {
        int number = 1;
        int result = method1(number);
        System.out.println(result);
    }

}
