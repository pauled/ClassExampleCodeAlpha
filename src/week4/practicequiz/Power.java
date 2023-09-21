package week4.practicequiz;

public class Power{
    private int num;

    public Power(int num){
        this.num = num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int power(int num){
        int out = this.num;
        for(int x = 1; x < num; x++){
            out *= this.num;
        }
        return out;
    }

    public static void main(String[] args){
        Power p1 = new Power(10);
        int val2 = p1.power(-6);
        int val = p1.power(3);
        Power p2 = p1;
        p2.setNum(18);
    }
}