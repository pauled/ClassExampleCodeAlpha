package week5;

import java.util.ArrayList;

public class DataStructureMethods {

    public static ArrayList<Integer> oneToN(int n){
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=1; i<=n; i++){
            output.add(i);
        }
        return output;
    }

}
