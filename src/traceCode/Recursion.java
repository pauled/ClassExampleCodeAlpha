package traceCode;

public class Recursion {
    public static int computeGeometricSum(int n){
        if (n>0){
            int result=computeGeometricSum(n-1);
            result+=n;
            return result;
        } else {
            return 0;
        }
    }

    public static int computeGeometricSumTail(int n,int total){
        if (n>0){
            int result=computeGeometricSumTail(n-1,total);
            result+=n;
            return result;
        } else {
            return 0;
        }
    }
    public static int cGSTHelper(int n){
        return computeGeometricSumTail(n,0);
    }

    public static void main(String[] args) {
        int result=cGSTHelper(4);
        System.out.println(result);
    }
}
