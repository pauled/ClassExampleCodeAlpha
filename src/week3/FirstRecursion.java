package week3;

public class FirstRecursion {

    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        } else if (b > 0) {
            return add(a+1, b-1);
        } else {
            return add(a-1, b+1);
        }
    }

    public static int computeGeometricSum(int n) {
        if (n > 0) {
            int result = computeGeometricSum(n - 1);
            result += n;
            return result;
        } else {
            return 0;
        }
    }


    public static int factorial(int num) {
        if (num == 1) {
            return num;
        } else if (num <= 0) {
            System.out.println("invalid input");
            return -1;
        } else {
            return num * factorial(num-1);
        }
    }

    public static void main(String[] args) {
        int result = add(3, 4);
        System.out.println(result);
        int result2 = factorial(4);
        System.out.println(result2);
    }
}
