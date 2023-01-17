package traceCode;

public class ArrayStuff2 {
    public static void multiplyArray(int input,int[] arrayIn){
        for (int index=0;index<arrayIn.length;index++){
            arrayIn[index]*=input;
        }
    }
    public static void main(String[] args) {
        int[] ar={1,2,3};
        multiplyArray(2,ar);

        for (int i=1;i<5;i++){
            System.out.println("i == "+i);
        }

        for (int i=1;i<5;i++){
            int temp=i+2;
        }
    }
}
