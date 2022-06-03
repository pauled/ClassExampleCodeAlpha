package Module1;

public class firstRecursion {
    public static int computeGeometricSum(int n){
        if (n>0){
            int result=computeGeometricSum(n-1);
            result+=n;
            return result;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result=computeGeometricSum(3);
        System.out.println(result);
    }
}
