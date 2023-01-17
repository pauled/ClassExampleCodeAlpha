package module1;

public class Arrays1 {
    public static String toPrint(double[] arrIn){
        String out="[";
        for (int x=0;x<arrIn.length;x++){
            out+=" "+arrIn[x];
        }
        out+="]";
        return out;
    }
    public static void main(String[] args) {
        double arr1[]=new double[5];
        for (int x=0;x<arr1.length;x++){
            arr1[x]=x;
        }
        arr1[3]=13;
        System.out.println(toPrint(arr1));
    }
}
