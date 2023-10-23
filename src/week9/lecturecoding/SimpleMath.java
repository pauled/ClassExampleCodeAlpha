package week9.lecturecoding;

public class SimpleMath {

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int multiplyInt(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        boolean xNegative = x < 0;
        boolean yNegative = y < 0;
        int result = multiplyHelper(Math.abs(x), Math.abs(y));
        if (xNegative ^ yNegative) {
            return -1 * result;
        } else {
            return result;
        }
    }

    private static int multiplyHelper(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x + multiplyHelper(x, y - 1);
        }
    }
}
